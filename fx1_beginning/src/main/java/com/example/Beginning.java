package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Beginning extends Application
{
    public void start(Stage stage)
    {
        Text text = new Text(); //text example
        text.setText("Hello , Welcome to GUI");

        StackPane root = new StackPane();
        Scene scene = new Scene(root,300,400);

        root.getChildren().add(text);
        
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[])
    {
        launch(args);
    }
}