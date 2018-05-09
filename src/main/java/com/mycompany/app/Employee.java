package com.mycompany.app;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {
  private final int id;
  private String name;
  private BigDecimal salary;

  public Employee(int id, String name, BigDecimal salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return id == employee.id &&
           Objects.equals(name, employee.name) &&
           Objects.equals(salary, employee.salary);
  }

  @Override
  public int hashCode() {

    return Objects.hash(id, name, salary);
  }

  @Override
  public String toString() {
    return "Employee{" +
           "id=" + id +
           ", name='" + name + '\'' +
           ", salary=" + salary +
           '}';
  }
}
