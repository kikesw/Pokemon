package sample;


import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Label;

import java.awt.*;

public class Mochila {

    @FXML
    ImageView pocion1;
    @FXML
    ImageView pocion2;
    @FXML
    ImageView pocion3;
    @FXML
    ImageView pocion4;
    @FXML
    Button regreso;
    @FXML

    double vidaTotal;
    Controller controller;
    int datos;
    ProgressBar bar;
    Label vida;


    public void volver(MouseEvent mouseEvent) {
        Stage stage = (Stage) regreso.getScene().getWindow();
        stage.close();
    }

    public void volver2(MouseEvent mouseEvent) {
        regreso.setStyle("-fx-background-color: #2DBC36;");
    }

    public void volver3(MouseEvent mouseEvent) {
        regreso.setStyle("-fx-background-color: transparent;");
    }

    public void baya(MouseEvent mouseEvent) {
        datos = datos+10;
        vida.setText(String.valueOf(datos));
        double progreso = bar.getProgress();
        double valor = (1000/vidaTotal);
        double accion = progreso+(valor/100);
        bar.setProgress(accion);


    }

    public void superpocion(MouseEvent mouseEvent) {
        datos = datos+20;
        vida.setText(String.valueOf(datos));
        double progreso = bar.getProgress();
        double valor = (2000/vidaTotal);
        double accion = progreso+(valor/100);
        bar.setProgress(accion);
    }

    public void hiperpocion(MouseEvent mouseEvent) {
        datos = datos+((int)(datos*0.1));
        vida.setText(String.valueOf(datos));
    }

    public void Maximapo(MouseEvent mouseEvent) {
        datos = datos+((int)(datos*0.2));
        vida.setText(String.valueOf(datos));
    }

    @FXML
    public void mandarInfoDesdeVentana1(int datos, ProgressBar bar,Label vida, double vidaTotal, Controller controller) {
        this.datos=datos;
        this.bar=bar;
        this.vida=vida;
        this.vidaTotal = vidaTotal;
        this.controller=controller;


    }


}
