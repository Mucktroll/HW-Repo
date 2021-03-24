package com.company;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;


public class GUI extends JFrame
{
    public GUI(Application application) {
        super("Name of App");
        this.application = application;
        setSize(400, 300);


        menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Menu");
        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener((ActionEvent e) ->
                System.exit(0));

        fileMenu.add(quitItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);


        textField = new JTextField(10);
        add(textField, BorderLayout.PAGE_END);
        textField.getDocument().addDocumentListener(new DocumentListener()
        {
            public void insertUpdate(DocumentEvent e)
            {
                updateTextLength();
            }

            public void removeUpdate(DocumentEvent e)
            {
                updateTextLength();
            }

            public void changedUpdate(DocumentEvent e)
            {

            }
        });

        progressBar = new JProgressBar(0, 10);
        progressBar.setValue(0);
        add(progressBar);

        setVisible(true);
    }

    public void updateTextLength()
    {
        application.textLength = textField.getText().length();
        showTextLength();
    }

    void showTextLength()
    {
        progressBar.setValue(application.textLength);
    }

    private Application application;
    private JMenuBar menuBar;
    private JTextField textField;
    private JProgressBar progressBar;
}
