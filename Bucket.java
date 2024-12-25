import java.util.ArrayList;
import java.util.Collections;

public class Bucket {

    public static void show(int arr[]) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void bucketSort(int[] arr) {
        if (arr.length == 0) return;


        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) max = num;
        }


        int bucketCount = arr.length;

        
        ArrayList<Integer>[] buckets = new ArrayList[bucketCount];
        for (int i = 0; i < bucketCount; i++) {
            buckets[i] = new ArrayList<>();
        }


        for (int num : arr) {
            int bucketIndex = (num * bucketCount) / (max + 1); 
            buckets[bucketIndex].add(num);
        }

       
        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket); 
            for (int num : bucket) {
                arr[index++] = num; 
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 8, 3, 3, 1, 10, 9, 7};
        System.out.println("Before sorting:");
        show(arr);

        System.out.println("After sorting:");
        bucketSort(arr);
        show(arr);
    }
}
