package com.company;

public class Application
{
    public Application()
    {
        gui = new GUI (this);
        state = 0;

    }

    private GUI gui;
    public int state;
}
