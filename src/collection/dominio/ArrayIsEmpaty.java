package collection.dominio;

import java.util.ArrayList;

// TODO: 12/06/2022   18. Write a Java program to test an array list is empty or not.
public class ArrayIsEmpaty {
    public static void main(String[] args) {
        ArrayList objects = new ArrayList();
        objects.add("Chair");
        objects.add("Computer");
        objects.add("Book");
        objects.add("Bed");
        objects.add("Remote Control");
        System.out.println("First list: " + objects);
        //==============================================================================================================
                            //PARA TESTAR A VALIDAÇÃO É SÓ DESCOMENTAR O BLOCO EM DESTAQUE
        //==============================================================================================================
        //DESCOMENTE AQUI!
        objects.removeAll(objects);

        if(objects.isEmpty()){
            System.out.println("Esse array está vazio");
        }else {
            System.out.println("Esse array não está vazio");
        }
    }
}
