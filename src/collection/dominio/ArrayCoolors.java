package collection.dominio;

import java.util.ArrayList;
//todo 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
public class ArrayCoolors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("White");
        colors.add("Gray");
        colors.add("Brown");
        colors.add("Pink");

        for (String color: colors) {//Não precisa deste for
            System.out.println(color);
        }
        System.out.println("colors"+colors);

    }
}
