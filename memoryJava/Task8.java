package memoryJava;

import java.util.Arrays;
public class Task8 {
    public static Integer[] changeValue (Integer[] value) {
        value = new Integer[1];
        value[0] = 99;
        return value;
    }
    public static void main(String[] args) {
        Integer[] value = {3,4};
        value = changeValue(value);
        System.out.println(Arrays.toString(value));
    }
}
