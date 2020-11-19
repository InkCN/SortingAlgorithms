/**
 * 归并算法：归+并
 * 核心在于并算法
 */
public class MergeSort implements ISort {

    private static int[] aux;

    public void sort(int[] a) {
        aux = new int[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    //将a[low..mid]和a[mid+1..high]归并
    private static void merge(int[] a, int low, int mid, int high) {
        int i = low, j = mid + 1;

        //将a[low..high]复制到aux[low..high]
        //相当于对原数组a进行备份
        //关于aux数组(aux数组本质就是一个临时存放数字的仓库)
        for (int k = low; k <= high; k++) aux[k] = a[k];

        //下面这个for循环的作用是：排序数组a
        //通过条件判断，从aux数组中取出数字赋值给原数组a。
        for (int k = low; k <= high; k++)
            if      (i > mid)           a[k] = aux[j++];
            else if (j > high)          a[k] = aux[i++];
            else if (aux[j] < aux[i])   a[k] = aux[j++];
            else                        a[k] = aux[i++];
    }
}
