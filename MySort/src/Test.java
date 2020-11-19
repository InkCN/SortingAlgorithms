import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

//        ISort quickSort = new QuickSort();
//        printResult(quickSort);//打印快排算法

//        ISort mergeSort = new MergeSort();
//        printResult(mergeSort);//打印归并算法


    }


    public static int[] getArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length);
        }
        return arr;
    }

    public static void printResult(ISort sort){
        int[] arr = Test.getArray(15);
        System.out.println("排序前：" + Arrays.toString(arr));
        sort.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));
    }
}
