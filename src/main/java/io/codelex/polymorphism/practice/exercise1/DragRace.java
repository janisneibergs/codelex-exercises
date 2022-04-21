package io.codelex.polymorphism.practice.exercise1;

import java.util.*;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {

        Hashtable carList = new Hashtable();

        Honda honda = new Honda();
        Audi audi = new Audi();
        Bmw bmw = new Bmw();
        Lexus lexus = new Lexus();
        Opel opel = new Opel();
        Tesla tesla = new Tesla();

        for (int i = 0; i < 10; i++) {
            honda.speedUp();
            audi.speedUp();
            bmw.speedUp();
            lexus.speedUp();
            opel.speedUp();
            lexus.useNitrousOxideEngine();
            honda.useNitrousOxideEngine();
            tesla.speedUp();
        }
        carList.put("Honda", honda.showCurrentSpeed());
        carList.put("Audi", audi.showCurrentSpeed());
        carList.put("Bmw", bmw.showCurrentSpeed());
        carList.put("Lexus", lexus.showCurrentSpeed());
        carList.put("Opel", opel.showCurrentSpeed());
        carList.put("Tesla", tesla.showCurrentSpeed());
        System.out.println(carList);
        List<Integer> list = new ArrayList<Integer>(carList.values());
        Collections.sort(list);

       
    }
}
