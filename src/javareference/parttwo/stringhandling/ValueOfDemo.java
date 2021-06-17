package javareference.parttwo.stringhandling;

public class ValueOfDemo {
    public static void main(String[] args) {
        double doubleNum = 3.00;
        int intNum = 3;
        boolean falseValue = false;
        char[] helloWorld = "Hello World".toCharArray();

        String stringDouble = String.valueOf(doubleNum);
        String stringInt = String.valueOf(intNum);
        String stringBoolean = String.valueOf(falseValue);
        String charToString = String.valueOf(helloWorld, 3, 7);


        System.out.println(stringDouble);
        System.out.println(stringInt);
        System.out.println(stringBoolean);
        System.out.println(charToString);
    }
}
