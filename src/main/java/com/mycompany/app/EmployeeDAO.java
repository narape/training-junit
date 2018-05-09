package com.mycompany.app;

import java.util.Collection;

public interface EmployeeDAO {
  Employee findById(int id);

  Collection<Employee> findAll();

  void save(Employee employee);
}
