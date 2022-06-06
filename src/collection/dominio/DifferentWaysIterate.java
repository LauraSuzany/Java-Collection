package collection.dominio;

import java.util.*;
//Obs(O sonar não está sendo usado nesta aplicação pois se trata de um objeto de estudo)

// TODO: 06/06/2022 ||DIFFERENT WAYS TO ITERATE A LIST ||
public class DifferentWaysIterate {
    public static void main(String[] args) {
        System.out.println("=_=_=_=_* DIFFERENT WAYS TO ITERATE A LIST *=_=_=_=_=");

        // TODO: 06/06/2022 Method 1° Using Loop
        System.out.println("This list is using 'loop for'");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        for(int i = 0; i < numbers.size(); i++ ){
            System.out.print(numbers.get(i)+" ");
        }

        // TODO: 06/06/2022 Method 2° Método 2: Using the loop while
        System.out.println("\nThis list is using 'loop While'");
        ArrayList<Integer> numbersWithWilhe = new ArrayList<>();
        numbersWithWilhe.add(1);
        numbersWithWilhe.add(2);
        numbersWithWilhe.add(3);
        numbersWithWilhe.add(4);

        //Here i will initializing a variable

        Integer init = 0;

        while (numbersWithWilhe.size() > init){
            System.out.print(numbersWithWilhe.get(init)+" ");
            init++;
        }

        // TODO: 06/06/2022 Method 3° Using ForEach (Particularmente é o meu favorito <3)
        System.out.println("\nThis list is using 'loop ForEach'");
        for (Integer number : numbers) {
            System.out.print(number+ " ");
        }

        // TODO: 06/06/2022 Method 4° Using iterator°
        System.out.println("\nThis list is using 'loop Iterator'");

        // Iterating ArrayList using Iterator

        Iterator iteratorName = numbers.iterator();
            while (iteratorName.hasNext()){
        /*The hasNext() is a method of Java Scanner class which returns true if this scanner has another index in its input*/
        /*hasNext() : o método hasNext() retorna true se o iterador tiver mais elementos.
        next() : o método next() retorna o próximo elemento e também move o ponteiro do cursor para o próximo elemento.*/
            System.out.print(iteratorName.next()+" ");
        }

        // TODO: 06/06/2022 Method 5° Using Lambda
        System.out.println("\nThis list is using 'loop Lambda'");

        numbers.forEach(number -> System.out.print(number+" "));
        // TODO: 06/06/2022 Method 6° Using Enumeration interface
        System.out.println("\nThis list is using 'Enumeration interface'");

        ArrayList<Integer> listEnum = new ArrayList();
        listEnum.add(111);
        listEnum.add(222);
        listEnum.add(333);
        listEnum.add(444);
        listEnum.add(555);
        listEnum.add(777);
        listEnum.add(888);
        Enumeration<Integer> enumerationName = Collections.enumeration(listEnum);
        while (enumerationName.hasMoreElements()){//hasMoreElements() Testa se esta enumeração contém mais elementos.
            System.out.print(enumerationName.nextElement()+" ");
        }
    }
}
