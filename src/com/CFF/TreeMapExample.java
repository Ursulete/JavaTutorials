package com.CFF;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by dbele on 06/02/16.
 */
public class TreeMapExample {

    TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

    //members are added according to the ascending order of its keys
    public void addingElementsToTheTree(){
        tmap.put(1, "Data 1");
        tmap.put(23, "Data 2");
        tmap.put(70, "Data 3");
        tmap.put(4, "Data 4");
        tmap.put(2, "Data 5");
    }

    public void iteratingThroughTheTree(){
        Set set = tmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("Key is " + mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }
    }

    public void puttingTreeMapsAllTogether(){
        addingElementsToTheTree();
        iteratingThroughTheTree();
    }


}
