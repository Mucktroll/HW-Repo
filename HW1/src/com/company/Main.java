package com.company;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        String fname = "C:\\Users\\Gabriel\\Documents\\data.txt";

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 10000; i++)
            list.add(i);

        File file = new File (fname);

        if (file.exists())
        {
            System.out.println("File exists, Reading " + fname);
            Read(fname);
        }

        else
        {
            System.out.println("File does not exist, Writing and Reading " + fname);
            Write(fname);
            Read(fname);
        }

    }

    public static void Write (String fname)
    {
        try (PrintWriter out = new PrintWriter(new File(fname)))
        {
            for (int i = 1; i <= 10000; i++)
                out.println(i);

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void Read (String fname)
    {
        try (Scanner in = new Scanner(new File(fname)))
        {
            for (int i = 1; i <= 10000; i++)
                System.out.println(in.nextLine());

        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
