package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int [] nums = {5, 10, 7, 3, 42, 12};
        int key = 11;

        System.out.println(SeqSearch(key, nums, 0));

    }

    public static int SeqSearch (int key, int [] array, int index)
    {
        if (key == array[index])
            return index;
        else if (index >= array.length - 1)
            return -1;
        else
            return SeqSearch(key, array, index + 1);

    }
}