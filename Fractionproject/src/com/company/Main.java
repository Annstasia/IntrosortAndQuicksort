package com.company;
import com.company.Fraction;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static PrintStream out = System.out;

//    public static void insertionSort(Fraction[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            Fraction el = arr[i];
//            int previous = i - 1;
//            while (previous >= 0 && arr[previous].compareTo(el) > 0) {
//                arr[previous + 1] = arr[previous];
//                previous--;
//            }
//            arr[previous+1] = el;
//        }
//    }
//
//    public static void quickSort(Fraction[] a, int lowBorder, int highBorder) {
//        if (a.length == 0 || lowBorder > highBorder) {
//            // Все отсортировано - выходим
//            return;
//        }
//        // выбор опорного элемента
//        int middle = lowBorder + (highBorder - lowBorder) / 2;
//        Fraction middleFraction = a[middle];
//
//
//        int l = lowBorder, r = highBorder;
//
//
//        // Переносим все элементы меньшие опоры влево, большие - вправо
//        while (l <= r) {
//            // Ищем элемент слева от опоры, который должен быть справа
//            while (a[l].compareTo(middleFraction) < 0) {
//                l++;
//            }
//            // Ищем элемент элемент справа от опоры, который должен быть слева
//            while (a[r].compareTo(middleFraction) > 0) {
//                r--;
//            }
//
//            if (l <= r) { //меняем элементы местами
//                Fraction temp = a[l];
//                a[l] = a[r];
//                a[r] = temp;
//                l++;
//                r--;
//            }
//        }
//
//        // Рекурсия для левой и правой части массива.
//
//        if (lowBorder < r)
//            quickSort(a, lowBorder, r);
//
//        if (highBorder > l)
//            quickSort(a, l, highBorder);
//    }
//
//
    public static void tryListSort(){
        Fraction[] arrQuickSort = {new Fraction(1, 2), new Fraction(1, -4),new Fraction(1, -4), new Fraction(-1, 4),new Fraction(-5, 1), new Fraction(5, 1)};
//        Fraction[] arrInsertionSort = Arrays.copyOf(arrQuickSort, arrQuickSort.length);
        ArrayList<Fraction> listQuickSort = new ArrayList<>();
        ArrayList<Fraction> listInsertionSort = new ArrayList<>();
        for (int i = 0; i < arrQuickSort.length; i++) {
            listQuickSort.add(arrQuickSort[i]);
            listInsertionSort.add(arrQuickSort[i]);
        }


        System.out.println("Список до сортировки:");
        for (Fraction f : listQuickSort){
            System.out.println(f);
        }
        QuickSortClass quickSortClass = new QuickSortClass();
        quickSortClass.quickSort(listQuickSort, 0, listQuickSort.size() - 1);
//

        System.out.println("\nПосле быстрой сортировки:");
        for (Fraction f : listQuickSort){
            System.out.println(f);
        }


        InsertionSortClass insertionSortClass = new InsertionSortClass();
        insertionSortClass.insertionSort(listInsertionSort);


        System.out.println("\nПосле сортировки вставками:");
        for (Fraction f : listInsertionSort){
            System.out.println(f);
        }
        System.out.println("\n\n");

    }


    public static void tryArrSort(){
        Fraction[] arrQuickSort = {new Fraction(1, 2), new Fraction(1, -4),new Fraction(1, -4), new Fraction(-1, 4),new Fraction(-5, 1), new Fraction(5, 1)};
        Fraction[] arrInsertionSort = Arrays.copyOf(arrQuickSort, arrQuickSort.length);
        System.out.println("Массив до сортировки:");
        for (Fraction f : arrQuickSort){
            System.out.println(f);
        }
        QuickSortClass quickSortClass = new QuickSortClass();
        quickSortClass.quickSort(arrQuickSort, 0, arrQuickSort.length - 1);
//

        System.out.println("\nПосле быстрой сортировки:");
        for (Fraction f : arrQuickSort){
            System.out.println(f);
        }


        InsertionSortClass insertionSortClass = new InsertionSortClass();
        insertionSortClass.insertionSort(arrInsertionSort);


        System.out.println("\nПосле сортировки вставками:");
        for (Fraction f : arrInsertionSort){
            System.out.println(f);
        }
        System.out.println("\n\n");
    }


    public static void main(String[] args) {
        tryListSort();
        tryArrSort();
    }

}
