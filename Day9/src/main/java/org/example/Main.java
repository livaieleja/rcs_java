package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pet> pets = Tools.createPetList();
        Tools.addPet(pets);

        printLst(pets);

    }
    private static void printLst (List<Pet> pets){
        for (var pet: pets){
            pet.print();
        }
    }
}