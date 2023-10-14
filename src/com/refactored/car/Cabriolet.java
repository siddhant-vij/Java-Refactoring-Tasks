package com.refactored.car;

public class Cabriolet extends Car {
  private final int MAX_CABRIOLET_SPEED = 90;

  public Cabriolet(int numberOfPassengers) {
    super(CABRIOLET, numberOfPassengers);
  }

  @Override
  public int getMaxSpeed() {
    return MAX_CABRIOLET_SPEED;
  }
  
}
