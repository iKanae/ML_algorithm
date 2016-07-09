package test;
import org.apache.mahout.cf.taste.common.TasteException;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.lang.Object;

/**
 * Created by aaron on 16-7-9.
 */
public class QuickSort {
    public static void main(String[] args) throws IOException, TasteException {
        int[] intArray = { 10, 21, 3, 4, 15 , 19 , 22 , 7};
        int left=0;
        int right=intArray.length-1;
        findMin(intArray,left,right);
        String intArrayString = Arrays.toString(intArray);
        System.out.println(intArrayString);
    }

    private static void findMin(int[] a,int left,int right){
        int index;
        if(left<right){
            index=partition(a,left,right);
            findMin(a,index+1,right);
            findMin(a,left,index-1);
        }
        }

    private static int partition(int[] a,int left,int right){
        int pivot=a[left];
        while(left<right){
            while(a[right]>pivot && left<right)
                right--;
            if(left<right)
                a[left++]=a[right];
            while(a[left]<pivot && left<right)
                left++;
            if(left<right)
                a[right--]=a[left];
        }
        a[left]=pivot;
        return left;
    }
    }
