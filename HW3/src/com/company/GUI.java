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

        {
            int result = JOptionPane.showConfirmDialog(this,
                    "Are you sure you want to exit?",
                    null,
                    JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.YES_OPTION)
                System.exit(0);
        });

        fileMenu.add (quitItem);
        menuBar.add (fileMenu);
        setJMenuBar (menuBar);

        //TextField
        textField = new JTextField(10);
        textField.addActionListener(this::actionPerformed);
        add(textField);

    }

    public void actionPerformed(ActionEvent evt)
    {
        String text = textField.getText();
        textArea.append(text + newline);
        textField.selectAll();
    }

    private Application application;
    private JMenuBar menuBar;
    private JTextField textField;
    private JTextArea textArea;
    private final static String newline = "\n";
}