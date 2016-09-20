package com.company;

import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type an animal name:");
        String name = scanner.nextLine();

        Animal a = createAnimal(name);
        System.out.println(a);
    }
    static Animal createAnimal(String name) {
        Animal animal;
        if (name.equalsIgnoreCase("dog")){
            animal = new Cougar();
        }
        else if (name.equalsIgnoreCase("hawk")){
            animal = new Falcon();
        }
        else if (name.equalsIgnoreCase("snake")){
            animal = new Snake();
        }
        else {
            animal = new Animal();
        }
        return animal;
    }
}
