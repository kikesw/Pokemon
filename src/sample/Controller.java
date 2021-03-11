package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Controller {


    @FXML
    AnchorPane Torterra,Darkrai,Garchomp,Groudon,Kyurem,Swampert;
    @FXML
    Label pokemon1,pokemon2,pokemon3,pokemon4,pokemon5,pokemon6;
    @FXML
    Label nv1,nv2,nv3,nv4,nv5,nv6;
    @FXML
    Label vidatotal1,vidatotal2,vidatotal3,vidatotal4,vidatotal5,vidatotal6;
    @FXML
    Label cura1,cura2,cura3,cura4,cura5,cura6;
    @FXML
    ProgressBar barra1,barra2,barra3,barra4,barra5,barra6;
    @FXML
    Button Salida,mochila,cancelacion;

    int vidamodificada;
    int llevarDatos;
    ProgressBar llevarbar;
    Label llevarvida;

    Pokemon p1 = new Pokemon(300,74,"Torterra",150);
    Pokemon p2 = new Pokemon(500,92,"Darkrai",250);
    Pokemon p3 = new Pokemon(300,86,"Garchomp",150);
    Pokemon p4 = new Pokemon(600,90,"Groudon",300);
    Pokemon p5 = new Pokemon(500,75,"Kyurem",250);
    Pokemon p6 = new Pokemon(400,81,"Swampert",200);




    @FXML
    public void initialize(){
        estadisticas(p1, pokemon1, nv1,vidatotal1,cura1);
        estadisticas(p2, pokemon2, nv2,vidatotal2,cura2);
        estadisticas(p3, pokemon3, nv3,vidatotal3,cura3);
        estadisticas(p4, pokemon4, nv4,vidatotal4,cura4);
        estadisticas(p5, pokemon5, nv5,vidatotal5,cura5);
        estadisticas(p6, pokemon6, nv6,vidatotal6,cura6);

        //barra1.setProgress(0.8);

    }



    public void estadisticas(Pokemon pokemones, Label nombre, Label nivel, Label vida, Label vidacurada){
        nombre.setText(pokemones.Nombre);
        nivel.setText(String.valueOf(pokemones.Nivel));
        vida.setText(String.valueOf(pokemones.Vida));
        vidacurada.setText(String.valueOf(pokemones.Vidacurada));
    }



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
        llevarDatos = p1.Vidacurada;
        llevarbar = barra1;
        llevarvida = cura1;
        vidamodificada = p1.Vida;
    }


    public void click2(MouseEvent mouseEvent) {
        limpio();
        Darkrai.setStyle("-fx-background-color: #2DBC36;");
        llevarDatos = p2.Vidacurada;
        llevarbar = barra2;
        llevarvida = cura2;
        vidamodificada = p2.Vida;
    }

    public void click3(MouseEvent mouseEvent) {
        limpio();
        Garchomp.setStyle("-fx-background-color: #2DBC36;");
        llevarDatos = p3.Vidacurada;
        llevarbar = barra3;
        llevarvida = cura3;
        vidamodificada = p3.Vida;
    }

    public void click4(MouseEvent mouseEvent) {
        limpio();
        Groudon.setStyle("-fx-background-color: #2DBC36;");
        llevarDatos = p4.Vidacurada;
        llevarbar = barra4;
        llevarvida = cura4;
        vidamodificada = p4.Vida;
    }

    public void click5(MouseEvent mouseEvent) {
        limpio();
        Kyurem.setStyle("-fx-background-color: #2DBC36;");
        llevarDatos = p5.Vidacurada;
        llevarbar = barra5;
        llevarvida = cura5;
        vidamodificada = p5.Vida;
    }

    public void click6(MouseEvent mouseEvent) {
        limpio();
        Swampert.setStyle("-fx-background-color: #2DBC36;");
        llevarDatos = p6.Vidacurada;
        llevarbar = barra6;
        llevarvida = cura6;
        vidamodificada = p6.Vida;
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
            Mochila controllerMochila = loader.getController();
            controllerMochila.mandarInfoDesdeVentana1(llevarDatos,llevarbar,llevarvida,vidamodificada,this);
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
