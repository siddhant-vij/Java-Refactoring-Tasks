package com.refactored.car;

import java.util.Date;

public abstract class Car {
  static public final int TRUCK = 0;
  static public final int SEDAN = 1;
  static public final int CABRIOLET = 2;

  double fuel;

  public double summerFuelConsumption;
  public double winterFuelConsumption;
  public double winterWarmingUp;

  private static int type;

  private boolean driverAvailable;
  private int numberOfPassengers;

  protected Car(int type, int numberOfPassengers) {
    Car.type = type;
    this.numberOfPassengers = numberOfPassengers;
  }

  public static int getType() {
    return type;
  }

  public static Car create(int type, int numberOfPassengers) {
    if (getType() == TRUCK)
      return new Truck(numberOfPassengers);
    else if (getType() == SEDAN)
      return new Sedan(numberOfPassengers);
    else if (getType() == CABRIOLET)
      return new Cabriolet(numberOfPassengers);
    else
      return null;
  }  

  public void fill(double numberOfGallons) throws Exception {
    if (numberOfGallons < 0)
      throw new Exception();
    fuel += numberOfGallons;
  }

  public boolean isSummer(Date date, Date summerStart, Date summerEnd) {
    return date.after(summerStart) && date.before(summerEnd);
  }

  public double getWinterConsumption(int length) {
    return length * winterFuelConsumption + winterWarmingUp;
  }

  public double getSummerConsumption(int length) {
    return length * summerFuelConsumption;
  }

  public double getTripConsumption(Date date, int length, Date summerStart, Date summerEnd) {
    if (isSummer(date, summerStart, summerEnd)) {
      return getSummerConsumption(length);
    } else {
      return getWinterConsumption(length);
    }
  }

  private boolean canPassengersBeCarried() {
    return isDriverAvailable() && fuel > 0;
  }

  public int getNumberOfPassengersThatCanBeCarried() {
    if (!canPassengersBeCarried())
      return 0;

    return numberOfPassengers;
  }

  public boolean isDriverAvailable() {
    return driverAvailable;
  }

  public void setDriverAvailable(boolean driverAvailable) {
    this.driverAvailable = driverAvailable;
  }

  public void startMoving() {
    if (numberOfPassengers > 0) {
      fastenPassengerBelts();
    }
    fastenDriverBelt();
  }

  public void fastenPassengerBelts() {
  }

  public void fastenDriverBelt() {
  }

  public abstract int getMaxSpeed();
}