package com.company;
public class Main {
    public static void main(String[] args) {

        ArrayClass array = new ArrayClass();

        for (int i = 0; i < array.element().length; i++) {
            System.out.println("Element : " + (i + 1) + " index : " + i + " Value : " + array.element()[i]);
        }
             System.out.println("---------------------------");

        //Insertion Sort
            ArrayClass array1 = new ArrayClass();
            sort.print(array1.element());
            int[] matrix = array1.element();
            sort.insertionSort(matrix);
            sort.print(matrix);
        //end of insertion sort

        //SelectionSort
            ArrayClass array2 = new ArrayClass();
            Selection.print(array2.element());
            int[] matrix1 = array2.element();
            Selection.selectionSort(matrix1);
            Selection.print(matrix1);
        //end of SelectionSort
    }
}