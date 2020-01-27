
/**
 * 冒泡排序
 *
 * @author lihuaqing
 * @date 2020-1-27
 */
public class Bubbling {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 45, 5, 11, 3};
        int num = 0;

        for (int i = 0; i < a.length - 1; i++) {
            //标志是否可以结束
            boolean flag = true;

            for (int j = 0; j < a.length - i - 1; j++) {
                int temp;
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = false;
                }
                num++;
            }
            if (flag) {
               break;
            }
        }

        //输出最后的结果
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n最后执行的次数：" + num);
    }
}
