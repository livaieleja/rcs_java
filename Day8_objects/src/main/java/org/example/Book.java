package org.example;

public class Book {
    public String name;
    public String lastName;
    public String title;
    public String year;

    public void print(){
        System.out.println(name + " " + lastName);
        System.out.println(title);
        System.out.println(year);
        System.out.println("-----------------");
    }
}
