package LeetCode.Sorting;

import java.util.Arrays;


/**
 * Created by ggorantla on 2/26/2015.
 * https://www.cs.cmu.edu/~adamchik/15-121/lectures/Sorting%20Algorithms/code/MergeSort.java*
 * Merger sort implemented from cmu *
 */
public class MergeSort {
    public void mergeSort(Integer[] a){
        Comparable[] tmp = new Comparable[a.length];
        mergeSort(a, tmp, 0, a.length-1);

    }
    public void mergeSort(Comparable[] a, Comparable[] tmp, int left, int right){
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(a, tmp, left, mid);
            mergeSort(a, tmp, mid + 1, right);
            merge(a, tmp, left, mid + 1, right);
        }
    }

    public void merge(Comparable[] a, Comparable[] tmp, int left, int right, int rightEnd){
        int leftEnd = right-1;
        int index = left;
        int len = rightEnd-left+1;

        //test the two arrays
        while (left <= leftEnd && right <= rightEnd){
            if (a[left].compareTo(a[right]) <= 0){
                tmp[index++] = a[left++];
            }else {
                tmp[index++] = a[right++];
            }
        }
        // copy the first array
        while (left <= leftEnd)
            tmp[index++] = a[left++];
        // copy the second array
        while (right <= rightEnd)
            tmp[index++] = a[right++];

        // Now copy back temporary array to the main array

        for (int i = 0; i < len; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];

    }
    
    /*
            Test
     */

    public static void main(String[] args) {
        Integer[] a = {2,6,3,5,1};
        MergeSort obj = new MergeSort();
        obj.mergeSort(a);
        System.out.println(Arrays.toString(a));
    }
}
