package com.company;

import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Guess num");
        for (int i = 10; i <= 30; i += 10) playLevel(i);
        System.out.println("You won!");
        scanner.close();
    }
    private static void playLevel(int range){
        int number = (int)(Math.random() * range);
        while (true){
            System.out.println("Number between 0 and " + range);
            int input_number = scanner.nextInt();
            if (input_number == number){
                System.out.println("Right!");
                break;
            } else if(input_number > number) {
                System.out.println("Less");
            } else {
                System.out.println("More");
            }
        }
    }
}
