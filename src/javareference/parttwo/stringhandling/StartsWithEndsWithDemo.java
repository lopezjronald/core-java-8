package javareference.parttwo.stringhandling;

public class StartsWithEndsWithDemo {
    public static void main(String[] args) {
        String foobar = "Foobar";
        System.out.println("Foobar ends with \"bar\": " + foobar.endsWith("bar"));
        System.out.println("Foobar ends with \"foo\": " + foobar.endsWith("foo"));
        System.out.println("Foobar starts with \"Foo\": " + foobar.startsWith("Foo", 0));
//        System.out.println("Foobar starts with \"Foo\": " + foobar.startsWith("Foo", 3));
        System.out.println("Foobar starts with \"Bar\": " + foobar.startsWith("Bar", 0));
    }
}
