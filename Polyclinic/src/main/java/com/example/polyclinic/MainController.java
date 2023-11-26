package com.example.polyclinic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    private Button systemButton;

    @FXML
    void systemButtonOnAction(ActionEvent event) throws IOException {
        EntranceController enter = new EntranceController();
        enter.showEntranceWindow();
        final Node node = (Node) event.getSource();
        final Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
    }

}
