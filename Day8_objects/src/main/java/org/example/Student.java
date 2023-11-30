package org.example;

public class Student {
    public String name;
    public String lastName;
    public int course;

    public void print(){
        System.out.println(name + " " + lastName);
        System.out.println("Kurss: " + course);
        System.out.println("-----------------");
    }
}
