/**
 * 快速排序
 *设置好基数，用两个哨兵，一个从右端(先扫)，一个从左端(后扫)扫描数组
 * 详细过程：
 * 首先，右端哨兵开始寻找小于基数的数字，找到时便停下来，
 * 然后左端哨兵再开始寻找大于基数的数字，
 * 找到后，跟右端哨兵找到的数字进行交换
 * 当两个哨兵相遇时，即扫描到数组同一个位置时，该过程就完成了
 * 完成该过程后，数组的情况是这样的：小于基数的，会在左边，大于基数的，在右边
 * 最后，递归排序左半数组，递归排序右半数组。
 */
public class QuickSort implements ISort{

    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low > high) return;
        int i, j, temp, t;
        i = low;
        j = high;
        temp = arr[low];
        while (i < j) {
            while (temp <= arr[j] && i < j) j--;
            while (temp >= arr[i] && i < j) i++;
            if (i < j) {
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }
}
