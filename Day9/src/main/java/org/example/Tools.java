package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tools {
    public static List<Pet> createPetList() {
        Scanner sc = new Scanner(System.in);
        List<Pet> pets = new ArrayList<>();
        System.out.println("Ievadiet, cik mājdzīvniekus vēlaties ievadīt!");
        var numberOfPets = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("Ievadiet mājdzīvnieka vārdu!");
            String name = sc.nextLine();
            System.out.println("Ievadiet mājdzīvnieka tipu!");
            String type = sc.nextLine();
            System.out.println("Ievadiet mājdzīvnieka vecumu!");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Ievadiet īpašnieka e-pastu!");
            String email = sc.nextLine();

            pets.add(new Pet(name, type, age, email));

        }
        return pets;
    }

    public static void addPet(List <Pet> pets) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet mājdzīvnieka vārdu!");
        String name = sc.nextLine();
        System.out.println("Ievadiet mājdzīvnieka tipu!");
        String type = sc.nextLine();
        System.out.println("Ievadiet mājdzīvnieka vecumu!");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Ievadiet īpašnieka e-pastu!");
        String email = sc.nextLine();

        pets.add(new Pet(name, type, age, email));

    }
}

