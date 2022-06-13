package collection.dominio;

import java.util.ArrayList;
//// TODO: 13/06/2022  22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
public class ArrayPosition {
    public static void main(String[] args) {
        ArrayList<String> namesMovieHorror = new ArrayList<>();
        System.out.println("                4 Best Horror Movies");
        namesMovieHorror.add("Resident evil");
        namesMovieHorror.add("Annabelle 'Comes Home'");
        namesMovieHorror.add("Orphan");
        namesMovieHorror.add("Escape Room");
        System.out.println(namesMovieHorror);
        System.out.println("\nPrint using index of an element: ");
        int no_of_elements = namesMovieHorror.size();
        for (int index = 0; index < no_of_elements; index++)
            System.out.println(namesMovieHorror.get(index));
    }
}