package com.xpanxion.assignments.student;
import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = console.nextLine();
        console.close();
        int upperCase = 0;
        for (int  i = 0; i < name.length(); i++)
        {
            if (Character.isUpperCase(name.charAt(i)))
            {
                upperCase++;
            }
        }

        System.out.println("Number of uppercase letters: " + upperCase);

    }
}
