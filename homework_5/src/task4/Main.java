package task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int max = 0;
        int min = 21;

        ArrayList <Integer> numList = new ArrayList<>(10);

        for (int i = 0; i != 10; i++){
            numList.add(i, (int)(10 + Math.random()*11));
        }

        System.out.println("Old list: " + numList);

        for (int i = 0; i != 10; i++){
            if (numList.get(i) > max){
                max = numList.get(i);
            }
        }

        for (int i = 0; i != 10; i++){
            if (numList.get(i) < min){
                min = numList.get(i);
            }
        }
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

        Iterator <Integer> iterator = numList.iterator();

        for(int i = 0;  i < numList.size(); i++) {
            int temp = iterator.next() + 1;
            numList.set(i, temp);
        }
        
        System.out.println("New list: " + numList);
    }
}

