package collection.dominio;

import java.util.ArrayList;

// TODO: 06/06/2022 6. Write a Java program to remove the third element from a array list.
public class ArrayRemoveThirdElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);
        numbers.remove(2);
        System.out.println("List with index 2 removed: 'index 2 equals number three'");
        System.out.println(numbers);

    }
}
