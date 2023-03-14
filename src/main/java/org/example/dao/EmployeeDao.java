package org.example.dao;

public interface EmployeeDao {

    public String findNameById(Integer id);

    public boolean findByEmailAndPwd(String email, String pwd);
}
