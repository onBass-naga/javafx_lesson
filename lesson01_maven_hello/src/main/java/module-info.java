
module hellofx {
    requires javafx.controls;
    opens com.example to javafx.fxml;
    exports com.example;
}