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

public class AddPatientController extends Application {

    private final Stage stage = new Stage();

    @FXML
    private TextArea enterAddressField;

    @FXML
    private TextField enterDateOfBirthField;

    @FXML
    private TextArea enterDiseasesField;

    @FXML
    private TextField enterFirstnameField;

    @FXML
    private TextField enterLastnameField;

    @FXML
    private Button enterNewPatientButton;

    @FXML
    private TextField enterPhoneField;

    @FXML
    private TextField enterSurnameField;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AddPatientController.class.getResource("addPatient.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Добавить нового пациента");
        stage.setScene(scene);
        stage.show();
    }

    public void showAddPatientWindow() throws IOException {
        start(stage);
    }

    @FXML
    void enterNewPatientButtonOnAction(ActionEvent event) {

    }

}

