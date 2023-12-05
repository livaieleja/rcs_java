package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List <Student> lst = new ArrayList<>();
        lst.add(new Student ("test", "test2", 1));
        lst.add(new Student ("test2", "test3", 1));

        List <Student> lst2 = getStudentLst(2);

        PrintStudentList(lst2);
    }

    private static List <Student> getStudentLst (int a){
        if ( a < 1){
            System.out.println("Kļūda! "); //a parametrs ir mazāks par 1
            a = 1;
        }
        List <Student> lst = new ArrayList<>();
        Scanner sc = new Scanner (System.in);

        for(int i = 0; i < a; i++) {
            System.out.println("Ievadiet studenta vārdu!");
            String name = sc.nextLine();
            System.out.println("Ievadiet studenta uzvārdu!");
            String lastName = sc.nextLine();
            System.out.println("Ievadiet kursu!");
            int course;
            try {
                course = sc.nextInt();
            }catch (Exception e){
                System.out.println("Kļūda!"); //nav ievadījis ciparu kursa laukā
                course = 1;
            }
            sc.nextLine();

            lst.add(new Student(name, lastName, course));
        }
        return lst;
    }

    private static void PrintStudentList (List<Student> lst){
        if (lst.isEmpty()){
            System.out.println("Saraksts ir tukšs!");
        }
        for (var st : lst ){
            st.print();
        }
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

        public static void task3 (){
            List<Book> bookList = new ArrayList<>();
            Scanner sc = new Scanner(System.in);

            for(int i = 0; i < 5; i++){
                System.out.println("Ievadiet autora vārdu!");
                String name = sc.nextLine();
                System.out.println("Ievadiet autora uzvārdu!");
                String lastName = sc.nextLine();
                System.out.println("Ievadiet grāmatas nosaukumu!");
                String title = sc.nextLine();
                System.out.println("Izdošanas datumu!");
                String year = sc.nextLine();
                bookList.add(new Book(name, lastName, title, year));
            }

            for(int i = 0; i < 5; i++){
                bookList.add(addBook());
            }

            for(int i = 0; i < bookList.size(); i++){
                bookList.get(i).print();
            }
        }

        public static Book addBook(){
        Scanner sc = new Scanner(System.in);

        Book b = new Book();
        System.out.println("Ievadiet autora vārdu!");
        b.name = sc.nextLine();
        System.out.println("Ievadiet autora uzvārdu!");
        b.lastName = sc.nextLine();
        System.out.println("Ievadiet grāmatas nosaukumu!");
        b.title = sc.nextLine();
        System.out.println("Izdošanas datumu:");
        b.year = sc.nextLine();

        return b;
    }

        public static void task2() {
            List<Student> studentLst = new ArrayList<>();
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < 5; i++) {
                System.out.println("Ievadiet studenta vārdu!");
                String name = sc.nextLine();
                System.out.println("Ievadiet studenta uzvārdu!");
                String lastName = sc.nextLine();
                System.out.println("Ievadiet studenta kursu!");
                int course = sc.nextInt();

                studentLst.add(new Student(name, lastName, course));
            }
                for (int i =0; i< studentLst.size(); i++){
                    studentLst.get(i).print();
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