package com.refactored.human;

public class BloodType {
  private final int code;

  private BloodType(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }

  public static BloodType first() {
    return new BloodType(1);
  }

  public static BloodType second() {
    return new BloodType(2);
  }

  public static BloodType third() {
    return new BloodType(3);
  }

  public static BloodType fourth() {
    return new BloodType(4);
  }
}
