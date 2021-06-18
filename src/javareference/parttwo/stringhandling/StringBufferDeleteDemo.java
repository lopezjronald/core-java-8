package javareference.parttwo.stringhandling;

// Demonstrate delete() and deleteCharAt()
public class StringBufferDeleteDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is a test.");
        System.out.println("Before delete(): " + sb);

        System.out.println("After delete(): " + sb.delete(4, 7));
        sb.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + sb);
    }
}
