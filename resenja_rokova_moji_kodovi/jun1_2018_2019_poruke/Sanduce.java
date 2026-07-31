package com.example.jun1_2018_2019_poruke.zadatak1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sanduce extends Application {

    private static Korisnik peca = new Korisnik("peca");
    private Path datoteka = Paths.get("poruke.txt");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        // koren = VBox
        VBox koren = new VBox(10);
        koren.setPadding(new Insets(10,10,10,10));

        // VBox = HBox (4 dugmeta) + TextArea + labela + TextField + labela + TextField + labela
        // + TextArea + HBox (dva dugmeta)
        HBox hbGore = new HBox(10);
        TextArea taIspis = new TextArea();
        Label lbPrimalac = new Label("Primalac:");
        TextField tfPrimalac = new TextField();
        Label lbDatum = new Label("Datum:");
        TextField tfDatum = new TextField();
        Label lbPoruka = new Label("Poruka za slanje:");
        TextArea taPoruka = new TextArea();
        HBox hbDole = new HBox(10);
        koren.getChildren().addAll(hbGore, taIspis, lbPrimalac, tfPrimalac, lbDatum, tfDatum, lbPoruka,
                taPoruka, hbDole);

        // hbGore = dugme + radio dugme + radio dugme + dugme
        Button btSvePoruke = new Button("Sve poruke");
        RadioButton rbPoslate = new RadioButton("Poslate");
        RadioButton rbPrimljene = new RadioButton("Primljene");
        ToggleGroup tg = new ToggleGroup();
        rbPoslate.setToggleGroup(tg);
        rbPrimljene.setToggleGroup(tg);
        Button btPrikazi = new Button("Prikazi");
        hbGore.getChildren().addAll(btSvePoruke, rbPoslate, rbPrimljene, btPrikazi);

        // hbDole = dugme + dugme
        Button btPosalji = new Button("Posalji poruku");
        Button btSacuvaj = new Button("Sacuvaj poruke");
        hbDole.getChildren().addAll(btPosalji, btSacuvaj);
        hbGore.setAlignment(Pos.CENTER);

        // akcije za ucitavanje svih poruka
        btSvePoruke.setOnAction(e -> {
            try {
                List<String> linije = Files.readAllLines(datoteka);
                for (String linija: linije)
                    peca.novaPoruka(linija);
                ispisiPorukeSortirano(taIspis);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        // akcije za prikazivanje svih poruka
        btPrikazi.setOnAction(e -> {
            taIspis.clear();
            if (rbPoslate.isSelected()) {
                for (Poruka poruka: peca.getPoruke()) {
                    if (poruka instanceof PoslataPoruka) {
                        taIspis.appendText(poruka.toString());
                    }
                 }
            }

            if (rbPrimljene.isSelected()) {
                for (Poruka poruka: peca.getPoruke()) {
                    if (poruka instanceof PrimljenaPoruka) {
                        taIspis.appendText(poruka.toString());
                    }
                }
            }
        });

        // akcije za nove poruke
        btPosalji.setOnAction(e -> {
            String primalac = tfPrimalac.getText().trim();
            String datum = tfDatum.getText().trim();
            String poruka = taPoruka.getText().trim();

            if (!primalac.isEmpty() && !datum.isEmpty() && !poruka.isEmpty()) {
                PoslataPoruka novaPoruka = new PoslataPoruka(poruka, datum, primalac);
                peca.novaPoruka(novaPoruka.sacuvajPoruku());
                ispisiPorukeSortirano(taIspis);
            }
        });

        // u datoteku poruke.txt se upisuju poruke iz liste instanciranog korisnika u formatu koji se
        // dobija primenom metoda sacuvajPoruku()
        btSacuvaj.setOnAction(e -> {
            // lista String-ova u kojoj se cuvaju poruke koje se posle
            List<String> zaCuvanje = new ArrayList<>();

            for (Poruka poruka: peca.getPoruke())
                zaCuvanje.add(poruka.sacuvajPoruku());

            try {
                Files.write(datoteka, zaCuvanje);
                taIspis.appendText("Poruke uspesno zapisane!");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        Scene scena = new Scene(koren, 500,600);
        stage.setScene(scena);
        stage.setTitle("Sanduce");
        stage.show();
    }

    private static void ispisiPorukeSortirano(TextArea taIspis) {
        Collections.sort(peca.getPoruke());
        taIspis.clear();
        for (Poruka poruka: peca.getPoruke())
            taIspis.appendText(poruka.toString());
    }
}
