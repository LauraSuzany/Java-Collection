package collection.dominio;

import java.util.ArrayList;

// TODO: 12/06/2022 13. Write a Java program to compare two array lists.
public class ArrayCompare {
    public static void main(String[] args) {
        //=============================================================================================================//
        //                                        ESSA FOI A MANEIRA COMO EU FIZ
        //=============================================================================================================//
        ArrayList objects = new ArrayList();
        objects.add("Chair");
        objects.add("Computer");
        objects.add("Book");
        objects.add("Bed");
        objects.add("Remote Control");
        System.out.println("First list: "+objects);

        ArrayList objects2 = new ArrayList();
        objects2.add("Chair");
        objects2.add("Computer");
        objects2.add("Book");
        objects2.add("Bed");
        objects2.add("Remote Control");
        System.out.println("Second list: "+objects2);

        if(objects.equals(objects2)){
            System.out.println("The lists mentioned are the same");
        }else {
            System.out.println("The lists mentioned are not equals!");
        }

        //=============================================================================================================//
        //                                                      NO SITE
        //=============================================================================================================
        //https://www.w3resource.com/java-exercises/collection/java-collection-exercise-13.php
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        //Storing the comparison output in ArrayList<String>
        ArrayList<String> c3 = new ArrayList<String>();
        for (String e : c1)
            c3.add(c2.contains(e) ? "Yes" : "No"); // lEMBRANDO QUE O QUE ESTÁ SENDO USADO AQUI É UM Operador Ternário ( ? : )
        //EX: condição ? expressão1_se_true : expressão2_se_false
        System.out.println(c3);

    }
}
