public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {13, 25, 23, 10, 9};
        int j;
        for(int i = 0;i < arr.length; i++){
            int key = arr[i];
            for(j = i - 1; j >= 0 && key < arr[j]; j--){ 
                    arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }    
}
