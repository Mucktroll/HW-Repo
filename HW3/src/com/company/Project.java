package com.company;

public class Project
{
    public Project ()
    {
        this.userId = nextUserId;
        nextUserId++;

        tasks = new Task[2];
        tasks [0] = new Task("Write");
        tasks [1] = new Task("Read");

    }

    public String toString ()
    {
        return "Project " + userId + ": " + tasks[1];
    }

    int userId;
    static int nextUserId = 1;
    public Task [] tasks;
}
