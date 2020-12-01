public class InsertSort implements ISort{
    @Override
    public void sort(int[] arr) {
        insertSort(arr);
    }

    private static void insertSort(int[] arr){
        int N=arr.length;
        for(int i=0;i<N;i++){
            for(int j=i;j>0&&arr[j]<arr[j-1];j--){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
    }
}
