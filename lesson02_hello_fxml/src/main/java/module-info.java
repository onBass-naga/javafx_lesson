
module hellofxml {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example to javafx.fxml;
    exports com.example;

    opens com.example.hello to javafx.fxml;
}