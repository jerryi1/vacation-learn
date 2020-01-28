/**
 * 插入排序
 *
 * @author lihuaqing
 * @date 2020-1-28
 */
public class Inserting {

    public static void main(String[] args) {
        int[] a = new int[]{3, 2, 3, 45, 5, 11, 3};

        //插入排序
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            while (i >= 1 && a[i - 1] > temp) {
                a[i] = a[i - 1];
                i--;
            }
            a[i] = temp;
        }

        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }
    }

}
