package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Calculator extends Application
{
    public void start(Stage stage)
    {
        GridPane grid = new GridPane();    
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        TextField tf1= new TextField();
        TextField tf2= new TextField();
        TextField tf3= new TextField();
        Label l1 = new Label("First Number: ");
        Label l2 = new Label("Second Number: ");
        Label l3 = new Label("Result: ");
        Button sum = new Button("+");
        Button min = new Button("-");
        Button mult = new Button("*");
        Button div = new Button("/");
        HBox h =new HBox(sum,min,mult,div);
        h.setSpacing(10);
        
        grid.addRow(0, l1,tf1);
        grid.addRow(1, l2,tf2);
        grid.addRow(2, l3,tf3);
        grid.addRow(3, h);

        sum.setOnAction(e -> 
        {
            double x1 = Integer.parseInt(tf1.getText());
            double x2 = Integer.parseInt(tf2.getText());
            tf3.setText(x1+x2+"");

        });

        min.setOnAction(e -> 
        {
            double x1 = Integer.parseInt(tf1.getText());
            double x2 = Integer.parseInt(tf2.getText());
            tf3.setText(x1-x2+"");

        });

        mult.setOnAction(e -> 
        {
            double x1 = Integer.parseInt(tf1.getText());
            double x2 = Integer.parseInt(tf2.getText());
            tf3.setText(x1*x2+"");

        });

        div.setOnAction(e -> 
        {
            double x1 = Integer.parseInt(tf1.getText());
            double x2 = Integer.parseInt(tf2.getText());
            tf3.setText(x1/x2+"");

        });

        Scene scene = new Scene(grid,500,400);
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.show();
    }
    public static void main(String args[])
    {
        launch(args);
    }
}