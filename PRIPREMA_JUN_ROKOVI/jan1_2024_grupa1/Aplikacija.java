package org.example.jan1_2024_grupa1.zadatak2;

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

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Aplikacija extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @java.lang.Override
    public void start(Stage stage) throws Exception {

        int broj;
        Scanner sc = new Scanner(System.in);
        broj = sc.nextInt();

        VBox koren = new VBox(10);
        koren.setPadding(new Insets(10,10,10,10));

        // hBox1 = vBoxLevi(dve labele) + vBoxSrednji(dva text polja)
        HBox hBox1 = new HBox(10);

        // hBox2 = dva dugmeta(btDodaj + btKrajUnosa)
        HBox hBox2 = new HBox(10);
        hBox2.setAlignment(Pos.CENTER);

        // skrivena labela
        Label lbSkrivena1 = new Label("");

        // labela za Alas
        Label lbAlas = new Label("Alas");

        // polje za Alas
        TextField tfAlas = new TextField();

        // labela za Broj
        Label lbBroj = new Label("Broj");

        // polje za Broj
        TextField tfBroj = new TextField();

        // dugme Potvrdi
        Button btPotvrdi = new Button("Potvrdi");

        // skrivena labela
        Label lbKsrivena2 = new Label("");

        // dugme Prikazi
        Button btPrikazi = new Button("Prikazi");

        // polje za prikaz podataka
        TextArea taPrikazi = new TextArea();

        koren.getChildren().addAll(hBox1, hBox2, lbSkrivena1, lbAlas, tfAlas, lbBroj, tfBroj, btPotvrdi, lbKsrivena2, btPrikazi, taPrikazi);

        // vBoxLevi
        VBox vBoxLevi = new VBox(10);
        Label lbImeStudenta = new Label("Ime studenta");
        Label lbAlasStudenta = new Label("Alas studenta");
        vBoxLevi.getChildren().addAll(lbImeStudenta, lbAlasStudenta);

        // vBoxSrednji
        VBox vBoxSrednji = new VBox(10);
        TextField tfImeStudenta = new TextField();
        TextField tfAlasStudenta = new TextField();
        vBoxSrednji.getChildren().addAll(tfImeStudenta, tfAlasStudenta);

        hBox1.getChildren().addAll(vBoxLevi, vBoxSrednji);

        Button btDodaj = new Button("Dodaj");
        Button btKrajUnosa = new Button("Kraj unosa");

        hBox2.getChildren().addAll(btDodaj, btKrajUnosa);

        // pravimo tri liste u kojima cemo cuvati podatke o imenu studenta, alasu studenta i bodovima
        List<String> listaIme = new LinkedList<>();
        List<String> listaAlas = new LinkedList<>();
        List<Integer> listaBodovi = new LinkedList<>();

        // btDodaj akcije
        btDodaj.setOnAction(e -> {
            listaIme.add(tfImeStudenta.getText());
            tfImeStudenta.setText("");
            listaAlas.add(tfAlasStudenta.getText());
            tfAlasStudenta.setText("");
            listaBodovi.add(0);
        });

        // btKrajUnosa akcije
        btKrajUnosa.setOnAction(e -> {
            tfImeStudenta.setEditable(false);
            tfAlasStudenta.setEditable(false);
            String prviIme = listaIme.remove(0);
            String prviAlas = listaAlas.remove(0);
            lbSkrivena1.setText("Student " + prviIme + " sa indeksom " + prviAlas + " je zamislio broj");
        });

        // btPotvrdi akcije
        btPotvrdi.setOnAction(e -> {
            String trenutniAlas = tfAlas.getText();
            int unetiBroj = Integer.parseInt(tfBroj.getText());
            if (unetiBroj == broj) {
                lbKsrivena2.setText("Cestitamo, pogodili ste trazeni broj :)");
                listaBodovi.set(listaAlas.indexOf(trenutniAlas), listaBodovi.get(listaAlas.indexOf(trenutniAlas)) + 10);
            } else {
                lbKsrivena2.setText("Nemate srece :/");
                listaBodovi.set(listaAlas.indexOf(trenutniAlas), listaBodovi.get(listaAlas.indexOf(trenutniAlas)) - 3);
            }
        });

        // btPrikazi akcije
        btPrikazi.setOnAction(e -> {
            taPrikazi.clear();
            for (int i = 0; i < listaIme.size(); i++) {
                taPrikazi.appendText(listaIme.get(i) + " " + listaAlas.get(i) + ": " + listaBodovi.get(i) + "\n");
            }
        });

        Scene scena = new Scene(koren,450,500);
        stage.setScene(scena);
        stage.setTitle("Pogodi broj");
        stage.show();
    }
}
