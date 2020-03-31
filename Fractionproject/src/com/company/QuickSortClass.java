package com.company;

import java.util.List;

public class QuickSortClass<E extends Comparable<E> > {

    public void quickSort(E[] a, int lowBorder, int highBorder) {
        if (a.length == 0 || lowBorder > highBorder) {
            // Все отсортировано - выходим
            return;
        }
        // выбор опорного элемента
        int middle = lowBorder + (highBorder - lowBorder) / 2;
        E middleFraction = a[middle];


        int l = lowBorder, r = highBorder;


        // Переносим все элементы меньшие опоры влево, большие - вправо
        while (l <= r) {
            // Ищем элемент слева от опоры, который должен быть справа
            while (a[l].compareTo(middleFraction) < 0) {
                l++;
            }
            // Ищем элемент элемент справа от опоры, который должен быть слева
            while (a[r].compareTo(middleFraction) > 0) {
                r--;
            }

            if (l <= r) { //меняем элементы местами
                E temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
        }

        // Рекурсия для левой и правой части массива.

        if (lowBorder < r)
            quickSort(a, lowBorder, r);

        if (highBorder > l)
            quickSort(a, l, highBorder);
    }



    public void quickSort(List<E> a, int lowBorder, int highBorder) {
        if (a.size() == 0 || lowBorder > highBorder) {
            // Все отсортировано - выходим
            return;
        }
        // выбор опорного элемента
        int middle = lowBorder + (highBorder - lowBorder) / 2;
        E middleFraction = a.get(middle);


        int l = lowBorder, r = highBorder;


        // Переносим все элементы меньшие опоры влево, большие - вправо
        while (l <= r) {
            // Ищем элемент слева от опоры, который должен быть справа
            while (a.get(l).compareTo(middleFraction) < 0) {
                l++;
            }
            // Ищем элемент элемент справа от опоры, который должен быть слева
            while (a.get(r).compareTo(middleFraction) > 0) {
                r--;
            }

            if (l <= r) { //меняем элементы местами
                E temp = a.get(l);
                a.set(l, a.get(r));
                a.set(r, temp);
                l++;
                r--;
            }
        }

        // Рекурсия для левой и правой части массива.

        if (lowBorder < r)
            quickSort(a, lowBorder, r);

        if (highBorder > l)
            quickSort(a, l, highBorder);
    }
}
