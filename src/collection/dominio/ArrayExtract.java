package collection.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// TODO: 12/06/2022  12. Write a Java program to extract a portion of a array list
public class ArrayExtract {
    public static void main(String[] args) {
        ArrayList objects = new ArrayList();
        objects.add("Chair");
        objects.add("Computer");
        objects.add("Book");
        objects.add("Bed");
        objects.add("Remote Control");
        //I want take (Computer, Book and Bed)
        System.out.println(objects);
        List subListObject = objects.subList(1,4);
        System.out.println(subListObject);
    }
}
