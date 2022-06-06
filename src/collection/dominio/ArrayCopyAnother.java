package collection.dominio;

import java.util.ArrayList;
import java.util.Collections;

// TODO: 06/06/2022 9. Write a Java program to copy one array list into another.
// TODO: 06/06/2022  Fazer de outra maneira
public class ArrayCopyAnother {
    public static void main(String[] args) {
        ArrayList firstList = new ArrayList();
        ArrayList secondList = new ArrayList();
        firstList.add(1);
        secondList.add("Two");
        firstList.add(3);
        secondList.add("Four");
        firstList.add(5);
        secondList.add("six");
        System.out.println("Before");
        System.out.println("First list " + firstList);
        System.out.println("Second list" + secondList);
        //------------------comente aqui -------------------//
        Collections.copy(firstList, secondList);
        System.out.println("First After");
        System.out.println("First list " + firstList);
        System.out.println("Second list" + secondList);
        //------------------comente até aqui -------------------//
        //Obs: Para ver o outro copy coment o bloco em destaque
        Collections.copy(secondList, firstList);
        System.out.println("Second After");
        System.out.println("First list " + firstList);
        System.out.println("Second list" + secondList);

    }//Resposta tirada de: https://www.w3resource.com/java-exercises/collection/java-collection-exercise-9.php
}
