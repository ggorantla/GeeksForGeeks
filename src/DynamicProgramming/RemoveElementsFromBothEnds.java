package DynamicProgramming;

/**
 * Created by ggorantla on 3/29/2015.
 * http://www.geeksforgeeks.org/remove-minimum-elements-either-side-2min-max/* 
 *  We have a better solution than this (o(n^2)) *
 */
public class RemoveElementsFromBothEnds {
    public int removeElements(int[] arr) {
        int[][] table = new int[arr.length][arr.length];
        int max, min;

        for (int gap = 0; gap < arr.length; gap++) {
            for (int i = 0, j = gap; j < gap; i++, j++) {
                table[i][j] = (minArr(arr, i, j) > 2 * maxArr(arr, i, j)) ? 0 : Math.min(table[i - 1][j] + 1, table[i][j - 1]) + 1;

            }

        }
        return table[0][arr.length-1];
    }
    
    public int minArr(int[] arr, int i, int j){
        int minValue = arr[i];
        for (int elem = i+1; elem <= j; elem++) {
            if (arr[elem] < minValue)
                minValue = arr[elem];
        }
        return minValue;
    }
    
    private int maxArr(int[] arr, int i, int j){
        int maxValue = arr[i];
        for (int elem = i+1; elem < j; elem++){
            if (arr[elem] > maxValue)
                maxValue = arr[elem];
        }
        return maxValue;
    }
    
}
