package com.example.juegodelavidafinal.Controllers;

import com.example.juegodelavidafinal.Utilities.Paths;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;


public class BienvenidaControl implements Initializable {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button butcomienza;

    @FXML
    private Label lblcomienzajuego;

    @FXML
    void click(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        File fichero = new File(Paths.PANTALLAINICIO);
        URL url = null;
        try {
            url = fichero.toURL();
        } catch (MalformedURLException ex) {
            throw new RuntimeException(ex);
        }
        fxmlLoader.setLocation(url); // Para encontrar donde esta
        Scene scene = new Scene(fxmlLoader.load(),700,500); //vCarga escena
        stage.setScene(scene);
        PantallaInicioControl p= fxmlLoader.getController();
        p.setStage(stage);
        stage.show();

    }


    @FXML
    void initialize() {
        assert butcomienza != null : "fx:id=\"butcomienza\" was not injected: check your FXML file 'bienvenida.fxml'.";
        assert lblcomienzajuego != null : "fx:id=\"lblcomienzajuego\" was not injected: check your FXML file 'bienvenida.fxml'.";

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void setStage(Stage stage) {
    }
}



