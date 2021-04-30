package com.company;
import java.lang.System.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {1,5,3,2,7,8, 4, 45,123,2,4,78};
        int[] result = bubbleSort(nums);
        System.out.print(Arrays.toString(result));

    }

    public static int[] bubbleSort (int[] arr) {
        int n = arr.length;
        for(int i = 0; i< n -1; i++) {
            for(int j = 0; j < n -i -1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}




