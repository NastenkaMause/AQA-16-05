package com.company;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //
       System.out.println("Please input your name: ");
        Scanner myScanner = new Scanner(System.in);
        String strInput = myScanner.next();
        System.out.println("Hi! Dear, " + strInput);

        System.out.println("Please tell something: ");
        strInput = myScanner.next();
        System.out.println("Your input is reversed: " + new StringBuilder(strInput).reverse().toString());

        System.out.println("Please tell how many numbers to generate for you? (from 1 to 10) ");
        while(!myScanner.hasNextInt()) {
            System.out.println("Please enter a number! ");
        }
        int i = Integer.parseInt(myScanner.next());
        if (i>10){
            i = 10;
        }
        int [] myArray = new int[i];
        Random myRand =  new Random();
        for (int j = 0; j < i; j++) {
            myArray[j] = myRand.nextInt(100-1+1);
        }
        System.out.println("You have entered: ");
        for (int j = 0; j < i; j++) {
            System.out.print(myArray[j]+" ");
        }
        System.out.println();
        for (int j = 0; j < i; j++) {
            System.out.println(myArray[j]+" ");
        }

        System.out.println("Please, try guess my password");
        String mySecretPassword = "123";
        strInput = myScanner.next();
        if (strInput.equals(mySecretPassword))
        {
            System.out.println("Congratulations! You hacked me!!");
        }else {
            System.out.println("No! It's incorrect!");
        }

        int myNum = 5;
        int mySum = 0;
        System.out.println("Please enter "+myNum+" numbers: ");
        for (int j = 0; j < myNum; j++) {
            while(!myScanner.hasNextInt()) {
                System.out.println("Please enter a number! ");
            }
            mySum += myScanner.nextInt();
        }
        System.out.println("Total sum of entered numbers is: " + mySum);


        myNum = 5;
        int [] myNums = new int[myNum];
        System.out.println("Please enter "+myNum+" numbers: ");
        for (int j = 0; j < myNum; j++) {
            while(!myScanner.hasNextInt()) {
                System.out.println("Please enter a number! ");
            }
            myNums[j] = myScanner.nextInt();
        }
        System.out.print("Even numbers: ");
        for (int j = 0; j < myNum; j++) {
            if (myNums[j]%2 == 0)     {
                System.out.print(myNums[j] + " ");
            }
        }
        System.out.println();
        System.out.print("Odd numbers: ");
        for (int j = 0; j < myNum; j++) {
            if (myNums[j]%2 != 0)     {
                System.out.print(myNums[j] + " ");
            }
        }
        System.out.println();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < myNums.length; j++) {
            max = max > myNums[j] ? max : myNums[j];
            min = min < myNums[j] ? min : myNums[j];
        }

        System.out.println("Min number = " + min + "\nMax number = " + max);

        System.out.println("These numbers are divided by 3 or 9: ");
        for (int j = 0; j < myNum; j++) {
            if ((myNums[j]%3 == 0) || (myNums[j]%9 == 0) )     {
                System.out.print(myNums[j] + " ");
            }
        }
        System.out.println("These numbers are divided by 5 and 7: ");
        for (int j = 0; j < myNum; j++) {
            if ((myNums[j]%5 == 0) && (myNums[j]%7 == 0) )     {
                System.out.print(myNums[j] + " ");
            }
        }

    }
}





