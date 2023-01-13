package com.rudkin.factory;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StorkTest {

  @Test
  @SneakyThrows
  void should_ReturnCat_when_GoodBehavior() {
    Animal result = Stork.bringAnimal("good");

    assertTrue(result.getClass().toString().endsWith("Cat"));
  }
}