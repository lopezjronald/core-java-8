package javareference.partone.autoboxing;

// Demonstrate autoboxing/unboxing.
public class AutoBoxDemo {
    public static void main(String[] args) {
        Integer iOb = 100; // autobox an int
        int i = iOb; // auto-unbox
        System.out.println(i + " " + iOb); // displays 100 100
    }
}
