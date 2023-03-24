package com.yyf.sort;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {5,23,4,1,54,12,7,2,89,67,3};
        bubbleSort(arr);
    }

    //冒泡
    static void bubbleSort(int[] arr){
        int temp = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }

}
