package uz.bakhromjon.javafxchoicebox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private ChoiceBox<String> choiceBox;

    private String[] items = new String[]{"PIZZA", "SUSHI", "HAMBURGER"};

    public void choice(ActionEvent event) {
        label.setText(choiceBox.getValue());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBox.getItems().addAll(items);

    }
}