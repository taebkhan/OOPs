package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

    public void Demo(){

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);

        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        System.out.println("Unique integers from the list: " + uniqueNumbers);
    }
}
