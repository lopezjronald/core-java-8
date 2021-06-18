package javareference.parttwo.collectionsframework;

// Demonstrate TreeSet.

import java.util.*;

class TreeSetDemo {
    public static void main(String[] args) {
        // Create a tree set.
        NavigableSet<String> ts = new TreeSet<>();
        // Add elements to the tree set.
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);
        System.out.println(ts.subSet("C", "F"));
    }
}
