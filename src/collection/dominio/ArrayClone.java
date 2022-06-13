package collection.dominio;

import java.util.ArrayList;

//// TODO: 12/06/2022 16. Write a Java program to clone an array list to another array list.
// TODO: 16. Write a Java program to clone an array list to another array list.
public class ArrayClone {
    public static void main(String[] args) {
        ArrayList objects = new ArrayList();
        objects.add("Chair");
        objects.add("Computer");
        objects.add("Book");
        objects.add("Bed");
        objects.add("Remote Control");
        System.out.println("First list: " + objects);

        ArrayList newClone = new ArrayList();
        newClone = (ArrayList)objects.clone();
        System.out.println("Second ArrayList is: "+ newClone);

        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
        System.out.println("Cloned array list: " + newc1);


    }
}
