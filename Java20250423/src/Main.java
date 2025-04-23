import java.util.Random;
import java.util.Scanner;

public class Main {
    /**public static void main1(String[] args) {
        //求n的阶乘和
        //Scanner scanner = new Scanner(System.in);
        /**
        int n = scanner.nextInt();
        int ret = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            ret *= i;
            sum += ret;
        }
        */

        /**String name = scanner.nextLine(); //注意回车
        System.out.println(name);*/

        //循环读取数据
        /**while(scanner.hasNext()) {
            int n = scanner.nextInt();
            int ret = 1;
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                ret *= i;
                sum += ret;
            }

            System.out.println("n的阶乘和为" + sum);
        }*/

        //生成随机数

        /**Random random = new Random();
        int randomNum = random.nextInt(50) + 50;
        while(scanner.hasNextInt()) {
            System.out.println(randomNum);
        }*/

        //判断一个数是否是素数
        /**Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int flag = 1;
            if(n == 1) {
                System.out.println(n + "既不是素数也不是质数");
                return;
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    flag = 0;
                    break;
                }
            }

            if(flag == 1) {
                System.out.println(n + "是素数");
            }
            else {
                System.out.println(n + "不是素数");
            }
        }*/

        //求水仙花数
        /**for (int i = 1; i < 999999; i++) {
            //求一个数是几位数
            int tmp = i;
            int count = 0; //计数器
            while(tmp != 0) {
                tmp /= 10;
                count++;
            }

            tmp = i; //复原tmp
            int sum = 0;
            while(tmp != 0) {
                sum += Math.pow(tmp % 10, count);
                tmp /= 10;
            }

            if(sum == i) {
                System.out.println(i);
            }
        }*/

        //统计1~100之间9出现的次数
        /**int count = 0;
        for (int i = 1; i < 100; i++) {
            if(i % 10 == 9) {
                count++;
            }
            if(i / 10 == 9) {
                count++;
            }
        }

        System.out.println(count);*/


        /**Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(i == j || i + j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }*/

        public static void main2(String[] args) {
            /*Scanner scanner = new Scanner(System.in);
            int count = 3;

            System.out.println("你共有" + count + "次机会");
            while(count != 0) {
                System.out.println("请输入你的密码：");
                String password = scanner.nextLine();
                //比较两个字符串是否相等用equals
                if(password.equals("123456")) {
                    System.out.println("登陆成功");
                    break;
                } else {
                    count--;
                    System.out.println("密码错误");
                    System.out.println("你还剩下" + count + "次机会");
                }
           }*/

            //求两个数的最大公约数 --- 辗转相除法
            /*Scanner scanner = new Scanner(System.in);
            while(scanner.hasNextInt()) {
                int m = scanner.nextInt();
                int n = scanner.nextInt();

                while(m % n != 0) {
                    int q = m % n;
                    m = n;
                    n = q;
                }

                System.out.println(n);
            }*/
        }

        //不能交换两个数据的值
        /*public static void Swap(int x, int y) {
                int tmp = x;
                x = y;
                y = tmp;
        }
        public static void main(String[] args) {
            int a = 10;
            int b = 20;
            System.out.println("交换前： a = " + a + " b = " + b);
            Swap(a, b);
            System.out.println("交换后： a = " + a + " b = " + b);
        }*/
        
}


