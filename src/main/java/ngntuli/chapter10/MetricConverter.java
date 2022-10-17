package main.java.ngntuli.chapter10;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.text.DecimalFormat;

public class MetricConverter extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        DecimalFormat df = new DecimalFormat("0.0#");

        TextField cmText = new TextField();
        Label cmLabel = new Label("Cm");
        TextField inchText = new TextField();
        Label inchLabel = new Label("Inches");

        Button cmToInchButton = new Button(" ===> ");
        Button inchToCmButton = new Button(" <=== ");

        VBox inchCmButtons = new VBox();
        inchCmButtons.getChildren().addAll(cmToInchButton, inchToCmButton);

        HBox inchCmPanel = new HBox(10);
        inchCmPanel.getChildren().addAll(cmText, cmLabel, inchCmButtons, inchText, inchLabel);
        inchCmPanel.setAlignment(Pos.CENTER);

        TextField kmText = new TextField();
        Label kmLabel = new Label("Km");
        TextField mileText = new TextField();
        Label mileLabel = new Label("Miles  ");

        Button kmToMileButton = new Button(" ===> ");
        Button mileToKmButton = new Button(" <=== ");

        VBox mileKmButtons = new VBox();
        mileKmButtons.getChildren().addAll(kmToMileButton, mileToKmButton);

        HBox mileKmPanel = new HBox(10);
        mileKmPanel.getChildren().addAll(kmText, kmLabel, mileKmButtons, mileText, mileLabel);
        mileKmPanel.setAlignment(Pos.CENTER);

        TextField kgText = new TextField();
        Label kgLabel = new Label("Kg ");
        TextField poundText = new TextField();
        Label poundLabel = new Label("Lb        ");

        Button kgToPoundButton = new Button(" ===> ");
        Button poundToKgButton = new Button(" <=== ");

        VBox poundKgButtons = new VBox();
        poundKgButtons.getChildren().addAll(kgToPoundButton, poundToKgButton);

        HBox poundKgPanel = new HBox(10);
        poundKgPanel.getChildren().addAll(kgText, kgLabel, poundKgButtons, poundText, poundLabel);
        poundKgPanel.setAlignment(Pos.CENTER);

        VBox root = new VBox(10);
        root.getChildren().addAll(inchCmPanel, mileKmPanel, poundKgPanel);
        root.setAlignment(Pos.CENTER);

        cmToInchButton.setOnAction(e -> {
                    String s = cmText.getText();
                    double d = Double.parseDouble(s);
                    d = d / 2.54;
                    s = df.format(d);
                    inchText.setText(s);
                }
        );

        inchToCmButton.setOnAction(e -> {
                    String s = inchText.getText();
                    double d = Double.parseDouble(s);
                    d = d * 2.54;
                    s = df.format(d);
                    cmText.setText(s);
                }
        );

        kmToMileButton.setOnAction(e -> {
                    String s = kmText.getText();
                    double d = Double.parseDouble(s);
                    d = d / 1.609;
                    s = df.format(d);
                    mileText.setText(s);
                }
        );

        mileToKmButton.setOnAction(e -> {
                    String s = mileText.getText();
                    double d = Double.parseDouble(s);
                    d = d * 1.609;
                    s = df.format(d);
                    kmText.setText(s);
                }
        );

        kgToPoundButton.setOnAction(e -> {
                    String s = kgText.getText();
                    double d = Double.parseDouble(s);
                    d = d * 2.2;
                    s = df.format(d);
                    poundText.setText(s);
                }
        );

        poundToKgButton.setOnAction(e -> {
                    String s = poundText.getText();
                    double d = Double.parseDouble(s);
                    d = d / 2.2;
                    s = df.format(d);
                    kgText.setText(s);
                }
        );

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Metric Converter");
        primaryStage.setWidth(500);
        primaryStage.setHeight(250);
        primaryStage.show();
    }
}
