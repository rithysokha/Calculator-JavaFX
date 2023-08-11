package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private Label label;
    private double number1 = 0;
    private String operator = "";
    private boolean start = true;
    Model model = new Model();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private void processNumber(ActionEvent event){
        if(start){
        label.setText("");
        start = false;
        }
        String value = ((Button)event.getSource()).getText();
        label.setText(label.getText() + value);
        }
    @FXML
    private void processOperator(ActionEvent event){
        String value = ((Button)event.getSource()).getText();
        if(value.equals("AC")){
            label.setText("");
            operator = "";
            start = true;
        }else {
            if (!value.equals("=")) {
                if (!operator.isEmpty())
                    return;

                operator = value;
                number1 = Double.parseDouble(label.getText());
                label.setText("");
            } else {
                if (operator.isEmpty())
                    return;
                double number2 = Double.parseDouble(label.getText());
                double output = model.calculate(number1, number2, operator);
                label.setText(String.valueOf(output));
            }
        }

    }
}