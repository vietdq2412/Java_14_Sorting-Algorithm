public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i =0;i<10 ;i++){
            arr[i] = (int) (Math.random() *100);
        }
        System.out.println("origin array: ");
        showArr(arr);

        System.out.println("array after sort: ");
        insertionSort(arr);
        showArr(arr);
    }

    public static void insertionSort(int [] array){
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > temp) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
                array[j] = temp;
            }
        }
    }

    public static void showArr(int[] array){
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
