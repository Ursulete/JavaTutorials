package com.CFF;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dbele on 15/02/16.
 */
public class ArrayListSublistExample {

    ArrayList<String> al = new ArrayList<String>();

    public void addingElementsToArray() {
        al.add("Steve");
        al.add("Justin");
        al.add("Ajeet");
        al.add("John");
        al.add("Arnold");
        al.add("Chaitanya");
        System.out.println("Original ArrayList Content: " + al);
    }

    public void createSubListArrayList() {
        ArrayList<String> al2 = new ArrayList<String>(al.subList(1, 4));
        System.out.println("SubList stored in ArrayList: " + al2);
    }

    public void createSubListToList() {
        List<String> list = al.subList(1, 4);
        System.out.println("SubList stored in List: " + list);
    }

    public void puttingArrayListSublistAllTogether(){
        addingElementsToArray();
        createSubListArrayList();
        createSubListToList();
    }
}