package collection.dominio;

import java.util.ArrayList;

// TODO: 06/06/2022 3. Write a Java program to insert an element into the array list at the first positio
public class ArrayListInsertFirstPosition {
    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList<>();
        elements.add("elements one");
        elements.add("elements two");
        elements.add(0,"Origem");
        elements.add("elements four");
        elements.add("elements five");
        elements.add(3,"elements three");
        System.out.println(elements);
    }
}
