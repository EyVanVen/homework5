package task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int max = 0;
        int min = 21;

        ArrayList numList = new ArrayList(10);
        Iterator itr = numList.iterator();

        Random rand = new Random(10);

        for (int i = 0; i != 10; i++){
            numList.add(i, (int)(10 + Math.random()*11));
        }

        System.out.println("Old list: " + numList);

        for (int i = 0; i != 10; i++){
            if ((int) numList.get(i) > max){
                max = (int) numList.get(i);
            }
        }

        for (int i = 0; i != 10; i++){
            if ((int) numList.get(i) < min){
                min = (int) numList.get(i);
            }
        }
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

        while (itr.hasNext()){
            int i = 0;
            int temp = (int) numList.get(i) + 1;
            numList.set(i, temp);
            System.out.println("New list: " + numList);
        }

        System.out.println("New list: " + numList);
    }
}
