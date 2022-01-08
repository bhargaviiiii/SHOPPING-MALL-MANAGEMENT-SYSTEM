package com.example.shoppingmall;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class HelloApplication extends Application {
    private static Stage stg;

    @Override
    public void start(Stage stage) throws IOException {
        stg = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("selectPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 630, 490);
        stage.setResizable(false);
        stage.setTitle("SHOPPING MALL MANAGEMENT SYSTEM");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void changeScene(String s) throws IOException
    {
        Parent pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(s)));
        stg.getScene().setRoot(pane);
    }



}