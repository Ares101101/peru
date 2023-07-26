package com.example.peru;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;

public class HelloController {

    @FXML
    private MenuBar panelVenta;
    @FXML
    private Label   ClickMeLabel;

    @FXML
    protected void onClickButtonClick() {
        ClickMeLabel.setText("123456");
    }
    @FXML
    private void openSubWindow() {

    }
    double xOffset, yOffset;
    @FXML
    private void mover(){
        panelVenta.setOnMousePressed(event -> {
            // Guarda la posición inicial del botón cuando se presiona el ratón
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        panelVenta.setOnMouseDragged(event -> {
            // Calcula el desplazamiento desde la posición inicial y ajusta la posición del botón
            double deltaX = event.getSceneX() - xOffset;
            double deltaY = event.getSceneY() - yOffset;
            panelVenta.setLayoutX(panelVenta.getLayoutX() + deltaX);
            panelVenta.setLayoutY(panelVenta.getLayoutY() + deltaY);

            // Actualiza las nuevas coordenadas iniciales para el siguiente evento de arrastre
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });


    }

}