package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginForm extends Application
{
    public void start(Stage stage)
    {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);

        Label username = new Label("Username: ");
        Label password= new Label("Password: ");
        TextField usr= new TextField();
        PasswordField pass=new PasswordField();
        Button login = new Button("Log in");
        Text t = new Text("");
        t.setFont(Font.font(20));
        grid.add(t, 1, 4);

        login.setOnAction(e -> 
        {
            t.setText("Log in succesfull");
            t.setFill(Color.GREEN);
        });

        grid.add(username,0,0);
        grid.add(password,0,2);
        grid.add(usr,1,0);
        grid.add(pass,1,2);
        grid.add(login, 1, 3);
        
        Scene scene = new Scene(grid,400,300);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[])
    {
        launch(args);
    }
}