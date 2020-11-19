import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

//        printResult(new QuickSort());//打印快排算法

//        printResult(new MergeSort());//打印归并算法


    }

    public static int[] getArray(int n) {
        if (n<1) throw new RuntimeException();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length);
        }
        return arr;
    }

    /**判断数组是否有序
     * 判断两次，先判断是否是升序(1..n)
     * 再判断是否是降序(n..1)
     * @param data 需要判断的数组
     * @return 结果
     */
    public static boolean isSorted(int[] data) {
        if (data.length<3) return true;
        boolean flag1 = false,flag2 = false;
        //数组是否为升序
        for (int i = 0; i < data.length-1; i++) {
            if (data[i] == Math.min(data[i], data[i + 1])) {
                flag1 = true;
            } else {
                flag1 = false;
                break;
            }
        }
        //数组是否为降序
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] == Math.max(data[i], data[i + 1])) {
                flag2 = true;
            } else {
                flag2 = false;
                break;
            }
        }
        return flag1 || flag2;//有一个为真，即是已经排过序了
    }

    public static void printResult(ISort sort){
        int[] arr = Test.getArray(15);
        System.out.println("排序前：" + Arrays.toString(arr));
        sort.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));
        System.out.print("是否有序：" + isSorted(arr));
    }
}
