/**
 * 选择排序
 *
 * @author lihuaqing
 * @date 2020-12-28
 */
public class Choiceing {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 45, 5, 11, 3};

        //外层循环控制次数
        for (int i = 0; i < a.length - 1; i++) {
            int pos = 0;
            for (int j = 0; j < a.length - i; j++) {
                //查询最大的数据
                if (a[j] > a[pos]) {
                    pos = j;
                }
            }

            //最后执行数据的交换
            int temp = a[pos];
            a[pos] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }


        //输出最后的数据结果：
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
