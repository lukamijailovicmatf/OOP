package com.example.jun2_2018_2019_bus_plus.zadatak1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Collections;
import java.util.List;

public class GSPVoziloGUI extends Application {

    // gsp je objekat klase GSPVozilo i nad tim objektom mozemo pozivati sve metode
    // koje su implementirane u klasi GSPVozilo
    private static GSPVozilo gsp = new GSPVozilo();
    private static List<BusPlus> kartice = null;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        VBox koren = new VBox(10);
        koren.setPadding(new Insets(10,10,10,10));

        // HBox gore = TextArea levi + TextArea Desni
        HBox goreHB = new HBox(10);

        // TextArea levi
        TextArea taLevi = new TextArea();
        // podesavanje visine polja
        taLevi.setMinHeight(380);
        // da ne moze da se unosi tekst u polje
        taLevi.setEditable(false);

        // TextArea desni
        TextArea taDesni = new TextArea();
        // podesavanje visine polja
        taDesni.setMinHeight(380);
        // da ne moze da se unosi tekst u polje
        taDesni.setEditable(false);

        goreHB.getChildren().addAll(taLevi, taDesni);

        // HBox dole = VBox doleLevo + VBox doleDesno
        HBox doleHB = new HBox(10);

        // VBox doleLevo = dugme + hBox(dva radio dugmeta) + dugme
        VBox doleLevo = new VBox(10);

        Button btPutnici = new Button("Putnici u vozilu");

        // sada pravimo hBox gde su radio dugmici
        HBox karteHB = new HBox(10);
        RadioButton rbPersonalizovana = new RadioButton("Personalizovana");
        RadioButton rbNepersonalizovana = new RadioButton("Nepersonalizovana");
        ToggleGroup tg = new ToggleGroup();
        rbPersonalizovana.setToggleGroup(tg);
        rbNepersonalizovana.setToggleGroup(tg);

        karteHB.getChildren().addAll(rbPersonalizovana, rbNepersonalizovana);

        Button btNoviPutnik = new Button("Novi putnik");

        doleLevo.getChildren().addAll(btPutnici, karteHB, btNoviPutnik);

        // VBox doleDesno = dugme + dugme
        VBox doleDesno = new VBox(10);

        Button btKontrola = new Button("Kontrola");
        Button btNapustanjeVozila = new Button("Napustanje vozila");

        doleDesno.getChildren().addAll(btKontrola, btNapustanjeVozila);

        doleHB.getChildren().addAll(doleLevo, doleDesno);

        koren.getChildren().addAll(goreHB, doleHB);

        // akcije za dodavanje putnika
        btPutnici.setOnAction(e -> {
            if (gsp == null) {
                taLevi.setText("Vozilo je u kvaru!\n");
                return;
            }

            if (!gsp.putniciUVozilu("putnici.txt")) {
                taLevi.setText("Vozilo trenutno bez putnika!\n");
                return;
            }
            prikaziKartice(taLevi);
        });

        // akcije za novog putnika
        btNoviPutnik.setOnAction(e -> {
            int vrstaKarte;
            if (rbPersonalizovana.isSelected())
                vrstaKarte = 1;
            else
                vrstaKarte = 2;

            BusPlus noviPutnik = gsp.noviPutnik(vrstaKarte);
            taLevi.appendText("Novi putnik u vozilu:\n");
            taLevi.appendText(noviPutnik.toString() + "\n");
        });

        // akcije za kontrolu
        btKontrola.setOnAction(e -> {
            taDesni.appendText("Kontrola:\n");
            taDesni.appendText(gsp.kontrola());
        });

        // akcije za napustanje vozila
        btNapustanjeVozila.setOnAction(e -> {
            if (gsp.izbaciPutnike()) {
                taDesni.appendText("Putnici sa nevalidnim kartama napustili vozilo!\n");
                taDesni.appendText("U vozilu:\n");
                prikaziKartice(taDesni);
            } else {
                taDesni.appendText("Sve kartice su validne!\n");
            }
        });

        Scene scena = new Scene(koren, 600,500);
        stage.setScene(scena);
        stage.setTitle("Gradski prevoz");
        stage.show();
    }

    private void prikaziKartice(TextArea ta) {
        kartice = gsp.getKartice();
        Collections.sort(kartice);

        // prolazimo kolekcijskom petljom kroz listu kartica
        for (BusPlus k: kartice)
            ta.appendText(k.toString() + "\n");
    }
}
