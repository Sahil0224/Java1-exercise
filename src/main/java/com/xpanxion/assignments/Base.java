package com.xpanxion.assignments;

public class Base {
    int id;

    public Base(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String toString()
    {
        return "Id is " + id;
    }
}
