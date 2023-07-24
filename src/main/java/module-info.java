module com.example.peru {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.peru to javafx.fxml;
    exports com.example.peru;
}