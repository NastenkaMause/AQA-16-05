package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Mause on 1/13/2017.
 */
public class Task_1 {

    private Scanner myScanner = new Scanner(System.in);
    private String strInput;
    int myNum = 5;
    int [] myNums = new int[myNum];
    int a, b, c;
    boolean none = true;
    private Random myRand =  new Random();
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int [] myArray;

    public void Greeting() {
        System.out.println("Please input your name: ");
        strInput = myScanner.next();
        System.out.println("Hi! Dear, " + strInput);
    }
    public void ReverseInput() {
        System.out.println("Please tell something: ");
        strInput = myScanner.next();
        System.out.println("Your input is reversed: " + new StringBuilder(strInput).reverse().toString());
    }
    public void DisplayRandNums() {
        System.out.println("Please tell how many numbers to generate for you? (from 1 to 10) ");
        while(!myScanner.hasNextInt()) {
            System.out.println("Please enter a number! ");
        }
        int i = Integer.parseInt(myScanner.next());
        if (i>10){
            i = 10;
        }
        int [] myArray = new int[i];
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
    }
    public void GuessPwd() {
        System.out.println("Please, try guess my password");
        String mySecretPassword = "123";
        strInput = myScanner.next();
        if (strInput.equals(mySecretPassword))
        {
            System.out.println("Congratulations! You hacked me!!");
        }else {
            System.out.println("No! It's incorrect!");
        }
    }
    public void DisplaySum() {
        myNum = 5;
        int mySum = 0;
        System.out.println("Please enter "+myNum+" numbers: ");
        for (int j = 0; j < myNum; j++) {
            while(!myScanner.hasNextInt()) {
                System.out.println("Please enter a number! ");
            }
            mySum += myScanner.nextInt();
        }
        System.out.println("Total sum of entered numbers is: " + mySum);
    }
    public void OddEvenNums() {
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
    }
    public void MaxMinNums() {
        System.out.println();
                for (int j = 0; j < myNums.length; j++) {
            max = max > myNums[j] ? max : myNums[j];
            min = min < myNums[j] ? min : myNums[j];
        }
        System.out.println("Min number = " + min + "\nMax number = " + max);
    }
    public void DividedByThreeOrNine() {
        System.out.println("These numbers are divided by 3 or 9: ");
        for (int j = 0; j < myNum; j++) {
            if ((myNums[j]%3 == 0) || (myNums[j]%9 == 0) )     {
                System.out.print(myNums[j] + " ");
            }
        }
    }
    public void DividedByFiveAndSeven() {
        System.out.println("\nThese numbers are divided by 5 and 7: ");
        for (int j = 0; j < myNum; j++) {
            if ((myNums[j]%5 == 0) && (myNums[j]%7 == 0) )     {
                System.out.print(myNums[j] + " ");
            }
        }
    }
    public void DistinctiveDigits() {
        System.out.println("\nTask 6.5: All three-digit numbers with only digits that do not repeat");
        min = 1;
        max = 10;
        a = myRand.nextInt(max-min)+min;
        myArray = new int[a];
        System.out.println("Enter " + a + " three-digit numbers:");
        for(int j = 0; j < a; ) {
            try {
                b = myScanner.nextInt();
                if (b < 100 || b > 999) {
                    System.out.println("Please enter THREE-digit number");
                } else {
                    myArray[j] = b;
                    j++;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter THREE-digit number");
                myScanner.next();
            }
        }
        System.out.print("Your input is: ");
        for (int anArray : myArray) {
            System.out.print(anArray + " ");
        }
        System.out.println();
        System.out.println("Three-digit numbers with only digits that do not repeat:");
        for (int anArray : myArray) {
            a = anArray / 100;
            b = (anArray / 10) % 10;
            c = anArray % 10;
            if (a != b && a != c && b != c) {
                System.out.print(anArray + " ");
                none = false;
            }
        }
        if(none)
            System.out.print("none");
        System.out.println();
    }
    public void LuckyDigits() {
        System.out.println("Task 6.6: 'Lucky' digits");
        a = myRand.nextInt(max-min)+min;
        myArray = new int[a];
        System.out.println("Enter " + a + " integers:");
        for(int j = 0; j < a; ) {
            try {
                b = myScanner.nextInt();
                b = Math.abs(b); //makes as num positive
                myArray[j] = b;
                j++;
            } catch (InputMismatchException e) {
                System.out.println("Please enter an INTEGER");
                myScanner.next();
            }
        }
        System.out.print("Your input is: ");
        for (int anArray : myArray) {
            System.out.print(anArray + " ");
        }
        System.out.println();
        System.out.println("'Lucky' numbers are: "); //2314 is lucky
        none = true;
        for (int anArray : myArray) {
            a = anArray;
            b = 0;
            while(a > 0){
                a = a / 10;
                b++;
            }
            if(b % 2 == 0){
                int[] tempArray = new int[b];
                a = anArray;
                for(int j = 0; j < b; j++){
                    tempArray[j] = a % 10;
                    a = a / 10;
                }
                a = 0;
                b = 0;
                for(int j = 0; j < tempArray.length / 2; j++){
                    a += tempArray[j];
                    b += tempArray[tempArray.length - 1 - j];
                }
                if(a == b){
                    System.out.print(anArray + " ");
                    none = false;
                }

            }
        }
        if(none)
            System.out.print("none");
        System.out.println();
    }
    public void HalfSumNeighbours() {
        System.out.println("Task 6.7: Elements with value equal to half of the sum of neighbour elements");
        min = 2;
        max = 10;
        a = myRand.nextInt(max-min)+min;
        myArray = new int[a];
        System.out.println("Enter " + a + " integers:");
        for(int j = 0; j < a; ) {
            try {
                b = myScanner.nextInt();
                b = Math.abs(b);
                myArray[j] = b;
                j++;
            } catch (InputMismatchException e) {
                System.out.println("Please enter an INTEGER");
                myScanner.next();
            }
        }
        System.out.print("Your input is: ");
        for (int anArray : myArray) {
            System.out.print(anArray + " ");
        }

        System.out.println();
        System.out.println("Elements with value equal to half of the sum of neighbour elements are: ");
        none = true;
        for(int j = 0; j < myArray.length; j++) {
            if (j == 0) {
                if (myArray[j] == myArray[j + 1] / 2) {
                    System.out.println(myArray[j] + ", neighbour element: " + myArray[j + 1]);
                    none = false;
                }
            } else if(j == myArray.length - 1){
                if (myArray[j] == myArray[j - 1] / 2) {
                    System.out.println(myArray[j] + ", neighbour element: " + myArray[j - 1]);
                    none = false;
                }
            } else {
                if (myArray[j] == (myArray[j - 1] + myArray[j + 1]) / 2) {
                    System.out.println(myArray[j] + ", neighbour elements: " + myArray[j - 1] + ", " + myArray[j + 1]);
                    none = false;
                }
            }
        }
        if(none)
            System.out.print("none");
        System.out.println();
    }
}