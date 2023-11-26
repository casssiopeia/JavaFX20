module com.example.polyclinic {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.example.polyclinic to javafx.fxml;
    exports com.example.polyclinic;
}