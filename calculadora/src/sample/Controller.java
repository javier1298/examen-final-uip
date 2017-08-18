package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class Controller {
    @FXML
    Button num1;
    @FXML
    Button num2;
    @FXML
    Button num3;
    @FXML
    Button num4;
    @FXML
    Button num5;
    @FXML
    Button num6;
    @FXML
    Button num7;
    @FXML
    Button num8;
    @FXML
    Button num9;
    @FXML
    Button punto;
    @FXML
    Button num0;
    @FXML
    Button c;
    @FXML
    Button suma;
    @FXML
    Button resta;
    @FXML
    Button mul;
    @FXML
    Button div;
    @FXML
    Button resultado;
    @FXML
    Label etiqueta1;
    @FXML
    Label etiqueta2;
    @FXML
    Label etiqueta3;

    String numero1=" ";
    String numero2=" ";
    int contador=0;

    public void num1(ActionEvent actionEvent) {
        numero1 += "1";
        etiqueta3.setText(numero1);
    }

    public void num2(ActionEvent actionEvent) {
        numero1 += "2";
        etiqueta3.setText(numero1);
    }

    public void num3(ActionEvent actionEvent) {
        numero1 += "3";
        etiqueta3.setText(numero1);
    }

    public void num4(ActionEvent actionEvent) {
        numero1 += "4";
        etiqueta3.setText(numero1);
    }

    public void num5(ActionEvent actionEvent) {
        numero1 += "5";
        etiqueta3.setText(numero1);
    }

    public void num6(ActionEvent actionEvent) {
        numero1 += "6";
        etiqueta3.setText(numero1);
    }

    public void num7(ActionEvent actionEvent) {
        numero1 += "7";
        etiqueta3.setText(numero1);
    }

    public void num8(ActionEvent actionEvent) {
        numero1 += "8";
        etiqueta3.setText(numero1);
    }

    public void num9(ActionEvent actionEvent) {
        numero1 += "9";
        etiqueta3.setText(numero1);
    }

    public void punto(ActionEvent actionEvent) {
        numero1 += ".";
        etiqueta3.setText(numero1);
    }

    public void num0(ActionEvent actionEvent) {
        numero1 += "0";
        etiqueta3.setText(numero1);
    }

    public void c(ActionEvent actionEvent) {
        numero1= " ";
        numero2= " ";
        etiqueta1.setText(" ");
        etiqueta2.setText(" ");
        etiqueta3.setText(" ");
        contador=0;
    }

    public void suma(ActionEvent actionEvent) {
        if (!etiqueta3.getText().equals(" ") || contador !=0 ){
            operaciones();
            etiqueta2.setText("+");
        }
    }

    public void resultado(ActionEvent actionEvent) {
        if (!etiqueta3.getText().equals(" ") || contador !=0 ){
            operaciones();
            etiqueta2.setText(" ");
        }
    }

    public void mul(ActionEvent actionEvent) {
        if (!etiqueta3.getText().equals(" ") || contador !=0 ){
            operaciones();
            etiqueta2.setText("X");
        }
    }

    public void div(ActionEvent actionEvent) {
        if (!etiqueta3.getText().equals(" ") || contador !=0 ){
            operaciones();
            etiqueta2.setText("/");
        }
    }

    public void resta(ActionEvent actionEvent) {
        if (!etiqueta3.getText().equals(" ") || contador !=0 ){
            operaciones();
            etiqueta2.setText("-");
        }
    }
    void operaciones(){
        double nu1,nu2;
        if (!etiqueta3.getText().equals(" ")){
            if (contador==0){
                numero2 = numero1;
                etiqueta2.setText(numero2);
            }
            if (numero2.equals("")){
                numero2 = "0";
            }
            nu1 = Double.valueOf(numero2);
            nu2 = Double.valueOf(numero1);
            if (etiqueta2.getText().equals("-")){
                numero2 = String.valueOf(nu1-nu2);
            }
            if (etiqueta2.getText().equals("+")){
                numero2 = String.valueOf(nu1+nu2);
            }
            if (etiqueta2.getText().equals("/")){
                numero2 = String.valueOf(nu1/nu2);
            }
            if (etiqueta2.getText().equals("X")){
                numero2 = String.valueOf(nu1*nu2);
            }
            etiqueta3.setText(" ");
            numero1 = " ";
            contador++;
            etiqueta1.setText(numero2);
        }

    }
}
