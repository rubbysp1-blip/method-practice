package com.pluralsight;

public class Format {

    public static void main(String[] args) {

        formatName("Bob", "Smith");


    }

    //Create this method: formatName(String first, String last)
    public static String formatName(String first, String last){

        String newFormat = first + last;
        return (newFormat);
    }


}
