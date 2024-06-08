package com.example.codequizzer;

import java.net.URL;
import java.util.HashSet;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Set;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addButton;

    @FXML
    private Button allButton;

    @FXML
    private Button closeButton;

    @FXML
    private Button closeButton1;
    @FXML
    private Label labelText;

    @FXML
    private Button deleteButton;

    @FXML
    private TextField idTextField;

    @FXML
    private Button nextButton;

    @FXML
    private Button searchButton;

    @FXML
    private AnchorPane setingsAnchor;

    @FXML
    private Button setingsButton;

    @FXML
    private AnchorPane testAnchor;

    @FXML
    private Button testButton;

    @FXML
    private TextArea textArea;
    static int counter;
    private static Set<Integer> usedNumbers = new HashSet<>();
    private static Random random = new Random();

    @FXML
    void addButtonAction(ActionEvent event) {

        textArea.setText("");

    }

    @FXML
    void allbuttonAction(ActionEvent event) {// show all que

    }

    @FXML
    void closeButtonAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void nextButtonAction(ActionEvent event) {
        String i = String.valueOf(randomizer(counter));

    }

    @FXML
    void searchButtonAction(ActionEvent event) {
    }

    @FXML
    void setingsButtonAction(ActionEvent event) {
        testAnchor.setVisible(false);
        setingsAnchor.setVisible(true);
    }

    @FXML
    void testButtonAction(ActionEvent event) {
        testAnchor.setVisible(true);
        setingsAnchor.setVisible(false);

    }

    @FXML
    void initialize() {
        System.out.println(counter);
//        String i = String.valueOf(randomizer(counter));
//        labelText.setText(c.selectTest(i));
    }


    int randomizer(int maxNumber) {
    if (usedNumbers.size()>= maxNumber) {
        usedNumbers.clear();
    }
    int randomNumber;
    do {
        randomNumber = random.nextInt(maxNumber);
        if (randomNumber == 0) {
            randomNumber = maxNumber;
        }
    } while (usedNumbers.contains(randomNumber));
        usedNumbers.add(randomNumber);
        return randomNumber;
    }
}
