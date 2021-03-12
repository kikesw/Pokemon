package sample;

import com.sun.prism.Image;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Pokedex {
    
    @FXML
    Button favorito;


    Label vida;
    int datos;
    Image imagen;
    Controller descripcion;


    @FXML
    public void mandardetalles(int datos, Label vida, Image imagen, Controller descripcion) {
        this.datos=datos;
        this.vida=vida;
        this.imagen= imagen;
        this.descripcion=descripcion;
         /*
        vida.setText(pokemon.Vida);
        imagen.setImage();
        descripcion.setText(pokemon.descripcion);

        Carlos no me da tiempo a poner
        todas las cosas asique te expico los datos que ya eh pasado
        los pondria en la pokedex con esto
        */

    }


    public void fav(MouseEvent mouseEvent) {

    }
}
