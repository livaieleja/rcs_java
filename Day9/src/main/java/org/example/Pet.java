package org.example;

public class Pet {
    public String name;
    public String type;
    public int age;
    public String email;

    public Pet(String name, String type, int age, String email){
        this.name = name;
        this.type = type;
        this.age = age;
        this.email = email;

    }

    public void print (){
        System.out.println("Mājdzīvnieka vārds: " +name);
        System.out.println("Mājdzīvnieka tips: " +type);
        System.out.println("Mājdzīvnieka vecums: " +age);
        System.out.println("Mājdzīvnieka īpašnieka e-pasts: " +email);
        System.out.println("----------------");
    }
}
