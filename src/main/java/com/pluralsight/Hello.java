package com.pluralsight;

public class Hello {
    public static void main(String[] args) {

        //Call each method from main()
        sayHello();
        sayGoodbye();
        sayGoodMorning();

    }
    //Create method sayHello() that prints "Hello, World!"
    public static void sayHello(){
        System.out.println("Hello World!");
    }

    //Create method sayGoodbye() that prints "Goodbye!"
    public static void sayGoodbye(){
        System.out.println("Goodbye!");
    }

    //Create method sayGoodMorning() that prints "Good morning!"
    public static void sayGoodMorning(){
        System.out.println("Good Morning!");
    }



}
