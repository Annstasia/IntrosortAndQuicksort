package com.company;

public class InsertionSortClass {
        public void insertionSort(Fraction[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Fraction el = arr[i];
            int previous = i - 1;
            while (previous >= 0 && arr[previous].compareTo(el) > 0) {
                arr[previous + 1] = arr[previous];
                previous--;
            }
            arr[previous+1] = el;
        }
    }
}
