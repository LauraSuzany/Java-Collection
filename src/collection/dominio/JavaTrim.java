package collection.dominio;

import java.util.ArrayList;

// TODO: 12/06/2022   19. Write a Java program to trim the capacity of an array list the current list size.
public class JavaTrim {
   // o Trim() serve para retirar espaços em branco de uma string.
   public static void main(String[] args) {
       ArrayList objects = new ArrayList();
       objects.add("Chair");
       objects.add("Computer");
       objects.add("Book");
       objects.add("Bed");
       objects.add("Remote Control");
       System.out.println("Normal list: " + objects);
       objects.trimToSize();
       System.out.println("list with trim: "+objects);
   }
}
