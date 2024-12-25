public class Quick {

    public static void show(int arr[]){
        for(int e : arr){
            System.out.print(e+" ");
        }

        System.out.println();

    }


    public static void QuickSort(int arr[]){
        quick(arr,0, arr.length-1);

    }

    public  static void quick(int arr[],int l , int h){

        if(l<h){
            int pivot = partition(arr,l,h);
            quick(arr,l,pivot-1);
            quick(arr,pivot+1,h);

        }

    }

    public static int partition(int arr[],int l , int h ){
        int p = arr[l]; // Choose the first element as the pivot
        int i = l + 1;
        int j = h;

        while (i <= j) {
            while (i <= h && arr[i] <= p) {
                i++;
            }
            while (j >= l && arr[j] > p) {
                j--;
            }
            if (i < j) {
                // Swap elements at i and j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the pivot in its correct position
        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,7,5,9,3,8,6,10};
        System.out.println("before sorting");
        show(arr);

        System.out.println("After sorting");
        QuickSort(arr);
        show(arr);
    }
    
}
