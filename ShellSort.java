package test;
import org.apache.mahout.cf.taste.common.TasteException;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.lang.Object;
/**
 * Created by aaron on 16-7-9.
 */
public class ShellSort {
    public static void main(String[] args) throws IOException, TasteException {
        int[] intArray = { 10, 21, 3, 4, 15 , 19 , 22 , 7};
        findMin(intArray);
        String intArrayString = Arrays.toString(intArray);
        System.out.println(intArrayString);
    }

    private static void findMin(int[] a) {
        int h=1;
        while(h < a.length / 3)
            h = h * 3 + 1;

        while (h > 0) {
            for (int i = h; i < a.length; i++) {
                int j = i-h;
                int tmp = a[i];
                while (j >= h-1 && tmp <= a[j]) {
                    a[j + h] = a[j];
                    j=j-h;
                }
                a[j + h] = tmp;
            }
            h=(h-1)/3;
        }
    }
}
