package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(TeleNumsRecursive(10));

        System.out.println(TeleNumsIterative(10));

    }

    public static int TeleNumsRecursive (int n)
    {
        if (n >= 2)
        {
            return TeleNumsRecursive(n - 1) + ((n - 1)*TeleNumsRecursive(n - 2));
        }

        return 1;
    }

    public static int TeleNumsIterative (int n)
    {
        if (n >= 2)
        {
            int nCurrent = 1;
            int cur = 1;
            int prev = 1;

            while (nCurrent < n)
            {
                int next = cur + nCurrent * prev;
                prev = cur;
                cur = next;
                nCurrent++;
            }

            return cur;
        }

        return 1;
    }
}
