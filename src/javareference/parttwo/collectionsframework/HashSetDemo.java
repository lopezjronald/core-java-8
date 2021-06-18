package javareference.parttwo.collectionsframework;

// Demonstrate HashSet.
import java.util.*;
class HashSetDemo {
    public static void main(String args[]) {
        // Create a hash set.
        Set<String> hs = new HashSet<>();
        // Add elements to the hash set.
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");
        System.out.println(hs);
    }
}
