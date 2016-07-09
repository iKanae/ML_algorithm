package test;
import org.apache.mahout.cf.taste.common.TasteException;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.lang.Object;

/**
 * Created by aaron on 16-7-9.
 */
public class InsertSort {
    public static void main(String[] args) throws IOException, TasteException {
    int[] intArray = { 10, 21, 3, 4, 15 , 19 , 22 , 7};
    findMin(intArray);
    String intArrayString = Arrays.toString(intArray);
    System.out.println(intArrayString);
    }

    private static void findMin(int[] a){
        for(int i=1;i<a.length;i++){
            int j=i-1;
            int tmp=a[i];
            while(j>=0 && tmp<=a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=tmp;
        }
    }
}
