package com.example;

import java.util.Scanner;

/**
Crie uma classe "Calculadora" com métodos para adição, subtração, multiplicação e divisão. 
Realize operações matemáticas com essa classe.
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner entrada = new Scanner(System.in);

        Calculadora calcula = new Calculadora(3, 5);

        int continua = 1;

        while (continua == 1) {
            System.out.println("MENU");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Soma: " + calcula.getNum1() + " + " + calcula.getNum2() + " é: " + calcula.adicao());
                    break;
                case 2:
                    System.out.println("1 - A subtração vai ser do primeiro número pelo segunda // 2 - A subtração vai ser do segunda número pelo primeiro");
                    int opcao1 =  entrada.nextInt();

                    if (opcao1 == 1) {
                        System.out.println("Subtração: " + calcula.subtracao(opcao1));
                    } else {
                        System.out.println("Subtração: " + calcula.subtracao(opcao1));
                    }
                    break;
                case 3:
                    System.out.println("Subtração: " + calcula.getNum1() + " * " + calcula.getNum2() + " é: " + calcula.multiplicacao());
                    break;
                case 4:
                    System.out.println("A divisão vai ser do primeiro número pelo segundo // 2 - A divisão vai ser do segundo número pelo primeiro");
                    int opcao2 = entrada.nextInt();

                    if (opcao2 == 1) {
                        System.out.println("Divisão: " + calcula.div(opcao2));
                    } else {
                        System.out.printf("Divisão: %.2f" , calcula.div(opcao2));
                    }
                default:
                    break;
            } 
            System.out.println("Quer continuar? 1- Sim // 0 - Sair");
            continua = entrada.nextInt();

        }
    }
}
