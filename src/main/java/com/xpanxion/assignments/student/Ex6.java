package com.xpanxion.assignments.student;
import java.util.*;

public class Ex6 {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = console.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = console.nextInt();
        console.close();

        int result = firstNumber + secondNumber;
        System.out.println("Result: " + result);
    }
}
