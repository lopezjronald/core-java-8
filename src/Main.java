import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            numbers.add(i);
//        }
//        System.out.println(numbers);
//
//        List<String> strings = new LinkedList<>();
//        strings.add("birthday");
//        strings.add("apple");
//        strings.add("cookie");
//        System.out.println(strings);
//
//        GenericType <Integer> genInt = new GenericType();
//        String newSomething = "something";
//        int someNum = 1;
//        genInt.printSomething(someNum);
//
//        GenericType <String> genString = new GenericType();
//        genString.printSomething(newSomething);
//
//        int index1 = Collections.binarySearch(strings, "boodfajsdlfjkd");
//        System.out.println(index1);

        System.out.println(256 >> 8);

        GenericType<String> genericType = new GenericType<>();
        genericType.suckIt();
        System.out.println(genericType.getString());
        System.out.println(genericType);

    }
}
