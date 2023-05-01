package memoryJava;
public class Task5 {
    public static int changeValue(int value) {
        value = 22;
        return value;
    }
    public static void main(String[] args) {
        int value = 33;
        value = changeValue(value);
        System.out.println(value);
    }
}
