public class GenericType <T> implements IExample{

    public void printSomething(T o) {
        System.out.println(o.toString());
    }

    @Override
    public void suckIt() {
        System.out.println("Suck it!");
    }

}
