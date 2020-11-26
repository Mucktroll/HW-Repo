package com.company;

public class Task
{
    public Task (String name)
    {
        this.name = name;

        workers = new Worker[2];

        workers [0] = new Worker("John");
        workers [1] = new Worker("Bill");
    }

    public String toString ()
    {
        return name + ", was completed by: " + workers[0] + " and "  + workers [1];
    }

    public Worker [] workers;
    public String name;
}
