package com.xpanxion.assignments.student;

public class Cat {
    String name;

    public Cat(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return "Cat{name= '" + this.name + "'}";
    }

}
