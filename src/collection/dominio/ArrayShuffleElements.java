package collection.dominio;

import java.util.ArrayList;
import java.util.Collections;

// TODO: 06/06/2022 10. Write a Java program to shuffle elements in a array list.
// todo Escreva um programa Java para embaralhar elementos em uma lista de arrays
public class ArrayShuffleElements {
    public static void main(String[] args) {
        ArrayList colors = new ArrayList();
        colors.add("Green");
        colors.add("Red");
        colors.add("Black");
        colors.add("White");
        colors.add("Yellow");
        System.out.println("Normal list :"+ colors);
        Collections.sort(colors);
        System.out.println("Ordered list :"+ colors);
        Collections.shuffle(colors);
        System.out.println("shuffled  list :"+ colors);
    }
}
