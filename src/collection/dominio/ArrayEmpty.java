package collection.dominio;

import java.util.ArrayList;

// TODO: 12/06/2022 17. Write a Java program to empty an array list.
public class ArrayEmpty {

    public static void main(String[] args) {
        ArrayList objects = new ArrayList();
        objects.add("Chair");
        objects.add("Computer");
        objects.add("Book");
        objects.add("Bed");
        objects.add("Remote Control");
        System.out.println("First list: " + objects);
    objects.removeAll(objects);
        System.out.println("Lista vazia : "+objects);
    }
}
