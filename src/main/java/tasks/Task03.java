package tasks;

public class Task03 {

    /**
     * Реализовать сериализацию boolean.
     * Главное требование, чтобы {@link Task03#booleanDeserialize(int)}
     * возвращал тот же boolean по значению int.
     * Tip: в Java есть тернарный оператор:
     * int x = condition ? trueValue : falseValue;
     */
    public static int booleanSerialize(boolean b) {
        return b ? 1: 0;
    }

    public static boolean booleanDeserialize(int i) {
        return i != 0;
    }

}
