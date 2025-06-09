import java.util.Scanner;

public class Main {
    public static void main1(String[] args) {
        /**StringBuilder stringbuilder = new StringBuilder("hello world");
        System.out.println(stringbuilder);
        stringbuilder.append(1);
        System.out.println(stringbuilder);
        stringbuilder.append(" and space");
        System.out.println(stringbuilder);*/

        /**StringBuilder stringbuilder = new StringBuilder("hello world");
        System.out.println(stringbuilder);
        stringbuilder.setCharAt(2, '*');
        System.out.println(stringbuilder);*/

        /**StringBuilder stringbuilder = new StringBuilder("hello world");
        System.out.println(stringbuilder);
        stringbuilder.insert(6,"space and ");
        System.out.println(stringbuilder);
        stringbuilder.insert(2, '*');
        System.out.println(stringbuilder);*/

        /**StringBuilder stringbuilder = new StringBuilder("hello world");
        System.out.println(stringbuilder);
        stringbuilder.reverse();
        System.out.println(stringbuilder);*/

        /**StringBuilder stringbuilder = new StringBuilder("hello world");
        System.out.println(stringbuilder);
        for (int i = 0; i < stringbuilder.length(); i++) {
            System.out.print(stringbuilder.charAt(i) + " ");
        }
        System.out.println();*/

        /**Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] count = new int[26];
        // 将字符串中的字符出现的次数存储到 count 数组中
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch - 'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(count[ch - 'a'] == 1) {
                System.out.println("第一个只出现一次的字符是 " + ch);
                break;
            }
        }*/

        /**Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int index = str.lastIndexOf(' ');
        String ret = str.substring(index + 1);
        System.out.println(ret.length());*/

        /**int a = 10;
        if(a == 10) {
            throw new ArithmeticException("a == 10");
        }*/

        /**try {
            int[] array = null;
            System.out.println(10/0);
            System.out.println(array.length);
            System.out.println("13579");
        } catch(ArithmeticException e) {
            System.out.println("捕获到了算术异常！");
            e.printStackTrace();
        } catch(NullPointerException e) {
            System.out.println("捕获到了空指针异常！");
            e.printStackTrace();
        }

        System.out.println("其它的代码");*/

       /** try {
            System.out.println(10/0);
        } catch(ArithmeticException e) {
            System.out.println("捕获到了算术异常！");
            e.printStackTrace();
        } finally {
            System.out.println("finally被执行了");
        }

        System.out.println("其它的代码");*/

        /**try {
            System.out.println(10/10);
        } catch(ArithmeticException e) {
            System.out.println("捕获到了算术异常！");
            e.printStackTrace();
        } finally {
            System.out.println("finally被执行了");
        }

        System.out.println("其它的代码");*/
        /**try {
            func();
        } catch(ArithmeticException e) {
            e.printStackTrace();
            System.out.println("捕获到了算数异常！");
        } finally {

        }*/

    }

    public static void func() {
        int a = 0;
        System.out.println(10/a);

        /**try {
            int a = 0;
            System.out.println(10/a);
        } catch(ArithmeticException e) {
            System.out.println("捕获到了算术异常！");
        }*/


    }


}

