package com.xpanxion.assignments.student;

public class CatQueue {
    Node front;
    Node end;

    public CatQueue()
    {
        this.front = null;
        this.end = null;
    }


    boolean isEmpty()
    {
        return this.front == null;
    }


    public void enqueue(Cat cat)
    {
        Node newNode = new Node(cat, null);
        if(this.isEmpty())
        {
            this.front = newNode;
            this.end = newNode;
        }
        else
        {
            this.end.next = newNode;
            this.end = newNode;
        }
    }


    public Cat dequeue()
    {
        if(this.isEmpty())
        {
            return null;
        }
        else
        {
            Cat temp = this.front.data;

            this.front = this.front.next;

            if(this.front == null)
            {
                this.end = null;
            }
        
            return temp;
        }
    }

    public void printQueue()
    {
        if (this.isEmpty())
        {
            return;
        }

        System.out.print("[");
        for (Node p = front; p != null; p = p.next)
        {
            System.out.print(p.data.toString());
            if(p.next != null)
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
