/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist311finalproj;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.lang.Math;
import java.util.HashMap;
import java.util.Map;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author kaungkhine
 */
public final class BasicCalcController {

    private BigDecimal left;
    private String selectedOperator;
    private boolean numberInputting;
    private Map<Integer, storedData> myMap = new HashMap<>();
    private int key = 0;
    private storedData data;
    private boolean equalSelected;
    Scene previousScene;
    
    @FXML
    private TextField display;

    @FXML // fx:id="goBackHome"
    private Button goBackHome; // Value injected by FXMLLoader


    @FXML
    public void goBack(ActionEvent event) {
        System.out.println("it works");
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        //Stage stage = (Stage)backButton.getScene().getWindow();
        if (null != previousScene){
            stage.setScene(previousScene);
        }
    }
    
    public void setPreviousScene(Scene scene) {
        previousScene = scene;
        //goBackHome.setDisable(false);
        
    } 

    public BasicCalcController() {
        this.left = BigDecimal.ZERO;
        this.selectedOperator = "";
        this.numberInputting = false;
    }

    @FXML
    public void operateButton(ActionEvent evt) {
        Button button = (Button) evt.getSource();
        String buttonText = button.getText();
        if (buttonText.equals("C")) {
            if (buttonText.equals("C")) {
                left = BigDecimal.ZERO;
            }
            selectedOperator = "";
            numberInputting = false;
            display.setText("0");
            return;
        }
        if (buttonText.matches("[0-9\\.]")) {
            if (!numberInputting) {
                numberInputting = true;
                display.clear();
            }
            display.appendText(buttonText);
            return;
        }
        if (buttonText.matches("[+-/*]")) {
            left = new BigDecimal(display.getText());
            selectedOperator = buttonText;
            numberInputting = false;
            return;
        }

        if (buttonText.equals("=")) {

            final BigDecimal right = numberInputting ? new BigDecimal(display.getText()) : left;

            if ((selectedOperator.equals("/")) && right.compareTo(BigDecimal.ZERO) == 0) {
                display.setText("Error cannot divide by 0");
                numberInputting = false;
                return;
            } else {
                BigDecimal temp = left;
                left = calculate(selectedOperator, left, right);
                data = new storedData(temp, right, selectedOperator, left);
                myMap.put(key, data);
                display.setText(myMap.get(key).toString());
                key++;
                numberInputting = false;
                return;
            }
        }

        if (buttonText.equals("π")) {
            display.setText(Math.PI + "");
            return;
        }

        if (buttonText.equals("Sin(rad)")) {
            left = new BigDecimal(display.getText());

            if (left.doubleValue() == Math.PI) {
                display.setText("0");
            } else {
                double valuesGiven = Math.sin(left.doubleValue());
                display.setText(valuesGiven + "");
            }
        }

        if (buttonText.equals("Cos(rad)")) {
            left = new BigDecimal(display.getText());

            if (left.doubleValue() == Math.PI) {
                display.setText("-1");
            } else {
                double valuesGiven = Math.cos(left.doubleValue());
                display.setText(valuesGiven + "");
            }
        }

        if (buttonText.equals("Tan(rad)")) {
            left = new BigDecimal(display.getText());

            if (left.doubleValue() == Math.PI) {
                display.setText("0");
            } else {
                double valuesGiven = Math.tan(left.doubleValue());
                display.setText(valuesGiven + "");
            }
        }
    }

    static BigDecimal calculate(String operator, BigDecimal left, BigDecimal right) {
        switch (operator) {
            case "+":
                return left.add(right);
            case "-":
                return left.subtract(right);
            case "*":
                return left.multiply(right);
            case "/":
                return left.divide(right);
            default:
        }
        return right;
    }

     @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert display != null : "fx:id=\"display\" was not injected: check your FXML file 'BasicCalcView.fxml'.";
        assert goBackHome != null : "fx:id=\"goBackHome\" was not injected: check your FXML file 'BasicCalcView.fxml'.";

    }

}
