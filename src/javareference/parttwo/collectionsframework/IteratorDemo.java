package javareference.parttwo.collectionsframework;

// Demonstrate iterators.

import java.util.*;

class IteratorDemo {
    public static void main(String[] args) {
        // Create an array list.
        List<String> al = new ArrayList<>();
        // Add elements to the array list.
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        // Use iterator to display contents of al.
        System.out.print("Original contents of al: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) { // Returns true if there is a next element. Otherwise, return false.
            String element = itr.next(); // Returns the next element. A NoSuchElementException is thrown if there is not a next element.
            System.out.print(element + " ");
        }
        System.out.println();
        // Modify objects being iterated.
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            String element = litr.next(); // Returns the next element. A NoSuchElementException is thrown if there is not a next element.
            litr.set(element + "+");
        }
        System.out.print("Modified contents of al: ");
        itr = al.iterator();
        while (itr.hasNext()) {  // Returns true if there is a next element. Otherwise, return false.
            String element = itr.next(); // Returns the next element. A NoSuchElementException is thrown if there is not a next element.
            System.out.print(element + " ");
        }
        System.out.println();
        // Now, display the list backwards.
        System.out.print("Modified list backwards: ");
        while (litr.hasPrevious()) { // Returns true if there is a previous element. Otherwise, returns false.
            String element = litr.previous(); // Returns the previous element. A NoSuchElementException is thrown if there is not a previous element.
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
