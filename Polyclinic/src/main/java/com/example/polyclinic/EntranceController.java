package com.example.polyclinic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class EntranceController extends Application {

    private final Stage stage = new Stage();

    @FXML
    private Label errorMessage;

    @FXML
    private Button entranceButton;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EntranceController.class.getResource("entrance.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Авторизация");
        stage.setScene(scene);
        stage.show();
    }

    public void showEntranceWindow() throws IOException {
        start(stage);
    }

    @FXML
    void entranceButtonOnAction(ActionEvent event) throws IOException {

        String login = loginField.getText();
        String password = passwordField.getText();

        if (login.equals("admin") && password.equals("admin")) {
            PatientDataController enter = new PatientDataController();
            enter.showPatientDataWindow();
            final Node node = (Node) event.getSource();
            final Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
        } else {
            errorMessage.setText("!Неправильно введён логин или пароль!");
        }
    }

}
