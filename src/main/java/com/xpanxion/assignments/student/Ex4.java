package com.xpanxion.assignments.student;
import java.util.*;

public class Ex4 {
    
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        String word = console.nextLine();
        String reverse = "";

        console.close();
        
        for (int i = word.length() - 1; i >= 0; i--)
        {
            reverse = reverse + word.charAt(i);
        }
        if (word.equals(reverse))
        {
            System.out.println("Yes the word is palidrome. ");
        }
        else
        {
            System.out.println("No the word is not palidrome.");
        }
    }
}
