package main.java.ngntuli.chapter10;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class TriangleShape extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Line lineOne = new Line();
        lineOne.setStartX(0);
        lineOne.setEndY(-200);

        Line lineTwo = new Line();
        lineTwo.setStartX(0);
        lineTwo.setEndX(250);

        Line lineThree = new Line();
        lineThree.setStartY(-200);
        lineThree.setEndX(250);

        Group lines = new Group(lineOne, lineTwo, lineThree);

        VBox root = new VBox();
        root.setBackground(Background.EMPTY);
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(lines);

        Scene scene = new Scene(root, 350, 350, Color.YELLOW);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Triangle");
        primaryStage.show();
    }
}
