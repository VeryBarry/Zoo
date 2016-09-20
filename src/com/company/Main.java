package com.company;

public class Main {

    public static void main(String[] args) {
        Cougar c = new Cougar();
        Falcon f = new Falcon();
        Snake s = new Snake();

        c.makeSound();
        f.makeSound();
        s.makeSound();

        System.out.println(c);
        System.out.println(f);
        System.out.println(s);
    }
}
