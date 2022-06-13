package collection.dominio;

import java.util.ArrayList;

// TODO: 12/06/2022 15. Write a Java program to join two array lists.
public class ArrayJoin {
    public static void main(String[] args) {
        //=============================================================================================================//
        //                                        ESSA FOI A MANEIRA COMO EU FIZ
        //=============================================================================================================//
        ArrayList<String> subjects1 = new ArrayList<>();
        subjects1.add("Math");
        subjects1.add("Chemistry");
        subjects1.add("Geography");
        System.out.println("Primeira lista :"+subjects1);

        ArrayList<String> subjects2 = new ArrayList<>();
        subjects2.add("Physical");
        subjects2.add("Story");
        System.out.println("Segunda lista :"+subjects2);

        subjects1.addAll(0, subjects2);
        System.out.println("Junção lista 1 + lista 2 : "+subjects1);

        //=============================================================================================================//
        //                                                      NO SITE
        //=============================================================================================================
        //https://www.w3resource.com/java-exercises/collection/java-collection-exercise-15.php
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("List of first array: " + c1);
        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("List of second array: " + c2);

        // Let join above two list
        ArrayList<String> a = new ArrayList<String>();
        a.addAll(c1);
        a.addAll(c2);
        System.out.println("New array: " + a);
    }
}
