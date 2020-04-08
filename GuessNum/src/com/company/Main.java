package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess num");
        int range = 10;
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
        scanner.close();
    }
}
