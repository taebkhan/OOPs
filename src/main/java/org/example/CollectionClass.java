package org.example;

import java.util.*;

public class CollectionClass
{

    public void ArrayListDemo() {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Date");
        list.add("Apple");
        list.add("Cherry");
        list.add("Banana");

        System.out.println();
        System.out.println("All elements:");
        System.out.println(list);


        System.out.println();
        System.out.println("After removing an element:");
        //Remove element
        list.remove("Cherry");
        System.out.println(list);

        System.out.println();
        System.out.println("Sorting the list:");
        // Sort the ArrayList
        Collections.sort(list);
        System.out.println(list);

        // Remove duplicates
        Set<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);

        // Using for loop
        System.out.println();
        System.out.println("Print collection using 'for' loop");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Using Iterator
        System.out.println();
        System.out.println("Print collection using iterator");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void HashSetDemo() {
        // Create a HashSet and add elements
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Date");
        set.add("Apple");
        set.add("Cherry");
        set.add("Banana");

        System.out.println();
        System.out.println("All elements:");
        System.out.println(set);

        System.out.println();
        System.out.println("After removing an element:");
        //Remove element
        set.remove("Cherry");
        System.out.println(set);

        // Using enhanced for loop
        System.out.println();
        System.out.println("Print collection using 'for' loop:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Using Iterator
        System.out.println();
        System.out.println("Print collection using Iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void TreeSetDemo() {
        Set<String> _treeset = new TreeSet<>();
        _treeset.add("Banana");
        _treeset.add("Cherry");
        _treeset.add("Apple");
        _treeset.add("Date");
        _treeset.add("Apple");

        System.out.println();
        System.out.println("All elements:");
        System.out.println(_treeset);

        System.out.println();
        System.out.println("After removing an element:");
        //Remove element
        _treeset.remove("Cherry");
        System.out.println(_treeset);

        // Using enhanced for loop
        System.out.println();
        System.out.println("Print collection using 'for' loop:");
        for (String fruit : _treeset) {
            System.out.println(fruit);
        }

        // Using Iterator
        System.out.println();
        System.out.println("Print collection using Iterator:");
        Iterator<String> iterator = _treeset.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}