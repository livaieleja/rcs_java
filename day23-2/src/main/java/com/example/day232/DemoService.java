package com.example.day232;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

@Service
public class DemoService {

    public List<Employee> getEmployees(){
        Connection conn = Connect.connect();
        List<Employee> lst = Connect.getEmployees(conn);
        return lst;
    }

    public Employee getEmployee(int id) {
        Connection conn = Connect.connect();
        Employee e = Connect.getEmployee(conn, id);

        return e;
    }
}