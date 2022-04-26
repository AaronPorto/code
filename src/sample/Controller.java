package sample;

import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


public class Controller {

    Juego juego = new Juego();
    public Button btNuevoJuego;
    public ImageView amarilla;
    public ImageView azul;
    public GridPane tablero;
    public TextArea txMensaje;

    public void initialize() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button button = new Button();
                button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
                button.setOnAction(this::buttonClic); //asociar método
                tablero.add(button, j, i); // coordenas del layout grid coumna fila
            }
        }

        if (juego.getTurno()==1){
            azul.setVisible(false);
        }else{
            amarilla.setVisible(false);
        }



    }

    private void buttonClic(ActionEvent actionEvent) {
        Button boton = (Button) (actionEvent.getTarget());
        int fila = tablero.getRowIndex(boton);
        int columna = tablero.getColumnIndex(boton);

        if (juego.posicionarFicha(fila, columna)==true){

        }

        asignarImagen_Button( boton);

    }

    public void asignarImagen_Button(Button button){
        Image image = new Image(getClass().getResourceAsStream("../imagenes/ficha"+juego.getTurno()+".png" ), 100, 100, false, false);
        ImageView imageView = new ImageView(image);
        button.setGraphic(imageView);
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
    }


}