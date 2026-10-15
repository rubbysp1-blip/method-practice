package com.pluralsight;

public class CompareNumbers {

    public static void main(String[] args) {

        System.out.println(isEven(10));
        System.out.println();

    }

    //Create this method: isEven(int number)  returns true if even
    public static boolean isEven(int number){
        return number % 2 == 0;

    }

    //Create: isPositive(double number) returns true if > 0
    public static boolean isPositive(double number){
        return number > 0;
    }
}
