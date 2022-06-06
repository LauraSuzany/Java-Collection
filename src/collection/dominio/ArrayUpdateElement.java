package collection.dominio;

import java.util.ArrayList;

// TODO: 06/06/2022 5. Write a Java program to update specific array element by given element.
public class ArrayUpdateElement {
    public static void main(String[] args) {
        ArrayList elements = new ArrayList();//no type
        elements.add(1);
        elements.add("One");
        elements.add(2);
        elements.add("Two");
        elements.add(3);
        elements.add("Three");
        elements.add(4);
        elements.add("Five");
        System.out.println("    ***List before update***");
        System.out.println(elements);
        System.out.println("    ***List after update***");
        elements.set(7, "Four");
        System.out.println(elements);

    }
}
