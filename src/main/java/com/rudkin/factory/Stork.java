package com.rudkin.factory;

import javax.naming.OperationNotSupportedException;

public class Stork {

  private String name;

  public static Animal bringAnimal(String behaviour) throws OperationNotSupportedException {
    //null check
    if (behaviour.equalsIgnoreCase("good")) {
      return new Cat();
    }
    if (behaviour.equalsIgnoreCase("bad")) {
      return new Shark();

    } else throw new OperationNotSupportedException("there are only good and bad animals!");
  }

  public static void main(String[] args) throws OperationNotSupportedException {
    Animal animal = Stork.bringAnimal("bad");
    animal.makeSound();
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

