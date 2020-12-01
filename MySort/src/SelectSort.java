//选择排序
public class SelectSort implements ISort{

    @Override
    public void sort(int[] arr) {
        selectSort(arr);
    }

    private static void selectSort(int[] arr){
        int N=arr.length;
        for (int i = 0; i < N; i++) {
            int min=i;
            for (int j = i+1; j < N; j++) {
                if (arr[min]>arr[j]) min=j;
            }
            if (min!=i) {
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }
}
