package collection.dominio;

import java.util.ArrayList;

// TODO: 06/06/2022 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
public class ArrayRetrieve {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("One");
        colors.add("Two");
        colors.add("Three");
        colors.add("Four");
        colors.add("Five");
        System.out.println("Retrive the element of index three: "+colors.get(3));
        System.out.println("--------------------------------------------------");
        System.out.println("The index of element four: "+colors.indexOf("Four"));
        /*Para encontrar a posição de um elemento em um array, você usa o método indexOf(). Este método retorna o índice
         da primeira ocorrência do elemento que você deseja localizar, ou -1 se o elemento não for encontrado*/
    }
}
