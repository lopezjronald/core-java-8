package javareference.parttwo.stringhandling;

// equals() vs ==
public class EqualsVsOperatorEquals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String(s1);
        System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2)); // compares characters inside String object
        System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2)); // checks reference address
    }
}
