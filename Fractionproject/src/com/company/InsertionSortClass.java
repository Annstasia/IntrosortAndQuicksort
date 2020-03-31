package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;




public class InsertionSortClass<E extends Comparable<E>> {

    public void insertionSort(List<E> arr) {
        for (int i = 1; i < arr.size(); i++) {
            E el = arr.get(i);
            int previous = i - 1;
            while (previous >= 0 && arr.get(previous).compareTo(el) > 0) {
                arr.set(previous + 1, arr.get(previous));
                previous--;
            }
            arr.set(previous + 1, el);
        }
    }

    public void insertionSort(E[] arr){
        for (int i = 1; i < arr.length; i++) {
            E el = arr[i];
            int previous = i - 1;
            while (previous >= 0 && arr[previous].compareTo(el) > 0) {
                arr[previous + 1] = arr[previous];
                previous--;
            }
            arr[previous + 1] = el;
        }
    }


}
