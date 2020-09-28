public class InsertionSort {

    static int array[] = {9, 5, 7, 1, 77, 44, 2, 12};

    public static void main(String[] args) {
        insertionSort();
        System.out.println("");
        showArr();
    }

    public static void showArr(){
        for (int i : array){
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(){
        for (int i=1; i < array.length; i++){
            int temp = array[i];
            for (int j = i-1; j >= 0; j--){

                if (array[j] > temp){
                    array[j+1] = array[j];
                }else {
                    break;
                }

                array[j] = temp;
                System.out.println("");
                showArr();
            }
        }
    }
}
