package com.dsa.sort;

public class BubbleSort {

        public static void bubbleSort(int[] arr) {

        for(int i = 0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After Sorting array is:");
        for (int a : arr){
            System.out.print("\t "+a);
        }
    }
}
