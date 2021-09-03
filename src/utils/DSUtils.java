package utils;

import java.util.Comparator;

public class DSUtils {

    // Object Swap a[i] and a[j]
    public static void swap(Object i, Object j) {
        Object swap = i;
        i = j;
        j = swap;
    }

    // Integer Swap a[i] and a[j]  (for indirect sort)
    private static void swap( int i, int j) {
        int swap = i;
        i = j;
        j = swap;
    }


    /*  Check if array is sorted - useful for debugging.
     ***************************************************************************/

    // is the array a[] sorted?
    public static boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }


    // is the array a[] sorted by comparator?
    public static boolean isSorted(Object[] a, Comparator comparator) {
        return isSorted(a, 0, a.length - 1, comparator);
    }


    // is the array sorted from a[lo] to a[hi]
    public static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (compare(a[i], a[i-1])) return false;
        return true;
    }

    // is the array sorted from a[lo] to a[hi] by  comparator
    public static boolean isSorted(Object[] a, int lo, int hi, Comparator comparator) {
        for (int i = lo + 1; i <= hi; i++)
            if (compare(comparator, a[i], a[i-1])) return false;
        return true;
    }

    /***************************************************************************
     *  Helper sorting functions.
     ***************************************************************************/

    // is v < w ?
    public static boolean compare(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    // is v < w with comparator?
    public static boolean compare(Comparator comparator, Object v, Object w) {
        return comparator.compare(v, w) < 0;
    }


}
