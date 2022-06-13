package collection.dominio;

import java.util.ArrayList;
import java.util.Collections;

// TODO: 12/06/2022 11. Write a Java program to reverse elements in a array list
public class ArrayReverse {
    public static void main(String[] args) {

        ArrayList elements = new ArrayList();
        elements.add("One thousand");
        elements.add(2000);
        elements.add("Three thousand");
        elements.add(3000);
        System.out.println("This is a normal list");
        System.out.println(elements);
        Collections.reverse(elements);
        System.out.println("This is a reversed list");
        System.out.println(elements);
    }
}
