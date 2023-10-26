package com.xpanxion.assignments.student;

import java.util.ArrayList;

public class Calculator {
    public static ArrayList<String> history = new ArrayList<>();

    public static void add(int firstNumber, int secondNumber)
    {
        int result = firstNumber + secondNumber;
        System.out.println("Result: " + result);
        history.add(firstNumber + " + " + secondNumber + " = " + result);
    }

    public static void sub(int firstNumber, int secondNumber)
    {
        int result = firstNumber - secondNumber;
        System.out.println("Result: " + result);
        history.add(firstNumber + " - " + secondNumber + " = " + result);
    }

    public static void mul(int firstNumber, int secondNumber)
    {
        int result = firstNumber * secondNumber;
        System.out.println("Result: " + result);
        history.add(firstNumber + " * " + secondNumber + " = " + result);
    }

    public static void div(int firstNumber, int secondNumber)
    {
        int result = firstNumber / secondNumber;
        System.out.println("Result: " + result);
        history.add(firstNumber + " / " + secondNumber + " = " + result);
    }
}
