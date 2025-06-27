package com.dao;

import com.dto.Employee;

public interface CRUD {
  public String insert(Employee emp);
  public Employee[] read();
}
