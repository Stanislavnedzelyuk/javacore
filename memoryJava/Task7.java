package memoryJava;

import java.util.Arrays;
public class Task7 {
    public static Integer[] changeValue (Integer[] value1) {
        value1 = new Integer[]{1, 2};
        return value1;
    }
    public static void main(String[] args) {
        Integer[] value = new Integer[] {3,4};
        value = changeValue(value);
            System.out.print(Arrays.toString(value));
    }
}
