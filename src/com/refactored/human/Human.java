package com.refactored.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Alive {
  private static int nextId = 0;
  private int id;
  protected int age;
  protected String name;

  public static class Size {
    public int height;
    public int weight;
  }

  protected Size size = new Size();

  private BloodType bloodType;

  private List<Human> children = new ArrayList<>();

  public List<Human> getChildren() {
    return Collections.unmodifiableList(children);
  }

  public void addChild(Human child) {
    children.add(child);
  }

  public void removeChild(Human child) {
    children.remove(child);
  }

  public void setBloodType(BloodType code) {
    bloodType = code;
  }

  public BloodType getBloodType() {
    return bloodType;
  }

  public Human(String name, int age) {
    this.id = nextId;
    nextId++;
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void printSize() {
    System.out.println("Height: " + size.height + " Weight: " + size.weight);
  }

  public void live() {    
  }

  public void printData() {
    System.out.println(getPosition() + ": " + name);
  }

  public String getPosition() {
    return "Person";
  }
}