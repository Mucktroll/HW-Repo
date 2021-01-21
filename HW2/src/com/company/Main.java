package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        int [][] a = new int[6][5];

        a [2][0] = -19;
        a [3][2] = 7;
        a [0][3] = 4;
        a [5][3] = 22;

        for (int r = 0; r < 6; r++)
        {
            for (int c = 0; c <5; c++)
            {
                System.out.print(a[r][c] + " ");

            }
            System.out.println();
        }
    }
}
