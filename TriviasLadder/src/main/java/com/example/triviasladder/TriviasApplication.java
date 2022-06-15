package com.example.triviasladder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TriviasApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TriviasApplication.class.getResource("tablero-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700.4, 761.5);
        stage.setTitle("Trivias Ladder!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}