/**
 * 学习:每天进步一点点
 */

import java.util.Arrays;

/**
 * 数组初始化
 * @author liushengkaik@163.com
 * @create 2019-08-04 17:24
 **/
public class ArrayTest {

    public static void main(String[] args) {
        int[] array1 = new int[] {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = Arrays.copyOf(array1, array1.length);
    }
}
