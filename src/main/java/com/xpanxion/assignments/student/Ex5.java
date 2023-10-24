package com.xpanxion.assignments.student;
import java.util.Scanner;

public class Ex5 {
    
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        System.out.print("Please enter a string or quit to end the program.");
        String word = console.nextLine();
        while(!word.equalsIgnoreCase("quit"))
        {
            int vowels = 0;
            int consonants = 0;
            for (int i = 0; i < word.length(); i++)
            {
                char c = word.charAt(i);
                if (Character.isLetter(c))
                {
                    c = Character.toLowerCase(c);
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    {
                        vowels++;
                    }
                    else
                    {
                        consonants++;
                    }
                }
            }
            System.out.println("Number of vowels: " + vowels);
            System.out.println("Number of consonants: " + consonants);
            System.out.print("Enter another string or type quit to end the program.");
            word = console.nextLine();
        }
            console.close();

    }
}
