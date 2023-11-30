package org.example;

public class Book {
    public String name;
    public String lastName;
    public String title;
    public String year;


//    public Book(String name, String lastName, String title, int year){ // šo sauc par konstruktoru!!!
//    this.name = name;
//    this.lastName = lastName;
//    this.year = year;
//}

    public void print(){
        System.out.println(name + " " + lastName);
        System.out.println(title);
        System.out.println(year);
        System.out.println("-----------------");
    }
}
