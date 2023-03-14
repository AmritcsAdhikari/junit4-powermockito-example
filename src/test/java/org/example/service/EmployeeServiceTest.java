package org.example.service;

import org.example.dao.EmployeeDao;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class EmployeeServiceTest {

    @Test
    public void getNameTest(){
        //creating mock object
        EmployeeDao employeeDaoMock = PowerMockito.mock(EmployeeDao.class);

        // defining behaviour for mock object
        when(employeeDaoMock.findNameById(101)).thenReturn("Amrit");

        // injecting mock dao into service thru constructor
        EmployeeService service = new EmployeeService(employeeDaoMock);

        // calling service method
        String name = service.getName(101);

        // validate the result

        assertEquals("Amrit", name);

    }

    @Test
    public void loginTest(){
        //creating mock object
        EmployeeDao employeeDaoMock = PowerMockito.mock(EmployeeDao.class);

        // define mock obj behaviour
        when(employeeDaoMock.findByEmailAndPwd("ashok@gmail.com", "admin")).thenReturn(true);

        // injecting mock obj into service
        EmployeeService service = new EmployeeService(employeeDaoMock);

        String status = service.login("amrit@gmail.com", "admin");

        assertEquals("SUCCESS", status);

    }
}
