package Chap10;

import java.util.Arrays;

public class Quicksork {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 7, 9, 1, 5, 3, 8, 4};

        System.out.println(Arrays.toString(arr));

        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quicksort(int[] arr, int left, int right) {
        int pivot = partition(arr, left, right);

        if (left < pivot) {
            quicksort(arr, left, pivot - 1);
        }

        if (pivot < right) {
            quicksort(arr, pivot + 1, right);
        }
    }

    static private int partition(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2];

        while (left < right) {
            while (arr[left] < pivot) {
                left++;
            }

            while (arr[right] > pivot) {
                right--;
            }

            if (left < right) {
                swap(arr, left, right);
            }
        }

        return left;
    }

    static private void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

}
