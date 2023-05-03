/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.metodos.numbers;

/**
 *
 * @author ducar
 */
public class NumbersHandler {
    
    private String number1S;
    private String number2S;
    private double num1;
    private double num2;

    public NumbersHandler() {
        this.number1S = "";
        this.number2S = "";
        this.num1 = 0;
        this.num2 = 0;
    }

    public String getNumber1S() {
        return number1S;
    }

    public void setNumber1S(String number1S) {
        this.number1S += number1S;
        this.setNum1();
    }
    
    public void setNumber1S() {
        this.number1S = "0";
        this.setNum1();
    }

    public String getNumber2S() {
        return number2S;
    }

    public void setNumber2S(String number2S) {
        this.number2S += number2S;
        this.setNum2();
    }
    
     public void setNumber2S() {
        this.number2S = "0";
        this.setNum2();
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1() {
        this.num1 = Double.parseDouble(this.number1S);
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2() {
        this.num2 = Double.parseDouble(this.number2S);
    }
    
    
    
}
