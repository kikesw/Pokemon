package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;

public class Controller {


    @FXML
    AnchorPane Torterra;
    @FXML
    AnchorPane Darkrai;
    @FXML
    AnchorPane Garchomp;
    @FXML
    AnchorPane Groudon;
    @FXML
    AnchorPane Kyurem;
    @FXML
    AnchorPane Swampert;
    @FXML
    Button Salida;
    @FXML
    Button mochila;
    @FXML
    Button cancelacion;

    public void limpio(){
        Torterra.setStyle("-fx-background-color:  #4DC694;");
        Darkrai.setStyle("-fx-background-color:  #4DC694;");
        Garchomp.setStyle("-fx-background-color:  #4DC694;");
        Groudon.setStyle("-fx-background-color:  #4DC694;");
        Kyurem.setStyle("-fx-background-color:  #4DC694;");
        Swampert.setStyle("-fx-background-color:  #4DC694;");
    }


    public void click(MouseEvent mouseEvent) {

        limpio();
        Torterra.setStyle("-fx-background-color: #2DBC36;");
    }


    public void click2(MouseEvent mouseEvent) {
        limpio();
        Darkrai.setStyle("-fx-background-color: #2DBC36;");
    }

    public void click3(MouseEvent mouseEvent) {
        limpio();
        Garchomp.setStyle("-fx-background-color: #2DBC36;");
    }

    public void click4(MouseEvent mouseEvent) {
        limpio();
        Groudon.setStyle("-fx-background-color: #2DBC36;");
    }

    public void click5(MouseEvent mouseEvent) {
        limpio();
        Kyurem.setStyle("-fx-background-color: #2DBC36;");
    }

    public void click6(MouseEvent mouseEvent) {
        limpio();
        Swampert.setStyle("-fx-background-color: #2DBC36;");
    }



    public void siguiente(MouseEvent mouseEvent) {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Mochila.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            Scene scene = new Scene(root, 600, 480);
            stage.setScene(scene);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void siguiente2(MouseEvent mouseEvent) {
        mochila.setStyle("-fx-background-color: #2DBC36;");
    }

    public void siguiente3(MouseEvent mouseEvent) {
        mochila.setStyle("-fx-background-color:#4DC694;");
    }

    public void Salir(MouseEvent mouseEvent) {
        System.exit(1);
    }

    public void Salir2(MouseEvent mouseEvent) {
        Salida.setStyle("-fx-background-color: #2DBC36;");
    }

    public void Salir3(MouseEvent mouseEvent) {
        Salida.setStyle("-fx-background-color: #4DC694;");
    }


    public void cancelar(MouseEvent mouseEvent) {
        Torterra.setStyle("-fx-background-color:  #4DC694;");
        Darkrai.setStyle("-fx-background-color:  #4DC694;");
        Garchomp.setStyle("-fx-background-color:  #4DC694;");
        Groudon.setStyle("-fx-background-color:  #4DC694;");
        Kyurem.setStyle("-fx-background-color:  #4DC694;");
        Swampert.setStyle("-fx-background-color:  #4DC694;");
    }

    public void cancelar2(MouseEvent mouseEvent) {
        cancelacion.setStyle("-fx-background-color: #2DBC36;");
    }

    public void cancelar3(MouseEvent mouseEvent) {
        cancelacion.setStyle("-fx-background-color: #4DC694;");
    }
}
