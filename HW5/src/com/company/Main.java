package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int [] array = {10, 6, 3, 3, 6, 10};

        System.out.println(Palindrome(array, 0, array.length - 1));

    }

    public static boolean Palindrome (int [] array, int start, int end)
    {
        if (array.length == 0 || array.length == 1)
            return true;

        if (start >= end)
            return true;

        if (array[start] != array[end])
            return false;


        return Palindrome(array, start + 1, end - 1);
    }
}
