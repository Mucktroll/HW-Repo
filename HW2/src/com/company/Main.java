package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(recursive(6));
        System.out.println(nonrecursive(6));
    }

    public static int nonrecursive (int num)
    {
        int number = 1;

        for (int i = 1; i<= num; i++)
        {
            number = number * i;
        }

        return number;
    }

    public static int recursive(int num)
    {
        if (num >= 1)
            return num * recursive(num - 1);

        return 1;
    }
}
