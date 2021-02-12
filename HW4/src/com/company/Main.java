package com.company;
import ibadts.Queue;

public class Main {

    public static void main(String[] args)
    {
        Queue<String> business = new Queue<>();
        Queue<String> economy = new Queue<>();

        String [] bus = {"Sir", "Madam", "Rick"};
        String [] eco = {"Sarah", "John", "Wendy"};

        business.add(bus);
        economy.add(eco);
        int counter = 0;

        while (counter < 2)
        {
            for (int b = 0; b < 2 && !business.isEmpty(); b++)
            {
                System.out.print(business.dequeue() + " ");
            }

            for (int e = 0; e < 1 && !economy.isEmpty(); e++)
            {
                System.out.print(economy.dequeue() + " ");
            }

            if (business.isEmpty())
                System.out.print(economy.dequeue() + " ");

            counter++;
        }
    }
}
