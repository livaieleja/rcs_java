package org.example;

public class Pet {

    public String name;
    public String type;
    public int age;
    public String email;

    public Pet (){
        this.name = "";
        this.type = "";
        this.age = 0;
        this.email  = "";
    }

    public Pet(String name, String type, int age, String email){
        this.name = name;
        this.type = type;
        this.age = age;
        this.email = email;

    }
}
