package org.example.week11;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Country API Example");

        TextField countryInput = new TextField();
        countryInput.setPromptText("Enter country name");

        Button fetchButton = new Button("Fetch Country Info");
        TextArea resultArea = new TextArea();
        resultArea.setEditable(false);

        VBox vbox = new VBox(countryInput, fetchButton, resultArea);
        vbox.setSpacing(10);

        fetchButton.setOnAction(e -> fetchCountryData(countryInput.getText(), resultArea));

        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void fetchCountryData(String country, TextArea resultArea) {
        new Thread(() -> {
            try {
                CountryResponse[] response = APIService.fetchCountry(country);
                StringBuilder result = new StringBuilder("Country Information:\n");
                for (CountryResponse res : response) {
                    result.append("Name: ").append(res.getName().getCommon()).append("\n")
                            .append("Capital: ").append(String.join(", ", res.getCapital())).append("\n")
                            .append("Borders: ").append(String.join(", ", res.getBorders())).append("\n")
                            .append("Languages: ").append(String.join(", ", res.getLanguages().values())).append("\n\n");
                }
                Platform.runLater(() -> resultArea.setText(result.toString()));
            } catch (Exception ex) {
                Platform.runLater(() -> resultArea.setText("Failed to fetch data"));
                ex.printStackTrace();
            }
        }).start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
