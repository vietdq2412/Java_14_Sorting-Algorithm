public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i =0; i< 10 ; i++){
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println("Origin array: ");
        showArr(arr);

        System.out.println("Array after sort: ");
        bubbleSort(arr);
        showArr(arr);
    }

    public static void showArr(int []arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void bubbleSort(int []arr){
     for (int i =0; i < arr.length-1; i++){
         for (int j = i+1; j < arr.length; j++){
             if (arr[i] > arr[j]){
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }
         }
     }
    }
}
