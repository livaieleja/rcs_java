package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task2();
    }

        public static void task1(){
            Scanner sc = new Scanner(System.in);
            Book bk = new Book();

            System.out.println("Ievadiet autora vārdu!");
            bk.name = sc.nextLine();
            System.out.println("Ievadiet autora uzvārdu!");
            bk.lastName = sc.nextLine();
            System.out.println("Ievadiet grāmatas nosaukumu!");
            bk.title = sc.nextLine();
            System.out.println("Ievadiet izdošanas gadu!");
            bk.year = sc.nextLine();

            bk.print();

            Book bk2 = new Book();

            System.out.println("Ievadiet autora vārdu!");
            bk2.name = sc.nextLine();
            System.out.println("Ievadiet autora uzvārdu!");
            bk2.lastName = sc.nextLine();
            System.out.println("Ievadiet grāmatas nosaukumu!");
            bk2.title = sc.nextLine();
            System.out.println("Ievadiet izdošanas gadu");
            bk2.year = sc.nextLine();

            bk2.print();
        }

        public static void task2() {
            List<Student> studentLst = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            Student st = new Student();

            for (int i = 0; i < 5; i++) {
                System.out.println("Ievadiet studenta vārdu!");
                st.name = sc.nextLine();
                System.out.println("Ievadiet studenta uzvārdu!");
                st.lastName = sc.nextLine();
                System.out.println("Ievadiet studenta kursu!");
                st.course = sc.nextInt();

                studentLst.add(st.name, st.lastName, st.course);
            }

                for (var s: studentLst){
                    s.print();
            }
        }


        public static void sample1() {
            Student st = new Student("Jānis", "Bērziņš", 1);
            st.print();

            Student st2 = new Student("Zane", "Lapsa", 2);
            st2.print();

            List<Student> studentLst = new ArrayList<>();
            studentLst.add(st);
            studentLst.add(st2);

            studentLst.add(new Student("Anna", "Ozola", 3));

            studentLst.get(0).lastName = "aaa";

            for (int i = 0; i < studentLst.size(); i++) {
                System.out.println(studentLst.get(i).lastName);
                studentLst.get(i).print();
            }

            for (var s: studentLst){
                s.print();
            }
        }
    }


//        Student st = new Student();
//        st.name = "Jānis";
//        st.lastName = "Bērziņš";
//        st.course = 1;

//        st.print();

//        Student st2 = new Student();
//        st2.name = "Juris";
//        st2.lastName = "Kļava";
//        st2.course = 1;
//        st2.print();