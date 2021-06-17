package javareference.partone.enumerations;

// Use an enum constructor.
enum Apple4 {
    Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);
    private final int price; // price of each apple

    // Constructor
    Apple4(int p) {
        price = p;
    }

    // Overloaded constructor
    Apple4() {
        price = -1;
    }

    int getPrice() {
        return price;
    }
}