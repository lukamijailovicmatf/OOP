package org.example.jan2_2024_aplikacija;

import javafx.application.Application;
import javafx.geometry.Insets;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplikacija extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @java.lang.Override
    public void start(Stage stage) throws Exception {

        VBox koren = new VBox(10);
        koren.setPadding(new Insets(10,10,10,10));

        Label lbIme = new Label("Ime:");
        TextField tfIme = new TextField();

        // hBox1 = dva dugmeta
        HBox hBox1 = new HBox(10);
        hBox1.setPadding(new Insets(10,10,10,10));

        Label lbSuma = new Label();

        // hBox2 = dve text areas
        HBox hBox2 = new HBox(10);
        hBox2.setPadding(new Insets(10,10,10,10));

        koren.getChildren().addAll(lbIme, tfIme, hBox1, lbSuma, hBox2);

        Button btPretrazi = new Button("Pretrazi");
        Button btOcisti = new Button("Ocisti");

        hBox1.getChildren().addAll(btPretrazi, btOcisti);

        TextArea taUcitani = new TextArea();
        taUcitani.setEditable(false);

        TextArea taIspisani = new TextArea();
        taIspisani.setEditable(false);

        hBox2.getChildren().addAll(taUcitani,taIspisani);

        // UCITAVANJE I OBRADA PODATAKA

        // kreiranje putanje do direktorijuma
        Path putanja = Paths.get("Podaci.txt");

        Scanner sc = new Scanner(putanja);

        // lista imena
        List<String> imena = new ArrayList<>();

        // lista brojeva
        List<Integer> brojevi = new ArrayList<>();

        // citamo podatke dok ne dodjemo do kraja datoteke i smestamo ih redom u odgovarajuce liste
        while (sc.hasNext()) {
            String ime = sc.next();
            int broj = sc.nextInt();
            imena.add(ime);
            brojevi.add(broj);
        }

        for (int i = 0; i < imena.size(); i++) {
            taUcitani.appendText(imena.get(i) + " " + brojevi.get(i) + "\n");
        }

        // btPretrazi akcije
        btPretrazi.setOnAction(e -> {
            int suma = 0;
            String ime = tfIme.getText();
            for (int i = 0; i < imena.size(); i++) {
                if (imena.get(i).equals(ime)) {
                    suma = suma + brojevi.get(i);
                    taIspisani.appendText(imena.get(i) + " " + brojevi.get(i) + "\n");
                }
            }
            lbSuma.setText("Suma: " + suma);
        });

        // btOcisti akcije
        btOcisti.setOnAction(e -> {
            tfIme.clear();
            lbSuma.setText("");
            taIspisani.clear();
        });

        Scene scena = new Scene(koren,400,300);
        stage.setScene(scena);
        stage.setTitle("Pretraga");
        stage.show();
    }
}
