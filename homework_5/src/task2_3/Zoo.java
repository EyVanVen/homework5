package task2_3;

import java.util.*;

public class Zoo {

    public static void main(String[] args) {
        ArrayList <String> animals = new ArrayList <String>();

        animals.add(0, "Snake");
        animals.add(1, "Eagle");
        animals.add(2, "Lion");
        animals.add(3, "Bison");
        animals.add(4, "Frog");
        animals.add(5, "Panther");
        animals.add(6, "Alligator");
        animals.add(7, "Shark");

        System.out.println(animals);

        animals.remove(6);
        animals.remove(4);
        animals.remove(2);

        System.out.println(animals);
    }
}
