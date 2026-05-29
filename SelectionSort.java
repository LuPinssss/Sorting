public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            min = arr[i];
            for(int j = i; j < arr.length; j++){
                if (arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i]; 
            arr[i] = min;
            arr[minIndex] = temp;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
