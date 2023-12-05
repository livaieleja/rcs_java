package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tools {
    Scanner sc = new Scanner(System.in);

    public List<Pet> createPetList() {
        List<Pet> pets = new ArrayList<>();
        System.out.println("Ievadiet, cik mājdzīvniekus vēlaties ievadīt!");
        int numberOfPets = sc.nextInt();

        for (int i = 0; 1 < numberOfPets; i++) {
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

    public void addPetsToList(List<Pet> pets){
        System.out.println("Ievadiet jaunā mājdzīvnieka vārdu!");
        String name = sc.nextLine();
        System.out.println("Ievadiet jaunā mājdzīvnieka tipu!");
        String type = sc.nextLine();
        System.out.println("Ievadiet jaunā mājdzīvnieka vecumu!");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Ievadiet īpašnieka e-pastu!");
        String email = sc.nextLine();

        pets.add(new Pet(name, type, age, email));
    }
    public void showPetList (List<Pet> pets){
        for (Pet pet: pets){
            System.out.println(pet);
        }
    }
}

