//冒泡排序
public class BubbleSort implements ISort{

    @Override
    public void sort(int[] arr) {
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr){
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N; j++) {
                if (arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
