package main.java.ngntuli.chapter10;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import main.java.ngntuli.chapter07.Oblong;

public class OblongGUI extends Application {

    private final Oblong testOblong = new Oblong(0, 0);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextField lengthField = new TextField();
        lengthField.setMaxWidth(50);

        TextField heightField = new TextField();
        heightField.setMaxWidth(50);

        TextArea display = new TextArea();
        display.setEditable(false);
        display.setMinSize(210, 50);
        display.setMaxSize(210, 50);

        Label lengthLabel = new Label("Length");
        lengthLabel.setTextFill(Color.RED);
        lengthLabel.setFont(Font.font("Arial", 20));

        Label heightLabel = new Label("Height");
        heightLabel.setTextFill(Color.RED);
        heightLabel.setFont(Font.font("Arial", 20));

        Button calculateButton = new Button();
        calculateButton.setText("Calculate");
        calculateButton.setOnAction(e ->
                {
                    if (lengthField.getText().isEmpty() || heightField.getText().isEmpty()) {
                        display.setText("Length and height must be entered");
                    } else {
                        testOblong.setLength(Double.parseDouble(lengthField.getText()));
                        testOblong.setHeight(Double.parseDouble(heightField.getText()));

                        display.setText("The area is: " + testOblong.calculateArea()
                                + "\n" + "The perimeter is: "
                                + testOblong.calculatePerimeter());
                    }
                }
        );

        HBox inputComponents = new HBox(10);
        inputComponents.setAlignment(Pos.CENTER);
        inputComponents.getChildren().addAll(lengthLabel, lengthField, heightLabel, heightField);

        VBox root = new VBox(25);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(inputComponents, calculateButton, display);

        Scene scene = new Scene(root, 350, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Oblong GUI");
        primaryStage.show();
    }
}
