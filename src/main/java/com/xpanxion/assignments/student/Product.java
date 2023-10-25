package com.xpanxion.assignments.student;

public class Product {
    int id; 
    String name;
    double cost;

    public Product(int id, String name, double cost)
    {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public int getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public double getCost()
    {
        return this.cost;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public String toString()
    {
        return "Product id is " + this.id + "Product name is " + this.name + "Product cost is " + this.cost;
    }

}
