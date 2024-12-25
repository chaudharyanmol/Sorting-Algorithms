public class Bubble {

    public static void show(int arr[]){

        for(int e : arr){
            System.out.print(e+"\t");
        }
        System.out.println();

    }

    public static void BubbleSort(int arr[]){
        for(int j =0 ; j<arr.length-1; j++)
            for(int i=1;i<arr.length-j; i++){
                if(arr[i]<arr[i-1]){
                    int temp = arr[i];
                    arr[i]= arr[i-1];
                    arr[i-1]=temp;
            }
        }
    } 

    public static void main(String[] args) {

        int arr[]={1,2,4,7,5,9,3,8,6,10};

        System.out.println("Before sorting");

        show(arr);

        BubbleSort(arr);
        System.out.println("After sorting");

        show(arr);

        
        
    }
    
}
