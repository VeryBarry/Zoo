package com.company;

/**
 * Created by VeryBarry on 9/20/16.
 */
public class Snake extends Reptile {
    Snake() {
        this.name = "Snake";
    }

    @Override
    void makeSound() {
        System.out.println("hisssss");
    }
}
