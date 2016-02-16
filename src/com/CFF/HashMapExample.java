package com.CFF;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by dbele on 06/02/16.
 */
public class HashMapExample {

    HashMap <Integer, String> hmap = new HashMap<Integer, String>();

    public void addingElementsToHashMap(){
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");
    }

    public void iteratingThroughTheHashMap(){
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("Key is: " + mentry.getKey() + " & Key Value is: ");
            System.out.println(mentry.getValue());
        }
    }

    public void getValuesBasedOnKeys(){
        String var = hmap.get(2);
        System.out.print("Value at index 2 is: " + var + "\n");
    }

    public void removeValuesBasedOnKeys(){
        hmap.remove(3);
    }

    public void iteratingThroughTheHashMapAfterRemoval(){
        System.out.println();
        System.out.println("Map keys and values after removal: ");
        Set set2 = hmap.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()){
            Map.Entry mentry2 = (Map.Entry) iterator2.next();
            System.out.print("Key is: " + mentry2.getKey() + " & Value is: ");
            System.out.println(mentry2.getValue());
        }
    }

    public void puttingHashMapsAllTogether(){
        addingElementsToHashMap();
        getValuesBasedOnKeys();
        iteratingThroughTheHashMap();
        removeValuesBasedOnKeys();
        iteratingThroughTheHashMapAfterRemoval();
    }
}
