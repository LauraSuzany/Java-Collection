package collection.dominio;

import java.util.ArrayList;
import java.util.Collections;

//// TODO: 13/06/2022 21. Write a Java program to replace the second element of a ArrayList with the specified element.
public class ArrayReplace {
    public static void main(String[] args) {
        //==============================================================================================================
                                              //A MANEIRA QUE EU FIZ
        //==============================================================================================================
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("This is a normal list: "+numbers);
        Collections.replaceAll(numbers, 2, 2000);
        System.out.println("This is a replace list: "+numbers);

        //==============================================================================================================
                                                     //SITE
        //=============================================================================================================
        //https://www.w3resource.com/java-exercises/collection/java-collection-exercise-21.php
        ArrayList<String>  color = new ArrayList<String>();
        color.add("Red");
        color.add("Green");

        System.out.println("Original array list: " + color);
        String new_color = "White";
        color.set(1,new_color);

        int num=color.size();
        System.out.println("Replace second element with 'White'.");
        for(int i=0;i<num;i++)
            System.out.println(""+color.get(i));

    }
}
