package com.company;

/**
 * Created by VeryBarry on 9/20/16.
 */
public class Falcon extends Animal{
   Falcon() {
       this.name = "Falcon";
   }


   @Override
   void makeSound() {
       System.out.println("BRAWWWKKK");
   }
}
