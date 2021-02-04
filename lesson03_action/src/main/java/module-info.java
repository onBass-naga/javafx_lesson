
module fxaction {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example to javafx.fxml;
    exports com.example;

    opens com.example.greeting to javafx.fxml;
}