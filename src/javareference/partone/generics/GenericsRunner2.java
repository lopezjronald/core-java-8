package javareference.partone.generics;

public class GenericsRunner2 {
    public static void main(String[] args) {
//        MyCustomList<String> list = new MyCustomList2<>();
//        list.addElement("Element 1");
//        list.addElement("Element 2");
//        String value = list.get(0);

        MyCustomList2<Long> list2 = new MyCustomList2<>();
        list2.addElement(5L);
        list2.addElement(7L);
        Long number = list2.get(0);

        System.out.println(list2);
        System.out.println(number);
    }
}
