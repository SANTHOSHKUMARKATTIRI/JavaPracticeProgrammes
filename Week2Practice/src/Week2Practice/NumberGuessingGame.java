package Week2Practice;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To The Number Guessing Game");
        System.out.println("I Have Selected a Number (it's 42) for you To Guess");
        int numberToGuess = 42;
        int userGuess = 0;
        int a =0;
        while(userGuess != numberToGuess){
            System.out.println("Enter your Guess:");
            userGuess = sc.nextInt();
            a++;
        } if  (userGuess < numberToGuess ){
            System.out.println("Too Low ! Try Again.");
        } else if(userGuess > numberToGuess){
            System.out.println("Too High ! Try Again.");
        } else {
            System.out.println("Congratulations ! you've guessed the number in "+a+" a");
        }

    }
}
