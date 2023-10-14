package com.refactored.human;

import java.util.ArrayList;
import java.util.List;

public class University {
  private List<Student> students = new ArrayList<>();
  private String name;
  private int age;

  public University(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Student getStudentWithAverageGrade(double averageGrade) {
    for (Student student : students) {
      if (student.getAverageGrade() == averageGrade) {
        return student;
      }
    }
    return null;
  }
  public Student getStudentWithHighestAverageGrade() {
    double highestAverageGrade = students.get(0).getAverageGrade();
    for (Student student : students) {
      if (student.getAverageGrade() > highestAverageGrade) {
        highestAverageGrade = student.getAverageGrade();
      }
    }
    return getStudentWithAverageGrade(highestAverageGrade);
  }

  public Student getStudentWithLowestAverageGrade() {
    double lowestAverageGrade = students.get(0).getAverageGrade();
    for (Student student : students) {
      if (student.getAverageGrade() < lowestAverageGrade) {
        lowestAverageGrade = student.getAverageGrade();
      }
    }
    return getStudentWithAverageGrade(lowestAverageGrade);
  }

  public void expel(Student student) {
    students.remove(student);
  }
}
