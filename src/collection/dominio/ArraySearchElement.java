package collection.dominio;

// TODO: 06/06/2022 7. Write a Java program to search an element in a array list.
import java.util.ArrayList;

public class ArraySearchElement {
    public static void main(String[] args) {
        ArrayList<String> stringNumbers = new ArrayList<>();
        stringNumbers.add("One");
        stringNumbers.add("Two");
        stringNumbers.add("Three");
        stringNumbers.add("Four");
        stringNumbers.add("Five");
        //WAY I DID IT

        System.out.println("The number "+ stringNumbers.get(3)+" have an index of "+stringNumbers.indexOf("Four"));
        System.out.println("--------------------------------------------------");

        /*Para encontrar a posição de um elemento em um array, você usa o método indexOf(). Este método retorna o índice
         da primeira ocorrência do elemento que você deseja localizar, ou -1 se o elemento não for encontrado*/

        //MANNER TAKEN FROM THE OBJECT OF STUDY
        //https://www.w3resource.com/java-exercises/collection/java-collection-exercise-7.php

        if(stringNumbers.contains("Four")){
            System.out.println("I found de number");
        }else{
            System.out.println("Sorry, number not found!");
        }

    }
}
