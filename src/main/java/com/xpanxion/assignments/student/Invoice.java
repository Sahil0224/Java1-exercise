package com.xpanxion.assignments.student;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    int id;

    List<Product> products = new ArrayList<>();

    public Invoice (int id)
    {
        this.id = id;
    }

    public void addProduct(Product product)
    {
        products.add(product);
    }

    public double getTotalCost()
    {
        double totalCost = 0;

        for (Product product: products)
        {
            totalCost += product.getCost();
        }

        return totalCost;
    }
}   
