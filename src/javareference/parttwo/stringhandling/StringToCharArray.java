package javareference.parttwo.stringhandling;

public class StringToCharArray {
    public static void main(String[] args) {
        String abc = "abc";
        char[] abcChar = abc.toCharArray();
        System.out.println(abcChar);
        for (char letter: abcChar) {
            System.out.println(letter);
        }
    }
}
