package javareference.parttwo.exploringjavalang;

// Demonstrate the clone() method
class TestClone implements Cloneable {
    int a;
    double b;

    // This method calls Object's clone().
    public Object clone() {
        try {
// call clone in Object.
            return (TestClone2) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not allowed.");
            return this;
        }
    }
}

class CloneableDemo {
    public static void main(String[] args) {
        TestClone2 x1 = new TestClone2();
        TestClone2 x2;
        x1.a = 10;
        x1.b = 20.98;
        x2 = (TestClone2) x1.clone(); // clone x1
        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x2.b);
    }
}
