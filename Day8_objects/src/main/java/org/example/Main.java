package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Book bk = new Book ();

        System.out.println("Ievadiet autora vārdu!");
        bk.name = sc.nextLine();
        System.out.println("Ievadiet autura uzvārdu!");
        bk.lastName = sc.nextLine();
        System.out.println("Ievadiet grāmatas nosaukumu!");
        bk.title = sc.nextLine();
        System.out.println("Ievadiet izdošanas gadu");
        bk.year = sc.nextLine();

        bk.print();

        Book bk2 = new Book ();

        System.out.println("Ievadiet autora vārdu!");
        bk2.name = sc.nextLine();
        System.out.println("Ievadiet autura uzvārdu!");
        bk2.lastName = sc.nextLine();
        System.out.println("Ievadiet grāmatas nosaukumu!");
        bk2.title = sc.nextLine();
        System.out.println("Ievadiet izdošanas gadu");
        bk2.year = sc.nextLine();

        bk2.print();

    }
  //       Student st = new Student();
  //       st.name = "Jānis";
  //       st.lastName = "Bērziņš";
  //       st.course = 1;

  //       st.print();

  //      Student st2 = new Student();
  //      st2.name = "Juris";
  //       st2.lastName = "Kļava";
  //      st2.course = 1;
  //       st2.print();
}