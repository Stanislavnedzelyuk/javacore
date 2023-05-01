package memoryJava;
public class Task6 {
    public static Integer changeValue (Integer value) {
        value = 22;
        return value;
    }
    public static void main(String[] args) {
        Integer value = 33;
        value = changeValue(value);
        System.out.println(value);
    }

}

