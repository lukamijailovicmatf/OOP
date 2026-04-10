package org.example.jan1_2024_grupa2_ceo.zadatak3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Aplikacija extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        String rec;
        Scanner ulaz = new Scanner(System.in);
        rec = ulaz.next();
        char slovo = rec.charAt(0);

        VBox koren = new VBox(10);
        koren.setPadding(new Insets(10,10,10,10));

        Label lbUnela = new Label("Ana je unela rec na slovo " + slovo);

        Label lbZamislila = new Label("Ana je zamislila neku od sledecih reci:");

        TextArea taUnos = new TextArea();
        taUnos.setEditable(false);

        // hBox1 = labela + text polje
        HBox hBox1 = new HBox(10);

        // hBox2 = labela + text polje
        HBox hBox2 = new HBox(10);

        Label lbSkrivena = new Label();

        // vBox = 3 dugmeta
        VBox vBox = new VBox(10);
        vBox.setAlignment(Pos.CENTER);

        TextArea taPrikazi = new TextArea();
        taPrikazi.setEditable(false);

        koren.getChildren().addAll(lbUnela, lbZamislila, taUnos, hBox1, hBox2, lbSkrivena, vBox, taPrikazi);

        Label lbIme = new Label("Ime takmicara:");
        TextField tfIme = new TextField();
        hBox1.getChildren().addAll(lbIme, tfIme);

        Label lbRec = new Label("Unesite rec:");
        TextField tfRec = new TextField();
        hBox2.getChildren().addAll(lbRec, tfRec);

        Button btPotvrdi = new Button("Potvrdi");
        Button btOcisti = new Button("Ocisti");
        Button btPrikazi = new Button("Prikazi");
        vBox.getChildren().addAll(btPotvrdi, btOcisti, btPrikazi);

        // UNOS I OBRADA PODATAKA

        // ucitavanje iz datoteke - pravimo putanju
        Path putanja = Paths.get("ZamisljeneReci.txt");

        // otvaranje skenera nad datotekom
        Scanner sc = new Scanner(putanja);

        String n;
        String pomocna = null;
        while (sc.hasNextLine()) {
            n = sc.nextLine();
            if (n.charAt(0) == slovo) {
                pomocna = n;
            }
        }
        assert pomocna != null;
        n = pomocna.replace(" ", "\n");
        taUnos.appendText(n);

        // pravimo listu za imena
        List<String> imena = new LinkedList<>();
        imena.add("Marko");
        imena.add("Marija");
        imena.add("Nikola");

        // pravimo listu za bodove
        List<Integer> bodovi = new LinkedList<>();
        bodovi.add(0);
        bodovi.add(0);
        bodovi.add(0);

        // btPotvrdi
        btPotvrdi.setOnAction(e -> {
            if (tfRec.getText().equals(rec)) {
                for (int i = 0; i < imena.size(); i++) {
                    if (tfIme.getText().equals(imena.get(i))) {
                        bodovi.set(i, bodovi.get(i) + 10);
                    }
                }
                lbSkrivena.setText("Cestitamo, pogodili ste Aninu rec! :)");
            } else {
                for (int i = 0; i < imena.size(); i++) {
                    if (tfIme.getText().equals(imena.get(i))) {
                        bodovi.set(i, bodovi.get(i) - 3);
                    }
                }
                lbSkrivena.setText("Nemate srece :/");
            }
        });

        // btOcisti
        btOcisti.setOnAction(e -> {
            tfIme.clear();
            tfRec.clear();
            lbSkrivena.setText("");
        });

        // btPrikazi
        btPrikazi.setOnAction(e -> {
            for (int i = 0; i < imena.size(); i++) {
                taPrikazi.appendText(imena.get(i) + ": " + bodovi.get(i) + "\n");
            }
        });

        Scene scena = new Scene(koren,450,500);
        stage.setScene(scena);
        stage.setTitle("Na slovo, na slovo");
        stage.show();
    }
}
