package org.example;

public class Student {
    public String name;
    public String lastName;
    public int course;

    public Student(String name, String lastname, int course){ //nestrādās ar statiskām klasēm
        this.name = name;
        this.lastName = lastname;
        this.course = course;
    }

    public void print(){
        System.out.println(name + " " + lastName);
        System.out.println("Kurss: " + course);
        System.out.println("-----------------");
    }
}
