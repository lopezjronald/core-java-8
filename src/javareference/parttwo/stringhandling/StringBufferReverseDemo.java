package javareference.parttwo.stringhandling;

// Using reverse() to reverse a StringBuffer.
class StringBufferReverseDemo {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("abcdef");
        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }
}
