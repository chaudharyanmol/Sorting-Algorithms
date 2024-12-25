class Selection{

    public static void show(int arr[]){
        for(int e : arr){
            System.out.print(e+" ");
        }

        System.out.println();

    }


    public static void selection(int arr[]){

        for(int i=0 ; i< arr.length-1; i++){
            int minindex = i ;

            for(int j = i+1 ; j<arr.length; j++){
                if(arr[j]<arr[minindex])
                    minindex=j;
            }

            int temp = arr[minindex];
            arr[minindex]= arr[i];
            arr[i]=temp;
        }

    }

    public static void main(String[] args) {
        int arr[]={2,1,4,7,5,9,3,8,6,10};
        System.out.println("before sorting");
        show(arr);

        System.out.println("After sorting");
        selection(arr);
        show(arr);
    }
}