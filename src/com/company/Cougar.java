package com.company;

/**
 * Created by VeryBarry on 9/20/16.
 */
public class Cougar extends Mammal {
    Cougar () {
        this.name = "Cougar";
    }


    @Override
    void makeSound(){
        super.makeSound();
        System.out.println("raaaawr");
    }
}
