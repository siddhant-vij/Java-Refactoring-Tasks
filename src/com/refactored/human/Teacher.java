package com.refactored.human;

public class Teacher extends UniversityPerson {
  private int numberOfStudents;

  public Teacher(String name, int age, int numberOfStudents) {
    super(name, age);
    this.name = name;
    this.age = age;
    this.numberOfStudents = numberOfStudents;
  }

  public void live() {
    teach();
  }

  public void teach() {
  }

  public String getPosition() {
    return "Teacher";
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }
}