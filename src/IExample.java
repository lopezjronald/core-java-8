public interface IExample {

    default String getString() {
        return "I am a default interface method";
    }

    default void suckIt() {
    }

    static int incrementNum() {
        return -1;
    }
}
