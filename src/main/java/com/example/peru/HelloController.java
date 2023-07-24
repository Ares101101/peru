package com.example.peru;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloController {


    @FXML
    private Label   ClickMeLabel;

    @FXML
    protected void onClickButtonClick() {
        ClickMeLabel.setText("123456");
    }
    @FXML
    private void openSubWindow() {
        // Crear una nueva instancia de Stage para la subventana
        Stage subWindow = new Stage();

        // Crear el contenido de la subventana (en este caso, solo un botón)
        Button btnClose = new Button("Cerrar Subventana");
        btnClose.setOnAction(e -> subWindow.close());

        StackPane subRoot = new StackPane(btnClose);
        Scene subScene = new Scene(subRoot, 200, 150);
        subWindow.setTitle("Subventana");
        subWindow.setScene(subScene);

        // Mostrar la subventana
        subWindow.show();
    }
}