package com.mycompany.mavenproject3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    static void setRoot(String secondary) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   @Override
   public void start(Stage stage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("fxml_example.fxml"));
       
       Scene scene = new Scene(root, 300, 275);
       
       stage.setTitle("FXML Welcome");
       stage.setScene(scene);
       stage.show();
   }

}