package com.xpanxion.assignments.student;
import java.util.*;

public class Ex3 {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String string = console.nextLine();
        console.close();
        
        String strings[] = string.split(" ");
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < strings.length; i++)
        {
            if (i % 2 == 0)
            {
                output.append(strings[i].toUpperCase());
            }
            else
            {
                output.append(strings[i]);
            }
            if (i < strings.length - 1)
            {
                output.append(" ");
            }
        }
        
        System.out.println("Output: " + output.toString());
    }
}
