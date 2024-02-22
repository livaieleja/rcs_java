package com.example.day232.Controller;

import com.example.day232.DemoService;
import com.example.day232.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value="/employees", method= RequestMethod.GET)
    List<Employee> getEmployees(){
        System.out.println("This is random message");
        return demoService.getEmployees();
    }

    @RequestMapping(value="/employees/{id}", method= RequestMethod.GET)
    Employee getEmployee(@PathVariable int id){
        return demoService.getEmployee(id);
    }

}