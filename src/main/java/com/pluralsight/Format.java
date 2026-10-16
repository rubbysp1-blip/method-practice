package com.pluralsight;

public class Format {

    public static void main(String[] args) {

        //String variable to hold the name of the person
        String persoName = formatName("Bob", "Smith");
        //Print the name in the new format
        System.out.println(persoName);

    }

    //Create this method: formatName(String first, String last)
    public static String formatName(String first, String last){
        //String variable to return the new format (last, first)
        String newFormat = last + ", " + first;
        return (newFormat);
    }


}
