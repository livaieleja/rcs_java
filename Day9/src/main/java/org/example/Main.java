package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tools tools = new Tools();

        List<Pet> petList = tools.createPetList();

        tools.addPetsToList(petList);

        tools.showPetList(petList);
    }
}