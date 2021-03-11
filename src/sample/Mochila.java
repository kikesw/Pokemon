package sample;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Mochila {

    @FXML
    ImageView pocion1;
    @FXML
    ImageView pocion2;
    @FXML
    ImageView pocion3;
    @FXML
    ImageView pocion4;

    public void baya(MouseEvent mouseEvent) {
        pocion1.setStyle("-fx-background-color: #2DBC36;");
    }
}
