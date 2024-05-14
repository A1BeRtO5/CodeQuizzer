module com.example.codequizzer {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.codequizzer to javafx.fxml;
    exports com.example.codequizzer;
}