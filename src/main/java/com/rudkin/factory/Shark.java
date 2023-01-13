package com.rudkin.factory;

public class Shark implements Animal {

    @Override
    public void makeSound() {
        System.out.println("I'll eat you!");
    }
}
