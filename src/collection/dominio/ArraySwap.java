package collection.dominio;

import java.util.ArrayList;
import java.util.Collections;

// TODO: 12/06/2022  14. Write a Java program of swap two elements in an array list.
public class ArraySwap {
    public static void main(String[] args) {
        ArrayList objects = new ArrayList();
        objects.add("Chair");
        objects.add("Computer");
        objects.add("Book");
        objects.add("Bed");
        objects.add("Remote Control");
        System.out.println("Normal list: "+objects);
        //I'm going to change the chair for the bed
        Collections.swap(objects, 0, 3);
        System.out.println("exchanged list : "+objects);

    }
}
