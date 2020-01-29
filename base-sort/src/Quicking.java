/**
 * 快排
 *
 * @author lihuaqing
 * @date 2020-1-28
 */
public class Quicking {

    public static void main(String[] args) {

        //数据排序
        int[] a = new int[]{3, 2, 3, 45, 5, 11, 3};

        quickSort(a, 0, a.length - 1);

        //输出结果
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static void quickSort(int[] a, int L, int R) {
        int l = L;
        int r = R;
        while (l <= r) {
            //寻找中间节点
            int povid = a[(l + r) / 2];
            while (a[l] > povid) {
                l++;
            }
            while (a[r] < povid) {
                r--;
            }
            //交换数据
            if (l <= r) {
                int temp;
                temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
        }

        if (L < r) {
            quickSort(a, L, r);
        }
        if (R > l) {
            quickSort(a, l, R);
        }

    }
}
