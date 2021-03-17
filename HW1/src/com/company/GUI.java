package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GUI extends JFrame
{
    public GUI(Application application)
    {
        super("A simple GUI demo");
        this.application = application;

        //Frame Properties
        setSize(400, 300);
        setLayout(new FlowLayout());
        setVisible(true);

        //Quit
        menuBar = new JMenuBar ();
        JMenu fileMenu = new JMenu ("File");
        JMenuItem quitItem = new JMenuItem ("Quit");
        quitItem.addActionListener ((ActionEvent e) ->
                System.exit (0));
        fileMenu.add (quitItem);
        menuBar.add (fileMenu);
        setJMenuBar (menuBar);

        String [] comboBoxInput = {"First", "Second", "Third"};
        JComboBox<String> comboBox = new JComboBox<>(comboBoxInput);
        comboBox.addActionListener((ActionEvent e) -> System.out.println(comboBox.getSelectedItem()));
        add(comboBox);
    }

    private Application application;
    private JMenuBar menuBar;
}
