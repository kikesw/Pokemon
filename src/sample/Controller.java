package sample;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

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
    AnchorPane mochila;

    public void limpio(){
        Torterra.setStyle("-fx-background-color: null;");
        Darkrai.setStyle("-fx-background-color: null;");
        Garchomp.setStyle("-fx-background-color: null;");
        Groudon.setStyle("-fx-background-color: null;");
        Kyurem.setStyle("-fx-background-color: null;");
        Swampert.setStyle("-fx-background-color: null;");
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


    public void Mochila(MouseEvent mouseEvent) {
        mochila.setStyle("-fx-background-color: #2DBC36;");
    }
}
