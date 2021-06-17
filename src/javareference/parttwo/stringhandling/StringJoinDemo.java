package javareference.parttwo.stringhandling;

// Demonstrate the join() method defined by String.
class StringJoinDemo {
    public static void main(String[] args) {
        String result = String.join(" ", "Alpha", "Beta", "Gamma");
        System.out.println(result);
        result = String.join(", ", "John", "ID#: 569",
                "E-mail: John@HerbSchildt.com");
        System.out.println(result);
        String firstName = "Ronald";
        String lastName = "Lopez";
        String phone = "408-813-6060";
        String personInfo = String.join(", ", firstName, lastName, phone);
        System.out.println(personInfo);
    }
}
