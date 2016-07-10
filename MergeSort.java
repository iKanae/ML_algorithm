package test;
import org.apache.mahout.cf.taste.common.TasteException;
import java.io.IOException;
import java.util.Arrays;
import org.apache.mahout.cf.taste.common.TasteException;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.lang.Object;

/**
 * Created by Kanae on 16-7-10.
 * */

public class MergeSort {
        public static void main(String[] args) throws IOException, TasteException {
            int[] intArray = { 10, 21, 3, 4, 15 ,19 ,22 ,7};
            int left=0;
            int right=intArray.length-1;
            findMin(intArray,left,right);
            String intArrayString = Arrays.toString(intArray);
            System.out.println(intArrayString);
        }

        private static void findMin(int[] a,int left,int right) {
            int len=(left+right)/2;
            if (left < right) {
                findMin(a, len+ 1, right);
                findMin(a, left, len);
                findMerge(a,left,len,right);
            }
        }

            private static void findMerge(int[] b,int left,int mid,int right){
                int[] tmp = new int[right-left+1];
                int m=right-left+1;//sort range
                int i=left;//left point
                int j=mid+1;//right point
                int index=0;//the length of array
                while (index < m) {
                    while(i<= mid && j<=right) {
                        if (b[i] <= b[j]) {
                            tmp[index++] = b[i++];
                        } else if (b[i] > b[j]) {
                            tmp[index++] = b[j++];
                        }
                    }
                    while(i<=mid)
                        tmp[index++]=b[i++];
                    while(j<=right)
                        tmp[index++]=b[j++];
                }
                for(i=0;i<tmp.length;i++)
                    b[i+left]=tmp[i];
            }
        }
