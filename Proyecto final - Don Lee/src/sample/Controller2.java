package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class Controller2 {
    @FXML
    Button agregar1;
    @FXML
    Button agregar2;
    @FXML
    Button agregar3;
    @FXML
    Button agregar4;
    @FXML
    Button agregar5;
    @FXML
    Button agregar6;


    public void agregar1(ActionEvent actionEvent) {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Pilla tu pedido!");
        alerta.setContentText("Pedido en proceso");
        alerta.setHeaderText("Su precio a pagar: 7.95");
        Optional<ButtonType> resultado = alerta.showAndWait();
    }

    public void agregar2(ActionEvent actionEvent) {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Pilla tu pedido!");
        alerta.setContentText("Pedido en proceso");
        alerta.setHeaderText("Su precio a pagar: 7.85");
        Optional<ButtonType> resultado = alerta.showAndWait();
    }

    public void agregar3(ActionEvent actionEvent) {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Pilla tu pedido!");
        alerta.setContentText("Pedido en proceso");
        alerta.setHeaderText("Su precio a pagar: 8.05");
        Optional<ButtonType> resultado = alerta.showAndWait();
    }

    public void agregar4(ActionEvent actionEvent) {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Pilla tu pedido!");
        alerta.setContentText("Pedido en proceso");
        alerta.setHeaderText("Su precio a pagar: 7.25");
        Optional<ButtonType> resultado = alerta.showAndWait();
    }


    public void agregar5(ActionEvent actionEvent) {
            Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
            alerta.setTitle("Pilla tu pedido!");
            alerta.setContentText("Pedido en proceso");
            alerta.setHeaderText("Su precio a pagar: 7.65");
            Optional<ButtonType> resultado = alerta.showAndWait();
    }

    public void agregar6(ActionEvent actionEvent) {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Pilla tu pedido!");
        alerta.setContentText("Pedido en proceso");
        alerta.setHeaderText("Su precio a pagar: 6.75");
        Optional<ButtonType> resultado = alerta.showAndWait();
    }
}





