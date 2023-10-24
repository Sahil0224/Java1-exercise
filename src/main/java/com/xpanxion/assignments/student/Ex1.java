package com.xpanxion.assignments.student;
import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = console.nextLine();
        console.close();
        System.out.println("Your name in upper case is: " + name.toUpperCase());
    }
}
