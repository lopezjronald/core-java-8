package javareference.partone.generics;

public class GenericsRunner {
    public static void main(String[] args) {
        MyCustomList<String> list = new MyCustomList<>();
        list.addElement("Element 1");
        list.addElement("Element 2");
        String value = list.get(0);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(5);
        list2.addElement(7);
        Integer number = list2.get(0);

        System.out.println(list);
        System.out.println(value);
        System.out.println(list2);
        System.out.println(number);
    }
}
