package com.xpanxion.assignments.student;

import com.xpanxion.assignments.Base;

public class Product extends Base{
    String name;
    double cost;

    public Product(int id, String name, double cost)
    {
       super(id);
        this.name = name;
        this.cost = cost;
    }

    public String getName()
    {
        return this.name;
    }

    public double getCost()
    {
        return this.cost;
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
        return "Product name is " + this.name + "Product cost is " + this.cost;
    }

}
