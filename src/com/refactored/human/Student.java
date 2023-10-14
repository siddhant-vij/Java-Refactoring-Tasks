package com.refactored.human;

import java.util.Date;

public class Student extends UniversityPerson {
  private double averageGrade;
  private Date beginningOfSession;
  private Date endOfSession;
  private int course;

  public Student(String name, int age, double averageGrade) {
    super(name, age);
    this.name = name;
    this.age = age;
    this.averageGrade = averageGrade;
  }

  public void live() {
    learn();
  }

  public void learn() {
  }

  public int getCourse() {
    return course;
  }

  public void incAverageGrade(double delta) {
    this.setAverageGrade(this.getAverageGrade() + delta);
  }

  public double getAverageGrade() {
    return averageGrade;
  }

  public void setAverageGrade(double averageGrade) {
    this.averageGrade = averageGrade;
  }

  public void setCourse(int course) {
    this.course = course;
  }

  public Date setBeginningOfSession(Date date) {
    beginningOfSession = date;
    return beginningOfSession;
  }

  public Date setEndOfSession(Date date) {
    endOfSession = date;
    return endOfSession;
  }

  public String getPosition() {
    return "Student";
  }
}