package collection.dominio;

import java.util.ArrayList;

//TODO: 06/06/2022 2.Write a Java program to iterate through all elements in a array list.
public class ArrayNumber {
    public static void main(String[] args) {
        ArrayList<Integer> numbersArray = new ArrayList<>();
        numbersArray.add(1);
        numbersArray.add(2);
        numbersArray.add(3);
        numbersArray.add(4);
        numbersArray.add(5);
        numbersArray.add(6);
        numbersArray.add(7);
        numbersArray.add(8);
        numbersArray.add(9);
        numbersArray.add(10);
        System.out.println(numbersArray);
        for (Integer number:numbersArray) {
            System.out.println("Number: "+number);
        }
    }
}
