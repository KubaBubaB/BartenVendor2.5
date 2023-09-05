module com.example.bartenvendor25 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.bartenvendor25 to javafx.fxml;
    exports com.example.bartenvendor25;
}