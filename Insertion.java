public class Insertion {
    public static void show(int arr[]){
        for(int e : arr){
            System.out.print(e+" ");
        }

        System.out.println();

    }


    public static void insertion(int arr[]){
        for(int i=1 ; i<arr.length; i++){
            int key =  arr[i];
            int j= i-1;

            while(j>=0 && arr[j]>key){
                
                arr[j+1]=arr[j];
                j--;

            }

            arr[j+1]= key ;

        }

    }

    public static void main(String[] args) {
        int arr[]={1,2,4,7,5,9,3,8,6,10};
        System.out.println("before sorting");
        show(arr);

        System.out.println("After sorting");
        insertion(arr);
        show(arr);
    }


}
