/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseHandler.login;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author joonasha
 */
public class LoginLoader extends Application {

    /**
     * Avaa kirjautumissivun fxml -tiedoston.
     * @param primaryStage avattava ikkuna
     * @throws IOException poikkeus
     */    
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml")); //avataankirjautumissivun fxml tiedosto

        Scene scene = new Scene(root);
        

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Käynnistys.
     * @param args Argumentit.
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
