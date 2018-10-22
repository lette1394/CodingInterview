package Practice;

public class MySort {
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            swap(arr, i, minIdx);
        }
    }

    static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >= 1 && arr[j - 1] > arr[j]; j--) {
                swap(arr, j - 1, j);
            }
        }
    }

    static void quickSort(int[] arr) {
        _quickSort(arr, 0, arr.length - 1);
    }

    private static void _quickSort(int[] arr, int l, int r) {
        if (l >= r) return;

        int lo = l;
        int hi = r;
        int mid = (lo + hi) / 2;

        while (lo < hi) {
            while (arr[lo] < arr[mid]) lo++;
            while (arr[hi] > arr[mid]) hi--;

            if (lo < hi) {
                swap(arr, lo++, hi--);
            }
        }
        _quickSort(arr, l, mid - 1);
        _quickSort(arr, mid + 1, r);
    }

    static int iterate(long times) {
        int sum = 0;
        for (int i = 0; i < times; i++) {
            sum++;
        }

        return sum;
    }
}
