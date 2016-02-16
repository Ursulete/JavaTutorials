package com.CFF;


import java.util.*;
import java.util.Hashtable;

/**
 * Created by dbele on 06/02/16.
 */
public class HashTableExample {

    //Create a HashMap - insertion and removal are faster depending on the speed of the search, this data structure favors it. No nulls allowed in either the key or value. Hashtable does NOT guarantee any kind of order.
    Hashtable balance = new Hashtable();
    Enumeration names;
    String str;
    int bal;



    //Start adding stuff to the table
    public void addingKeyValueExamples(){

        balance.put("Xara", new Integer(3434));
        balance.put("Mahnaz", new Integer(123));
        balance.put("Ayan", new Integer(1378));
        balance.put("Daisy", new Integer(99));
        balance.put("Qadir", new Integer(19));

    }

    public void showExampleContents(){
        names = balance.keys();
        while(names.hasMoreElements()){
            str = (String) names.nextElement();
            System.out.println(str + ":" + balance.get(str));
        }
    }

    public void addingUpdateToFirstKey(){
        bal = ((Integer)balance.get("Xara")).intValue();
        balance.put("Xara", new Integer(bal + 1000));
        System.out.println("Xara's new balance is" + " " + balance.get("Xara"));
    }


    // le exemplyfy the lil' HashTable example class
    public void puttingHashTablesAllTogether() {
        addingKeyValueExamples();
        showExampleContents();
        System.out.println();
        addingUpdateToFirstKey();
    }
}
