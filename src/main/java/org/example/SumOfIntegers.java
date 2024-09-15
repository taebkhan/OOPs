package org.example;

import java.util.ArrayList;
import java.util.List;

public class SumOfIntegers {

    public void Sum(){
        Integer SumMethod1 = 0;

        List<Integer> lstIntegers = new ArrayList<>();
        lstIntegers.add(2);
        lstIntegers.add(4);
        lstIntegers.add(6);
        lstIntegers.add(8);
        lstIntegers.add(10);

        for (Integer num : lstIntegers) {
            SumMethod1 = SumMethod1 + num;
        }
        System.out.println("Sum of integers " + lstIntegers + " with Method 1 is : " + SumMethod1);

        int SumMethod2 = lstIntegers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of integers " + lstIntegers + " with Method 2 is : " + SumMethod2);
    }
}
