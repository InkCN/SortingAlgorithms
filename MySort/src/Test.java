import java.util.Arrays;

/**
 * 测试数组的长度：100000（十万）
 */
public class Test {
    public static void main(String[] args) {
//        printResult(new BubbleSort());//测试冒泡排序--18030ms

//        printResult(new InsertSort());//测试插入排序--6172ms

//        printResult(new SelectSort());//测试选择排序--5402ms

//        printResult(new ShellSort());//测试希尔排序--338ms

//        printResult(new QuickSort());//测试快排排序--95ms

//        printResult(new MergeSort());//测试归并排序--85ms


    }

    public static int[] getArray(int n) {
        if (n < 1) throw new RuntimeException();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length);
        }
        return arr;
    }

    /**
     * 判断数组是否有序
     * 判断两次，先判断是否是升序(1..n)
     * 再判断是否是降序(n..1)
     *
     * @param data 需要判断的数组
     * @return 结果
     */
    public static boolean isSorted(int[] data) {
        if (data.length < 3) return true;
        boolean flag1 = false, flag2 = false;
        //数组是否为升序
        for (int i = 0; i < data.length - 1; i++) {
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

    public static void printResult(ISort sort) {
//        int num = (int)(Math.random() * 100000) + 15;
        int num = 100000;
        int[] arr = Test.getArray(num);
        System.out.println("测试数组长度："+num);
        long start = System.currentTimeMillis();
        System.out.println("排序前：" + Arrays.toString(arr));
        sort.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));
        long end = System.currentTimeMillis();
        long time=end-start;
        System.out.println("是否有序：" + isSorted(arr));
        System.out.print("消耗时间：" + time+"毫秒");
    }
}
