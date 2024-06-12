package com.example;

import java.lang.Math;

public class Circulo {
    
    private double raio;

    public double CalcularAreaCirculo(){
        double area;
        area = Math.PI * Math.pow(this.raio,2);
        return area;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    

}
