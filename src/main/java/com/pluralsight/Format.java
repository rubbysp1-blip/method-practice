package com.pluralsight;

public class Format {

    public static void main(String[] args) {

        String name = formatName("Bob", "Smith");
        System.out.println(name);

    }

    //Create this method: formatName(String first, String last)
    public static String formatName(String first, String last){

        String newFormat = last + ", " + first;
        return (newFormat);
    }


}
