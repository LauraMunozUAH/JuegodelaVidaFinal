module com.example.juegodelavidafinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.juegodelavidafinal to javafx.fxml;
    exports com.example.juegodelavidafinal;
}