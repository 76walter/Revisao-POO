package com.example;

public class Calculadora {
    private double num1; 
    private double num2;

    public Calculadora (int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1 () {
        return num1;
    }

    public double getNum2 () {
        return num2;
    }

    public double adicao () {
        return num1 + num2;
    }

    public double subtracao (double opcao1) {
        if (opcao1 == 1) {
            return num1 - num2;
        } else {
            return num2 - num1;
        } 
    }

    public double multiplicacao () {
        return num1 * num2;
    }

    public double div (double opcao2) {
        if (opcao2 == 1) {
            return num1 / num2;
        } else {
            return (num2 / num1);
        }
    }


}
