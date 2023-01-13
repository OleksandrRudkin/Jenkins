package com.rudkin.immutable;

import com.rudkin.factory.Stork;

public final class ImmutableEmployee {

  private final Integer id;
  private final String name;
  private final Stork mutableObject;

  public ImmutableEmployee(Integer id, String name, Stork mutableObject) {
    this.id = id;
    this.name = name;
    this.mutableObject = mutableObject;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Stork getMutableObject() {
    Stork cloneStork = new Stork();
    cloneStork.setName(this.mutableObject.getName());

    return cloneStork;
  }
}
