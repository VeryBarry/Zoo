package com.company;

/**
 * Created by VeryBarry on 9/20/16.
 */
public class Animal {
    String name;

    void makeSound(){
        System.out.println("Firetruck noise");
    }

    @Override
    public String toString(){
        return name;
    }
}
