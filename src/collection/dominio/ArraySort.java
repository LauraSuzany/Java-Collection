package collection.dominio;

import java.util.ArrayList;
import java.util.Collections;

// TODO: 06/06/2022 8. Write a Java program to sort a given array list
public class ArraySort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(13);
        numbers.add(3);
        numbers.add(5);
        numbers.add(50);
        numbers.add(7);
        System.out.println("Here we have an unordered list: "+numbers);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        //Here i'm Using the sort() method that a framework collections
        Collections.sort(numbers);
        System.out.println("Here we have an unordered list: "+numbers);
    }
}
