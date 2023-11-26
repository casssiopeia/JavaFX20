package com.example.polyclinic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ChangePatientDataController extends Application {

    private final Stage stage = new Stage();

    @FXML
    private TextArea changeAddressField;

    @FXML
    private TextField changeDateOfBirthField;

    @FXML
    private TextArea changeDiseasesField;

    @FXML
    private TextField changeFirstnameField;

    @FXML
    private TextField changeLastnameField;

    @FXML
    private Button changePatientDataButton;

    @FXML
    private TextField changePhoneField;

    @FXML
    private TextField changeSurnameField;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ChangePatientDataController.class.getResource("changePatientData.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Изменение данных пациента");
        stage.setScene(scene);
        stage.show();
    }

    public void showChangePatientDataWindow() throws IOException {
        start(stage);
    }

    @FXML
    void changePatientDataButtonOnAction(ActionEvent event) {

    }

}
