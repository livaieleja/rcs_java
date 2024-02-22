package com.example.day232;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoService {

    public List<Employee> getEmployees(){
        List<Employee> lst = new ArrayList<>();

        lst.add(new Employee(1, "Janis", "Berzins", 1));
        lst.add(new Employee(2, "Edgars", "Ozols", 4));
        lst.add(new Employee(3, "Juris", "Klava", 3));

        return lst;
    }

    public Employee getEmployee(int id) {
        List<Employee> lst = new ArrayList<>();

        lst.add(new Employee(1, "Janis", "Berzins", 1));
        lst.add(new Employee(2, "Edgars", "Ozols", 4));
        lst.add(new Employee(3, "Juris", "Klava", 3));

        for(Employee e : lst){
            if(e.id == id){
                return e;
            }
        }
        return null;
    }
}
