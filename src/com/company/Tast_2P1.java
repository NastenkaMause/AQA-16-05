package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Mause on 1/13/2017.
 */
public class Tast_2P1 {
    private Scanner myScanner = new Scanner(System.in);
    int a, b, c;
    private Random myRand =  new Random();
    int max = 10;
    int min = 1;
    int [] myArray;

    public void ShortestLongestNum () {
        System.out.println("Task 1: Enter n integers. Display the shortest and the longest numbers");
        a = myRand.nextInt(max - min) + min;
        myArray = new int[a];
        System.out.println("Enter " + a + " integers:");
        for (int i = 0; i < a; ) {
            try {
                b = myScanner.nextInt();
                b = Math.abs(b);
                myArray[i] = b;
                i++;
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
        int[] shortest = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        int[] longest = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int anArray : myArray) {
            a = anArray;
            b = 0;
            while (a > 0) {
                a = a / 10;
                b++;
            }
            if (b < shortest[1]) {
                shortest[0] = anArray;
                shortest[1] = b;
            }
            if (b > longest[1]) {
                longest[0] = anArray;
                longest[1] = b;
            }
        }
        System.out.println("The shortest number is: " + shortest[0] + " with " + shortest[1] + " digit" + (shortest[1] > 1 ? "s" : "") + " long");
        System.out.println("The longest number is: " + longest[0] + " with " + longest[1] + " digits long");
        System.out.println();
    }
    public void SortedByLength () {
        System.out.println("Task 2: Enter n integers. Display the numbers sorted by their length");
        a = myRand.nextInt(max - min) + min;
        myArray = new int[a];
        System.out.println("Enter " + a + " integers:");
        for (int i = 0; i < a; ) {
            try {
                b = myScanner.nextInt();
                b = Math.abs(b);
                myArray[i] = b;
                i++;
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
        if (myArray.length > 1) {
            for (int i = 1; i < myArray.length; i++) {
                a = myArray[i - 1];
                b = 0;
                while (a > 0) {
                    a = a / 10;
                    b++;
                }
                a = myArray[i];
                c = 0;
                while (a > 0) {
                    a = a / 10;
                    c++;
                }
                if (b > c) {
                    a = myArray[i];
                    myArray[i] = myArray[i - 1];
                    myArray[i - 1] = a;
                    i = 0;
                }
            }
        }
        System.out.print("Your sorted input is: ");
        for (int anArray : myArray) {
            System.out.print(anArray + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
    public void BiggerThanAvg () {
        System.out.println("Task 3: Enter n integers. Display numbers which have length bigger or equal to average");
        a = myRand.nextInt(max - min) + min;
        myArray = new int[a];
        System.out.println("Enter " + a + " integers:");
        for (int i = 0; i < a; ) {
            try {
                b = myScanner.nextInt();
                b = Math.abs(b);
                myArray[i] = b;
                i++;
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
        c = 0;
        for (int anArray : myArray) {
            a = anArray;
            b = 0;
            while (a > 0) {
                a = a / 10;
                b++;
            }
            c += b;
        }
        c = c % 2 == 0 ? c / myArray.length : c / myArray.length + 1;
        System.out.println("Average length of elements in the array is: " + c);
        System.out.println("Numbers with length more than average are: ");
        for (int anArray : myArray) {
            a = anArray;
            b = 0;
            while (a > 0) {
                a = a / 10;
                b++;
            }
            if (b >= c)
                System.out.println(anArray + " (length = " + b + " digit" + (b > 1 ? "s" : "") + ")");
        }
    }
    public void MinDigitsInNum () {
        System.out.println("Task 4: Enter n integers. Display the first number with minimal number of the same digits");
        a = myRand.nextInt(max-min)+min;
        myArray = new int[a];
        System.out.println("Enter " + a + " integers:");
        for(int i = 0; i < a; ) {
            try {
                b = myScanner.nextInt();
                b = Math.abs(b);
                myArray[i] = b;
                i++;
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
        System.out.println("The first number with least digits in it is: ");
        int[] leastDigitNumber = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        for (int i = 0; i < myArray.length; i++) {
            a = myArray[i];
            b = 0;
            while (a > 0) {
                a = a / 10;
                b++;
            }
            int[] tempArray = new int[b];
            a = myArray[i];
            for(int j = 0; j < tempArray.length; j++){
                tempArray[j] = a % 10;
                a = a / 10;
            }
            c = 0;
            for(int j = 0; j < 10; j++){
                for(int temp : tempArray){
                    if(j==temp) {
                        c++;
                        break;
                    }
                }
            }
            if(c == 1){
                i = myArray.length;
            } else if(c < leastDigitNumber[0]){
                leastDigitNumber[0] = c;
                leastDigitNumber[1] = myArray[i];
            }
        }
        System.out.print(leastDigitNumber[1]);
    }
}