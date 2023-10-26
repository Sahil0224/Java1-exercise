package com.xpanxion.assignments.student;
import java.text.NumberFormat;
import java.util.*;
public class JavaTwo {
    
    public void ex1()
    {
        System.out.println("Student 2: ex1.");

        List<Person> list = new ArrayList<>();
        while (true)
        {
            Scanner console = new Scanner(System.in);
            System.out.print("Enter person: ");
            String person = console.nextLine();

            if(person.equalsIgnoreCase("done"))
            {
                break;
            }
            String[] stringtoken = person.split(", ");
            String[] name = stringtoken[1].split(" ");
            list.add(new Person(Integer.parseInt(stringtoken[0]), name[0], name[1]));
        }

        for (Person output: list)
        {
            System.out.println(output);
        }

    }

    public void ex2()
    {
        System.out.println("Student 2: ex2.");

        HashMap<Integer, Person> person = new HashMap<>();
        person.put(1, new Person(1, "Peter", "Jones"));
        person.put(2, new Person(2, "John", "Smith"));
        person.put(3, new Person(3, "Mary", "Jane"));

        Scanner console = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter Person ID: ");
            String id = console.nextLine();
            if (id.equalsIgnoreCase("done"))
            {
                break;
            }
            else if(person.containsKey(Integer.parseInt(id)))
            {
                Person p = person.get(Integer.parseInt(id));
                System.out.println(p);
            }
            else 
            {
                System.out.println("Person with id " + Integer.parseInt(id) + " not found");
            }
        }
    }

    public void ex3()
    {
        System.out.println("Student 2: ex3.");
        var invoice = new Invoice(1);

        invoice.addProduct(new Product(111,"Mustard" , 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex4()
    {
        System.out.println("Student 2: ex4.");

        var invoice = new Invoice(1);

        invoice.addProduct(new Product(111,"Mustard" , 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex5()
    {
        System.out.println("Student 2: ex5.");

        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }


    public void ex6()
    {
        System.out.println("Student 2: ex6.");

        while (true)
        {
            Scanner console = new Scanner(System.in);            
            System.out.print("Enter first number: ");
            String firstNumber = console.nextLine();

            if(firstNumber.equals("done"))
            {
                break;
            }

            System.out.print("Enter second number: ");
            int secondNumber = console.nextInt();

            System.out.print("Enter operation (add, sub, mul, div): ");
            String operation = console.next();

            switch(operation)
            {
                case "add" ->  Calculator.add(Integer.parseInt(firstNumber), secondNumber);
                case "sub" ->  Calculator.sub(Integer.parseInt(firstNumber), secondNumber);
                case "mul" -> Calculator.mul(Integer.parseInt(firstNumber), secondNumber);
                case "div" -> Calculator.div(Integer.parseInt(firstNumber), secondNumber);
            }
        }

        for (int i = 0; i < Calculator.history.size(); i++)
        {
            System.out.println(Calculator.history.get(i));
        }
        
    }

    public void ex7()
    {
        // System.out.println("Student 2: ex7.");

        // var personList = Arrays.asList 
        // (
        //     new Person(1, "Peter", "Jones"),
        //     new Person(2, "John", "Smith"),
        //     new Person(3, "Sue", "Anderson")
        // );
        
        // var newPersonList = personList.stream().map(personList.removeAll("xxx"));
        // for (Person p : newPersonList) 
        // {
        //     System.out.println(p);
        // }

    }


    public void ex8()
    {
        System.out.println("Student 2: ex8.");

    }

    public void ex9()
    {
        System.out.println("Student 2: ex9.");

    }

    public void ex10()
    {
        System.out.println("Student 2: ex10.");

    }
}
