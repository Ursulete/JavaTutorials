package com.CFF;

import java.util.ArrayList;

/**
 * Created by dbele on 15/02/16.
 */
public class ArrayListExample {

    //ArrayList can dynamically grow and shrink as per the need compared to Arrays which are fix in size.

    ArrayList al = new ArrayList();

    public void createArrayList(){
        System.out.println("Initial size of the array: " + al.size());
    }

    public void addElementsToList(){
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Size of al after additions: " + al.size());
        System.out.println("Contents of al: " + al);
    }

    public void removeElementsFromArray(){
        al.remove("F");
        al.remove(2);
        System.out.println("Size of al after removals: " + al.size());
        System.out.println("Contents of al: " + al);
    }

    public void puttingArrayListsAllTogether(){
        createArrayList();
        addElementsToList();
        removeElementsFromArray();
    }

}

