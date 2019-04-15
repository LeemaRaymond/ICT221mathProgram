package com.jetbrain;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int i = 0;
        int count =0;
        while (i < 10) {
            System.out.println("What is 4 + " + i + " ?");
            i++;
        }
        Random rand = new Random();


        for (int j = 0; j <= 10; j++) {
            int rand_int1 = rand.nextInt(12);
            int rand_int2 = rand.nextInt(12);

            if (rand_int1 < rand_int2) {
                System.out.println("What is " + rand_int1 + "+" + rand_int2 + " ?");
                int R = rand_int1 + rand_int2;
                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter result");

                int result = myObj.nextInt();

                if (result == R) {
                    System.out.println("congradulations");
                    count++;
                } else {
                    System.out.println("sorry, wrong answer");
                    count= count -1;
                }

            }

            else {


                System.out.println("What is " + rand_int1 + "-" + rand_int2 + " ?");
                int b = rand_int1-rand_int2;

                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter result");

                int result = myObj.nextInt();
                if (result == b) {
                    System.out.println("congradulations");
                    count++;
                } else {
                    System.out.println("sorry, wrong answer");
                    count--;
                }


            }


        }
        System.out.println("The correct answer is"+ count+"out of 10");
    }
}

