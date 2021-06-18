package javareference.parttwo.collectionsframework;

// Convert an ArrayList into an array.

import java.util.*;

class ArrayListToArray {
    public static void main(String[] args) {
        // Create an array list.
        List<Integer> al = new ArrayList<>();
        // Add elements to the array list.
        al.add(1); // this is possible because of autoboxing
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Contents of al: " + al);
        // Get the array.
        Integer[] ia = new Integer[al.size()];
        ia = al.toArray(ia);
        int sum = 0;
        // Sum the array.
        for (int i : ia)
            sum += i;
        System.out.println("Sum is: " + sum);
    }
}
