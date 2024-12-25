public class Merge {
    public static void show(int arr[]){
        for(int e : arr){
            System.out.print(e+" ");
        }

        System.out.println();

    }


    public static void  mergeSort(int arr[]){
        sort(arr, 0,arr.length-1);

    }

    public static void sort(int arr[], int l , int h){

        if(l<h){
            int m= l + (h - l) / 2;
            sort(arr,l,m);
            sort(arr,m+1,h);
            merge(arr, l , m , h);
        }

    }


    public static void merge(int arr[],int l, int m , int h){
        int n1 = m-l +1;
        int n2 = h-m;

        int arr1[]= new int[n1];
        int arr2[]= new int[n2];

        for (int i = 0; i < n1; ++i)
            arr1[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            arr2[j] = arr[m + 1 + j];

        
            int i = 0, j = 0;

            // Initial index of merged subarray array
            int k = l;
            while (i < n1 && j < n2) {
                if (arr1[i] <= arr2[j]) {
                    arr[k] = arr1[i];
                    i++;
                }
                else {
                    arr[k] = arr2[j];
                    j++;
                }
                k++;
            }
    
            // Copy remaining elements of L[] if any
            while (i < n1) {
                arr[k] = arr1[i];
                i++;
                k++;
            }
    
            // Copy remaining elements of R[] if any
            while (j < n2) {
                arr[k] = arr2[j];
                j++;
                k++;
            }

    }
   

    

    public static void main(String[] args) {
        int arr[]={1,2,4,7,5,9,3,8,6,10};
        System.out.println("before sorting");
        show(arr);

        System.out.println("After sorting");
        mergeSort(arr);
        show(arr);
    }
    
}
