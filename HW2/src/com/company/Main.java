package com.company;

public class Main
{
    public static void main (String[] args)
    {
        int[] observations = {1, 2, 3, 4};
        int[] frequencies = {7, 4, 11, 9};
        double[] relFreqs = new double[4];

        int count = 0;

        for (int i = 0; i < frequencies.length; i++)
            count += frequencies [i];

        for (int i = 0; i < frequencies.length; i++)
        {
            double val = (double)frequencies [i] / count;
            relFreqs [i] = val;
        }

        for (int i = 0; i < observations.length; i++)
            System.out.println (observations [i] + ": " + relFreqs [i]);
    }
}