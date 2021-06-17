package javareference.partone.autoboxing;

public class WrapperDemo {
    public static void main(String[] args) {
        Integer iOb = new Integer(100);
        int i = iOb.intValue();
        System.out.println(i + " " + iOb); // displays 100 100
        System.out.println(i == iOb);
    }
}
