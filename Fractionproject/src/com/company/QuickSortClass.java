package com.company;

public class QuickSortClass {

    public void quickSort(Fraction[] a, int lowBorder, int highBorder) {
        if (a.length == 0 || lowBorder > highBorder) {
            // Все отсортировано - выходим
            return;
        }
        // выбор опорного элемента
        int middle = lowBorder + (highBorder - lowBorder) / 2;
        Fraction middleFraction = a[middle];


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
                Fraction temp = a[l];
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



}
