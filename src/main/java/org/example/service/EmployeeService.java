package org.example.service;

import org.example.dao.EmployeeDao;

public class EmployeeService {

    private EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }

    public String getName(Integer id) {
        String name = employeeDao.findNameById(id);
        return name;
    }

    public String login(String email, String pwd){
        boolean status = employeeDao.findByEmailAndPwd(email,pwd);
        if(status){
            return "SUCCESS";
        }
        else{
            return "FAILURE";
        }
    }
}
