package main.java.ngntuli.chapter10;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ColourChanger extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button buttonBlue = new Button();
        buttonBlue.setText("Set background blue");

        Button buttonRed = new Button();
        buttonRed.setText("Set background red");

        HBox root = new HBox(10);
        root.getChildren().addAll(buttonBlue, buttonRed);
        root.setAlignment(Pos.CENTER);
        root.setBackground(Background.EMPTY);

        Scene scene = new Scene(root);
        buttonBlue.setOnAction(e -> scene.setFill(Color.BLUE));
        buttonRed.setOnAction(e -> scene.setFill(Color.RED));

        primaryStage.setScene(scene);
        primaryStage.setTitle("Colour Changer");
        primaryStage.setHeight(150);
        primaryStage.setWidth(350);
        primaryStage.show();
    }
}
