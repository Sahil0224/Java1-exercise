package com.xpanxion.assignments.student;

import java.util.Random;
import java.util.Scanner;

public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        System.out.println("Student 1: ex1.");
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = console.nextLine();
        System.out.println("Your name in upper case is: " + name.toUpperCase());
    }

    public void ex2() {
        System.out.println("Student 1: ex2.");
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = console.nextLine();
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

    public void ex3() {
        System.out.println("Student 1: ex3.");
        Scanner console = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String string = console.nextLine();
        
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

    public void ex4() {
        System.out.println("Student 1: ex4.");
        Scanner console = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        String word = console.nextLine();
        String reverse = "";

        
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

    public void ex5() {
        System.out.println("Student 1: ex5.");
        Scanner console = new Scanner(System.in);

        System.out.print("Please enter a string or quit to end the program: ");
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
            System.out.print("Enter another string or type quit to end the program: ");
            word = console.nextLine();
        }
    }

    public void ex6() {
        System.out.println("Student 1: ex6.");
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = console.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = console.nextInt();

        int result = firstNumber + secondNumber;
        System.out.println("Result: " + result);
    }

    public void ex7() {
        System.out.println("Student 1: ex7.");
        Scanner console = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = console.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = console.nextInt();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = console.next();


        int add = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int mul = firstNumber * secondNumber;
        double div = firstNumber / secondNumber;

        switch(operation)
        {
            case "add" -> System.out.println("Result: " + add);
            case "sub" -> System.out.println("Result: " + sub);
            case "mul" -> System.out.println("Result: " + mul);
            case "div" -> System.out.println("Result: " + div);
        }
    }

    public void ex8() {
        System.out.println("Student 1: ex8.");
        Scanner console = new Scanner(System.in);

        double width = 0;
        double length = 0; 
        double area = 0;
        double totalCost = 0;

        System.out.print("Enter price of carpet per square feet: ");
        double price = console.nextDouble();

        while (true)
        {
            System.out.println("Enter the width and length of a room or done to finish: ");
            String line = console.next();

            if(line.equalsIgnoreCase("done"))
            {
                break;
            }

            width = Double.parseDouble(line);

            length = console.nextDouble();

            area = width * length;

            totalCost += area * price;

        }

        System.out.println("Total price is: " + totalCost);

    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
        Scanner console = new Scanner(System.in);

        int answer = 0;
        int maxNumber = 5;
        Random number = new Random();

        boolean correct = false;

        answer = number.nextInt(maxNumber) + 1;

        while(!correct)
        {
            System.out.print("Enter a number: ");
            int guess = console.nextInt();

            if(guess > answer || guess < answer)
            {
                System.out.println("Try again...");
            }
            else 
            {
                System.out.println("You have guessed it!!!");
            } 
        }
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = console.nextLine();

        String words[] = string.split("\\s+");

        for (String word: words)
        {
            String diagonal = "";

            for (int i = 0; i < word.length(); i++)
            {
                for (int j = 0; j < i; j++)
                {
                    diagonal += " ";
                }

                diagonal += word.charAt(i);
                diagonal += "\n";
            }
            System.out.println(diagonal);
        }
    }

    //
    // Private helper methods
    //
}
