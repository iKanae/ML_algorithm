package test;

import org.apache.mahout.cf.taste.common.TasteException;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.lang.Object;

/**
 * Created by aaron on 16-7-9.
 */
public class SelectSort {
    public static void main(String[] args) throws IOException, TasteException {
        int[] intArray = { 10, 21, 3, 4, 15 , 19 , 22 , 7};
        findMin(intArray);
        String intArrayString = Arrays.toString(intArray);
        System.out.println(intArrayString);
    }
    private static void exch(int a,int b){
        int temp=0;
        if(a>b){
            temp=b;
            b=a;
            a=temp;
        }
    }
    private static void findMin(int[] intArray){
        if (intArray == null || intArray.length <= 0) {
            return;
        }
        for(int i=0;i<intArray.length;i++){
            int minIndex=i;
            for(int j=i+1;j<intArray.length;j++){
               if(intArray[j]<intArray[minIndex]) {
                   minIndex = j;
               }
            }
            if(minIndex!=i){
                int temp=intArray[i];
                intArray[i]=intArray[minIndex];
                intArray[minIndex]=temp;
            }
        }
    }

}

