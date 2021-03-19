package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

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
