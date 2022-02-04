package com.example;
import java.util.Scanner;

public class App2 {

        public static void main(String[] args) {

            char operator;
            double number1, number2, result;
            //scanner class
            Scanner input = new Scanner(System.in);

            //user inputs
            System.out.println("Enter first number");
            number1 = input.nextDouble();

            System.out.println("Enter second number");
            number2 = input.nextDouble();

            System.out.println("Choose an operator: +, -, *, or /");
            operator = input.next().charAt(0);

            switch (operator) {

                // performs addition
                case '+':
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                    break;

                // performs subtraction
                case '-':
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + result);
                    break;

                // performs multiplication
                case '*':
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                    break;

                // performs division
                case '/':
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                    break;

                default:
                    System.out.println("Invalid operator!");
                    break;
            }

            input.close();
        }
    }