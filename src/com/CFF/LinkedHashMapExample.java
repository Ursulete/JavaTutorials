package com.CFF;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by dbele on 06/02/16.
 */
public class LinkedHashMapExample {

    //Hashy hashy map in order of insertion
    LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();

    //Adding its elements
    public void addingElementsToLinkedHashMap(){
        lhmap.put(22, "Abey");
        lhmap.put(33, "Dawn");
        lhmap.put(1, "Sherry");
        lhmap.put(100, "Jim");
        lhmap.put(2, "Karon");
    }

    public void iteratingThroughTheMap(){
        Set set = lhmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry me = (Map.Entry) iterator.next();
            System.out.println("Key is" + " " + me.getKey() + " " + "& Value is: " + me.getValue());
        }
    }

    public void puttingLinkedHashMapsAllTogether(){
        addingElementsToLinkedHashMap();
        iteratingThroughTheMap();
    }


}
