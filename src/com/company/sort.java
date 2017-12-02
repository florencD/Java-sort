package com.company;

public class sort{

public static void insertionSort(int arr[]) {
    int n = arr.length;
        for (int j = 1; j < n; j++) {
        int key = arr[j];
        int i = j - 1;
        while ((i > -1) && (arr[i] > key)) {
            arr[i + 1] = arr[i];
            i--;
        }
        arr[i + 1] = key;
      }
    }

    public static void print(int arr[]){

        System.out.println("Before Insertion Sort");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n---------------------------");

    }

}
