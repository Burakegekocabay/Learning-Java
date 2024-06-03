package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Button_fx extends Application
{
    public void start(Stage stage)
    {
        try 
        {
            StackPane root= new StackPane();

            Button btn= new Button("Say : Hello GUI");
            btn.setOnAction 
            (e -> {
                System.out.println("Hello GUI");
            } );
            root.getChildren().add(btn);


            Scene scene = new Scene(root,200,200);
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) 
        {
            
        }
    }
    public static void main(String args[])
    {
        launch(args);
    }
}