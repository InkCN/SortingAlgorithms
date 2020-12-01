public class ShellSort implements ISort{
    @Override
    public void sort(int[] arr) {
        shellSort(arr);
    }

    private static void shellSort(int[] arr){
        int N=arr.length;
        int h=1;
        while(h<N/3) h=3*h+1;
        while(h>=1){
            for(int i=h;i<N;i++){
                for(int j=i;j>=h&&arr[j]<arr[j-1];j-=h){
                    int temp=arr[j];
                    arr[j]=arr[j-h];
                    arr[j-h]=temp;
                }
            }
            h=h/3;
        }
    }
}
