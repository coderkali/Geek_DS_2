package com.geeks.ds;


abstract class Employee {
  abstract void setSalary(int salary);
  abstract int getSalary();
  abstract void setGrade(String grade);
  abstract String getFrade();
  void label(){
      System.out.println("Employee's data:\n");
  }

}

class Engineer extends Employee{
    private int salary;
    private String grade;


    @Override
    void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    int getSalary() {
        return salary;
    }

    @Override
    void setGrade(String grade) {
      this.grade = grade;
    }

    @Override
    String getFrade() {
        return grade;
    }
}

class Manager extends  Employee {
    private int salary;
    private String grade;

    @Override
    void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    int getSalary() {
        return salary;
    }

    @Override
    void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    String getFrade() {
        return grade;
    }
}



public class EmployeeProfile {
}
