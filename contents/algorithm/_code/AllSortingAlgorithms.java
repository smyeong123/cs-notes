import java.util.*;

public class AllSortingAlgorithms {

    // 선택 정렬
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minIdx]) minIdx = j;
            swap(arr, i, minIdx);
        }
    }

    // 버블 정렬
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // 삽입 정렬
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // 병합 정렬
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) return;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length)
            arr[k++] = left[i] < right[j] ? left[i++] : right[j++];
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    // 퀵 정렬
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) swap(arr, ++i, j);
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    // 힙 정렬
    public static void heapSort(int[] arr) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int num : arr) heap.add(num);
        for (int i = 0; i < arr.length; i++) arr[i] = heap.poll();
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] original = {5, 2, 9, 1, 5, 6};

        int[] arr1 = original.clone();
        selectionSort(arr1);
        System.out.println("Selection Sorted: " + Arrays.toString(arr1));

        int[] arr2 = original.clone();
        bubbleSort(arr2);
        System.out.println("Bubble Sorted: " + Arrays.toString(arr2));

        int[] arr3 = original.clone();
        insertionSort(arr3);
        System.out.println("Insertion Sorted: " + Arrays.toString(arr3));

        int[] arr4 = original.clone();
        mergeSort(arr4);
        System.out.println("Merge Sorted: " + Arrays.toString(arr4));

        int[] arr5 = original.clone();
        quickSort(arr5, 0, arr5.length - 1);
        System.out.println("Quick Sorted: " + Arrays.toString(arr5));

        int[] arr6 = original.clone();
        heapSort(arr6);
        System.out.println("Heap Sorted: " + Arrays.toString(arr6));
    }
}
