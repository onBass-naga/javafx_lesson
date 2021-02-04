package com.example.greeting;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GreetingController {

    @FXML
    private Label label;

    @FXML
    private TextField name;

    @FXML
    public void greet() {
        String message = String.format("Hello, %s!", this.name.getText());
        this.label.setText(message);
    }
}