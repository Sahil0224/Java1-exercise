package com.xpanxion.assignments.student;
import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = console.nextLine();

        System.out.println("Your name in upper case is: " + name.toUpperCase());
    }
}
