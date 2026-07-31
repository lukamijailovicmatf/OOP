package org.example.jan1_2024_grupa2.zadatak3;

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
        Scanner sc = new Scanner(System.in);
        rec = sc.next();
        char slovo = rec.charAt(0);

        VBox koren = new VBox(10);
        koren.setPadding(new Insets(10,10,10,10));

        // labela za unesenu rec
        Label lbUnela = new Label("Ana je zamislila rec na slovo " + slovo);

        // labela za zamisljenu rec
        Label lbZamislila = new Label("Ana je zamislila neku od sledecih reci:");

        // text area za ucitane reci
        TextArea taUnos = new TextArea();

        // hBox1 = labela + text polje
        HBox hBox1 = new HBox(10);

        // hBox2 = labela + text polje
        HBox hBox2 = new HBox(10);

        // skrivena labela
        Label lbSkrivena = new Label("");

        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(10,10,10,10));
        vBox.setAlignment(Pos.CENTER);

        // tri dugmeta
        Button btPotvrdi = new Button("Potvrdi");

        Button btOcisti = new Button("Ocisti");

        Button btPrikazi = new Button("Prikazi");

        vBox.getChildren().addAll(btPotvrdi, btOcisti, btPrikazi);

        // text area za prikaz
        TextArea taPrikazi = new TextArea();
        taPrikazi.setEditable(false);

        koren.getChildren().addAll(lbUnela, lbZamislila, taUnos, hBox1, hBox2, lbSkrivena, vBox, taPrikazi);

        // labela za ime takmicara
        Label lbIme = new Label("Ime takmicara:");

        // text polje za ime takmicara
        TextField tfIme = new TextField();

        hBox1.getChildren().addAll(lbIme, tfIme);

        // labela za rec
        Label lbRec = new Label("Unesite rec:");

        // text polje za rec
        TextField tfRec = new TextField();

        hBox2.getChildren().addAll(lbRec, tfRec);

        // ucitavanje iz datoteke
        Path putanja = Paths.get("ZamisljeneReci.txt");
        Scanner sc1 = new Scanner(putanja);
        String n = null;
        String pomocna = null;
        while (sc1.hasNextLine()) {
            n = sc1.nextLine();
            if (n.charAt(0) == slovo) {
                pomocna = n;
            }
        }
        assert pomocna != null;
        n = pomocna.replace(" ", "\n");
        taUnos.setText(n);

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
