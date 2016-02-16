package com.CFF;

public class Main {

    public static void main(String[] args) {

        System.out.println("************************** Demo Hash Tables *************************** ");
        //Playing around with HashTables - synchronised, hash table can use a floating-point value, a string, another array, or even a structure as the index(key).
        HashTableExample demoHashTables = new HashTableExample();
	    demoHashTables.puttingHashTablesAllTogether();

        System.out.println();
        System.out.println("************************** Demo Linked Hash Maps *************************** ");
        //Playing around with LinkedHashMaps - default entries in insertion order
        LinkedHashMapExample demoLinkedHashMaps = new LinkedHashMapExample();
        demoLinkedHashMaps.puttingLinkedHashMapsAllTogether();

        System.out.println();
        System.out.println("************************** Demo Tree Maps *************************** ");
        //Playing around with TreeMaps - default entries in ascending order
        TreeMapExample demoTreeMaps = new TreeMapExample();
        demoTreeMaps.puttingTreeMapsAllTogether();

        System.out.println();
        System.out.println("************************** Demo Hash Maps *************************** ");
        HashMapExample demoHashMaps = new HashMapExample();
        demoHashMaps.puttingHashMapsAllTogether();

        System.out.println();
        System.out.println("************************** Demo Array Lists *************************** ");
        //Playing around with ArrayLists that can dynamically grow and shrink as per the need.
        ArrayListExample demoArrayLists = new ArrayListExample();
        demoArrayLists.puttingArrayListsAllTogether();

        System.out.println();
        System.out.println("************************** Demo Array Lists Sublists *************************** ");
        //Playing around with ArrayLists sublists first casting them in another ArrayList, then as a List
        ArrayListSublistExample demoArrayListsSublists = new ArrayListSublistExample();
        demoArrayListsSublists.puttingArrayListSublistAllTogether();
    }
}
