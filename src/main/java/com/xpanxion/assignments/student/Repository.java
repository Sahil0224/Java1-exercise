package com.xpanxion.assignments.student;

public class Repository implements DataAccess{
    public Person getPerson()
    {
        Person person = new Person(1, "John" , "Doe");

        return person;
    }
    
}
