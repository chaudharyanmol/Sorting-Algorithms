public class Counting {

    public static void show(int arr[]) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void countingSort(int[] arr) {
        if (arr.length == 0) return;

        // Find the maximum and minimum values in the array
        int max = 10;
        int min = 1;

        int range = max - min + 2;

        int[] count = new int[range];

        for (int num : arr) {
            count[num]++;
        }

        int index = 0;

        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 8, 3, 3, 1, 10, 9, 7};
        System.out.println("Before sorting:");
        show(arr);

        System.out.println("After sorting:");
        countingSort(arr);
        show(arr);
    }
}
