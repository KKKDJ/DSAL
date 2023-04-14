import java.util.*;

public class OE6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements to be sorted: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        int choice;
        System.out.print("Choose an option: \n[1]Input data manually\n[2]Generate random data ");
        choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter the elements to be sorted: ");
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
        } else if (choice == 2) {
            Random rand = new Random();
            System.out.print("Generated data: ");
            for (int i = 0; i < n; i++) {
                arr[i] = rand.nextInt(100);
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Invalid choice!");
            System.exit(0);
        }

        hybridQuicksort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Functions
    public static void hybridQuicksort(int[] arr, int left, int right) {
        if (left < right) {
            if (right - left <= 10) {
                insertionSort(arr, left, right);
            } else {
                int pivot = partition(arr, left, right);
                hybridQuicksort(arr, left, pivot - 1);
                hybridQuicksort(arr, pivot + 1, right);
            }
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    public static void insertionSort(int[] arr, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= left && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
