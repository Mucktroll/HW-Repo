package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(TeleNumsRecursive(10));
        
    }

    public static int TeleNumsRecursive (int n)
    {
        if (n >= 2)
        {
            return TeleNumsRecursive(n - 1) + ((n - 1)*TeleNumsRecursive(n - 2));
        }

        return 1;
    }
}
