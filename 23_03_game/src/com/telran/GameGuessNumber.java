package com.telran;

import java.util.Random;
import java.util.Scanner;

public class GameGuessNumber {
     static Scanner scanner = new Scanner(System.in);
     static Random secret = new Random();



     public void start(){
         System.out.println("Okay, lets start the game!!!");
         guessNumber(readNumberOfAttempts());

     }

    private int readNumberOfAttempts(){
        System.out.println("How many attempts would you like to use?");
        int attempts = scanner.nextInt();
        System.out.printf("Alright %d attempts",attempts);
        return attempts;

    }

    private int readNumber(){

        return scanner.nextInt();

    }

    private void guessNumber(int attempts){
        int number = secret.nextInt(10);
        System.out.println();
        do{

            System.out.println("Enter number from 0 to 9");
            int enteredNum = readNumber();
            if (number == enteredNum){
                System.out.println("Right number! Congrats");
                break;
            }else {
                System.out.println("Wrong! Try again...");
                if (number > enteredNum){
                    System.out.println("Its bigger then " + enteredNum);
                }else{
                    System.out.println("Its smaller then " + enteredNum);
                }
            }

        }while(attempts>0);

    }
}
