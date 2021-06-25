package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {

    float number1,number2;
    double num1,base,exponent;
    JOptionPane msg;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnMIn;

    @FXML
    private Button btnMulti;

    @FXML
    private Button btnDiv;

    @FXML
    private Button btnSin;

    @FXML
    private Button btnCos;

    @FXML
    private Button btnTan;

    @FXML
    private Button btnExp;

    @FXML
    private Label lable1;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    private Button btnClear;

    @FXML
    void buttonClicked(ActionEvent event) {

        //adition
        if(event.getSource() == btnAdd){
            try {
                number1 = Float.parseFloat(txt1.getText());
                number2 = Float.parseFloat(txt2.getText());
                lable1.setText(String.valueOf(number1+number2));
            }
            catch (Exception exceptione){JOptionPane.showMessageDialog(msg,"Insert Number First");}
        }
        //minus
        else if(event.getSource() == btnMIn){
            try{
                number1 = Float.parseFloat(txt1.getText());
                number2 = Float.parseFloat(txt2.getText());
                lable1.setText(String.valueOf(number1-number2));
            }
            catch (Exception exception){JOptionPane.showMessageDialog(msg,"Insert Number First");}
        }
        //multiplication
        else if(event.getSource() == btnMulti){
            try {
                number1 = Float.parseFloat(txt1.getText());
                number2 = Float.parseFloat(txt2.getText());
                lable1.setText(String.valueOf(number1*number2));
            }
            catch (Exception exception){JOptionPane.showMessageDialog(msg, "Insert Numbers First");}
        }
        //division
        else if (event.getSource() == btnDiv){
            try {
                number1 = Float.parseFloat(txt1.getText());
                number2 = Float.parseFloat(txt2.getText());
                lable1.setText(String.valueOf(number1/number2));
            }
            catch (Exception exception){JOptionPane.showMessageDialog(msg, "Insert Numbers First");}
        }
        //sin of an angle
        else if(event.getSource() == btnSin){
            try {
                num1 =Double.parseDouble(txt1.getText());
                lable1.setText(String.valueOf(Math.sin(num1)));
            }
            catch (Exception exception){JOptionPane.showMessageDialog(msg, "Insert Numbers First");}
        }
        //cos of an angle
        else if (event.getSource() == btnCos){
            try {
                num1 = Double.parseDouble(txt1.getText());
                lable1.setText(String.valueOf(Math.cos(num1)));
            }
            catch (Exception exception){JOptionPane.showMessageDialog(msg, "Insert Numbers First");}
        }
        //tan of an angle
        else if(event.getSource() == btnTan){
            try {
                num1 = Double.parseDouble(txt1.getText());
                lable1.setText(String.valueOf(Math.tan(num1)));
            }
            catch (Exception exception){JOptionPane.showMessageDialog(msg, "Insert Numbers First");}
        }
        //exponent
        else if (event.getSource() ==btnExp){
            try{
                base = Double.parseDouble(txt1.getText());
                exponent = Double.parseDouble(txt2.getText());
                lable1.setText(String.valueOf(Math.pow(base,exponent)));
            }
            catch (Exception exception){JOptionPane.showMessageDialog(msg, "Insert Numbers First");}
        }
        //clear button
        else if (event.getSource() == btnClear){
            lable1.setText("");
            txt1.setText("");
            txt2.setText("");
        }

    }
}
