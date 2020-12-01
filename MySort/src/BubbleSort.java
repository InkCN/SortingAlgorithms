//冒泡排序
public class BubbleSort implements ISort {

    @Override
    public void sort(int[] arr) {
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        int N = arr.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
