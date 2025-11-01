package Prak5.Part1.Num1;

import java.util.ArrayList;

public class Utils {
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list){
        ArrayList<T> result = new ArrayList<>();
        for (T item : list) {
            if (!result.contains(item)) {
                result.add(item);
            }
        }

        return result;
    }

    public static <T> int LinearSearch(T[] arr, T key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null && key == null) return i;
            if (arr[i] != null && arr[i].equals(key)) return i;
        }

        return -1;
    }

    public static <T extends Comparable<T>> T FindMax(T[] arr) {
        if (arr == null || arr.length == 0) return null;
        T max = arr[0];
        for (T t : arr) {
            if (t.compareTo(max) > 0) max = t;
        }

        return max;
    }

    public static <T extends Comparable<T>> T FindMax2D(T[][] arr2d) {
        if (arr2d == null) return null;
        T max = null;
        for (T[] row : arr2d) {
            if (row == null) {
                for (T item : row) {
                    if (item == null) continue;
                    if (max == null || item.compareTo(max) > 0) max = item;
                }
            }
        }

        return max;
    }
}