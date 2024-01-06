package javaPrograms;

import java.util.*;

// Collections - List and Set
public class Fruits {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(2);
        Integer integer = myList.get(0);

        List<String> list = new ArrayList<String>();
        //List is an interface -- <Generic>
        list.add("apple");
        list.add("mango");
        list.add("apple");
        list.add("pine");
        list.add("grape");
        Collections.sort(list);
        for(String st : list){
            System.out.println(st);

        }

        String firstValue = list.get(0);
        System.out.println(firstValue);

        boolean empty = list.isEmpty();
        System.out.println("is Empty : " +empty);
        list.clear();
        System.out.println(list.isEmpty());

        boolean contains = list.contains("pine");
        System.out.println("Has Fruit : " +contains);
        //before removing
        for(String eachFruit : list){
            System.out.println(eachFruit);
        }
        list.remove("apple");
        System.out.println("----------");
        //after removing
        for(String eachFruit : list){
            System.out.println(eachFruit);
        }
        int size = list.size();
        System.out.println("Size: " +size);

        Set<String> set = new HashSet<String>();
        set.add("apple");
        set.add("mango");
        set.add("apple");
        set.add("pine");
        set.add("grape");

        for(String oneFr : set) {
            System.out.println(oneFr);
        }
        // o/p: Removes duplicates - based on order of insertion --> show the data order differently

        Set<String> set1 = new TreeSet<String>();
        set.add("apple");
        set.add("mango");
        set.add("apple");
        set.add("pine");
        set.add("grape");

        for(String oneFr : set1) {
            System.out.println(oneFr);
        }
        // o/p : sort the data based on ASCII or alphabetical order.

        Set<String> set2 = new LinkedHashSet<>();
        set.add("apple");
        set.add("mango");
        set.add("apple");
        set.add("pine");
        set.add("grape");
        // no get function in set
        // To get the data from set
        List<String> mylists = new ArrayList<String>(set2);
        for (String data : mylists){
            System.out.println(data);
        }
        String s = mylists.get(0);
        System.out.println(s);

        boolean cont = set2.contains("pine");
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set2.size());

        for(String oneFr : set2) {
            System.out.println(oneFr);
        }
        // o/p: add data in the given order.





    }
}
