package com.example.polyclinic;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.time.LocalDate;

public class PatientDataController extends Application {

    private final Stage stage = new Stage();
    private final ObservableList<Patient> patientsData = FXCollections.observableArrayList();

    @FXML
    private Button addButton;

    @FXML
    private TableColumn<Patient, String> addressColumn;

    @FXML
    private Button changeButton;

    @FXML
    private TableView<Patient> dataTable;

    @FXML
    private TableColumn<Patient, LocalDate> dateOfBirthColumn;

    @FXML
    private Button deleteButton;

    @FXML
    private TableColumn<Patient, String> diseasesColumn;

    @FXML
    private TableColumn<Patient, String> firstnameColumn;

    @FXML
    private TableColumn<Patient, Integer> idColumn;

    @FXML
    private TableColumn<Patient, String> lastnameColumn;

    @FXML
    private TableColumn<Patient, String> phoneColumn;

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchField;

    @FXML
    private Button sortAgeButton;

    @FXML
    private Button sortFromFirstButton;

    @FXML
    private Button sortFromLastButton;

    @FXML
    private TableColumn<Patient, String> surnameColumn;

    @FXML
    private void initialize() throws ParserConfigurationException, IOException, SAXException {
        initData();
        idColumn.setCellValueFactory(new PropertyValueFactory<Patient, Integer>("id"));
        surnameColumn.setCellValueFactory(new PropertyValueFactory<Patient, String>("surname"));
        firstnameColumn.setCellValueFactory(new PropertyValueFactory<Patient, String>("firstname"));
        lastnameColumn.setCellValueFactory(new PropertyValueFactory<Patient, String>("lastname"));
        dateOfBirthColumn.setCellValueFactory(new PropertyValueFactory<Patient, LocalDate>("dateOfBirth"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<Patient, String>("address"));
        phoneColumn.setCellValueFactory(new PropertyValueFactory<Patient, String>("phone"));
        diseasesColumn.setCellValueFactory(new PropertyValueFactory<Patient, String>("diseases"));
        dataTable.setItems(patientsData);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PatientDataController.class.getResource("patientData.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("База данных пациентов");
        stage.setScene(scene);
        stage.show();
    }

    public void showPatientDataWindow() throws IOException {
        start(stage);
    }

    private void initData() throws ParserConfigurationException, IOException, SAXException {
        //patientsData.removeAll(PatientsParser.patients);
        //PatientsParser.patients.clear();
        //PatientsParser.findAllPatients();
        //for (int i = 0; i < PatientsParser.patients.size(); i++) {
            //patientsData.add(i, PatientsParser.patients.get(i));
        //}
        PatientsParser.findAllPatients();
        patientsData.removeAll(PatientsParser.patients);
        for (int i = 0; i < PatientsParser.patients.size(); i++) {
            patientsData.add(i, PatientsParser.patients.get(i));
        }
    }

    @FXML
    void addButtonOnAction(ActionEvent event) throws IOException {
        AddPatientController enter = new AddPatientController();
        enter.showAddPatientWindow();
    }

    @FXML
    void changeButtonOnAction(ActionEvent event) throws IOException {
        ChangePatientDataController enter = new ChangePatientDataController();
        enter.showChangePatientDataWindow();
    }

    @FXML
    void deleteButtonOnAction(ActionEvent event) {

    }

    @FXML
    void searchButtonOnAction(ActionEvent event) {

    }

    @FXML
    void sortAgeButtonOnAction(ActionEvent event) {

    }

    @FXML
    void sortFromFirstButtonOnAction(ActionEvent event) throws ParserConfigurationException, IOException, SAXException {
        initData();
    }

    @FXML
    void sortFromLastButtonOnAction(ActionEvent event) {

    }

}