package com.mycompany.app;

import java.math.BigDecimal;

public class GenerousBoss {

  private EmployeeDAO employeeDAO;

  public GenerousBoss(EmployeeDAO employeeDAO) {
    this.employeeDAO = employeeDAO;
  }

  public void giveRaiseTo(int id, BigDecimal amount) {
    if (amount.compareTo(BigDecimal.ZERO) < 0) {
      throw new IllegalArgumentException("raise amount must be positive: " + amount);
    }

    Employee luckyOne = employeeDAO.findById(id);
    raiseSalary(luckyOne, amount);
  }

  public void giveRaiseToAll(BigDecimal amount) {
    if (amount.compareTo(BigDecimal.ZERO) < 0) {
      throw new IllegalArgumentException("raise amount must be positive: " + amount);
    }

    for (Employee luckyOne : employeeDAO.findAll()) {
      raiseSalary(luckyOne, amount);
    }
  }

  private void raiseSalary(Employee employee, BigDecimal amount) {
    BigDecimal oldSalary = employee.getSalary();
    BigDecimal newSalary = oldSalary.add(amount);
    employee.setSalary(newSalary);
    employeeDAO.save(employee);
  }
}
