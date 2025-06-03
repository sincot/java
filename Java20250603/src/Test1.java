import java.sql.SQLOutput;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        /**int[] array = { 1, 2, 3, 4, 5 };
        int[] copy1 = Arrays.copyOf(array, array.length);
        // 拷贝2倍array数组的长度至copy2数组中，这里相当于是在扩容
        // 多余新扩出来的空间的值为当前类型的 0 值
        int[] copy2 = Arrays.copyOf(array, array.length * 2);
        System.out.println(Arrays.toString(copy1));
        System.out.println(Arrays.toString(copy2));*/

        /**int[] array = { 1, 2, 3, 4, 5 };
        int[] copy1 = Arrays.copyOfRange(array, 1, 3); // 在数组的范围内
        int[] copy2 = Arrays.copyOfRange(array, 2, 6); // 在数组的范围外
        System.out.println(Arrays.toString(copy1));
        System.out.println(Arrays.toString(copy2));*/

        /**int[] array = { 1, 9, 13, 71, 25, 34, 90, -2, 67 };
        System.out.println("排序前: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("排序后: " + Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, 25));*/

        /**int[] array1 = { 2, 4, 6, 8, 0 };
        int[] array2 = { 1, 3, 5, 7, 9 };
        int[] array3 = { 2, 4, 6, 8, 0 };
        System.out.println(Arrays.equals(array1, array2));
        System.out.println(Arrays.equals(array1, array3));*/

        /**int[] array = { 1, 3, 5, 7, 9 };
        System.out.println(Arrays.toString(array));
        array = function1(array);
        System.out.println(Arrays.toString(array));*/

        /**int[] array = { 4, 7, 3, 8, 34, 5, 9, -1 };
        System.out.println(Arrays.toString(array));
        function2(array);
        System.out.println(Arrays.toString(array));*/

        /**int[] array = { 1, 3, 5, 7, 9 };
        System.out.println(Arrays.toString(array));
        function2(array);
        System.out.println(Arrays.toString(array));*/

        /**int[] array = { 2, 4, 6, 8, 0 };
        System.out.println(Arrays.toString(array));
        function2(array);
        System.out.println(Arrays.toString(array));*/

        /**int[] array = { 4, 7, 3, 8, 34, 5, 9, -1 };
        System.out.println(Arrays.toString(array));
        function3(array);
        System.out.println(Arrays.toString(array));*/

        /**int[] array = { 4, 7, 3, 8, 34, 5, 9, -1 };
        System.out.println(Arrays.toString(array));
        function2(array);
        System.out.println(Arrays.toString(array));*/

        /**int[] array = { 2, 4, 5, 6, 2, 5 };
        int[] ret = function4(array);
        System.out.println(Arrays.toString(ret));*/

        // 二维数组的定义方式
        int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] array2 = new int[][]{ { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] array3 = new int[2][3];
        System.out.println("第一行的数据: " + Arrays.toString(array1[0]));  // 打印array1数组的第0行的数据
        System.out.println("第二行的数据: " + Arrays.toString(array1[1]));  // 打印array1数组的第1行的数据
        System.out.println("列数: " + array1[0].length);                  // 求二维数组的列数
        System.out.println("行数: " + array1.length);                     // 求二维数组的行数
    }

    // 二分查找函数
    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(array[mid] < key) {
                left = mid + 1;
            } else if(array[mid] > left) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int[] function1(int[] array) {
        int[] ret = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ret[i] = array[i] * 2;
        }

        return ret;
    }

    // 将数组中的奇数放在前面，偶数放在后面
    public static void function2(int[] array) {
        int left = 0; // 找奇数
        int right = array.length - 1; // 找偶数
        while(left < right) {
            while(left < right && array[left] % 2 == 1) {
                left++;
            }
            while(left < right && array[right] % 2 == 0) {
                right--;
            }

            // 交换奇数和偶数的位置
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
        }
    }

    // 效率偏低，对于某些情况不能满足要求
    public static void function3(int[] array) {
        Arrays.sort(array);
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 1) {
                int tmp = array[i];
                count++;
                array[i] = array[count - 1];
                array[count - 1] = tmp;
            }
        }
    }

    // 在一个数组只有两个数据只有出现一次，其余的数据都出现两次，请找出这两个只出现一次的数据
    public static int[] function4(int[] array) {
        int ret = array[0];
        for (int i = 1; i < array.length; i++) {
            ret ^= array[i];
        }
        // 找ret的二进制位中最右边的1的位置
        int flag = 1;
        while((flag & ret) == 0) {
            flag = flag << 1;
        }
        // 找这两个只出现一次的数据
        int ret1 = 0;
        int ret2 = 0;
        for (int num : array) {
            if((flag & num) != 0) {
                ret1 ^= num;
            } else {
                ret2 ^= num;
            }
        }

        return new int[]{ ret1, ret2 };
    }
}
