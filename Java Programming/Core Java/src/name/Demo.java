package name;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        reflection
        int[] ints = (int[]) Array.newInstance(int.class, 4);
        Array.set(ints,0,12);
        Array.set(ints,1,13);
        Array.set(ints,2,14);
        Array.set(ints,3,15);
        System.out.println(Arrays.toString(ints));
        for (int a : ints){
            System.out.println(a);
        }
    }
}