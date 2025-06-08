public class Main {
    public static void main(String[] args) {
        /**
        // 字符串的三种构造方法
        // 第一种方法：常量字符串直接构造
        String str1 = "Hello world";
        System.out.println(str1);

        // 第二种方法：直接 new 一个 String 类型的对象
        String str2 = new String("hello java");
        System.out.println(str2);

        // 第三种方法：字符串数组进行构造
        char[] array = { 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd' };
        String str3 = new String(array);
        System.out.println(str3);

        System.out.println("str1的长度" + str1.length());
        System.out.println("str2的长度" + str2.length());
        System.out.println("str3的长度" + str3.length());
        System.out.println(str1.isEmpty());*/

        /**String str1 = new String("24680");
        String str2 = new String("24680");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));

        String s1 = "13579";
        String s2 = "13579";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2.compareTo(s2));*/

        /**String str = new String("watergraphically");
        char index1 = str.charAt(15);
        System.out.println(index1);
        int index2 = str.indexOf('i', 0);
        System.out.println(index2);*/

        /**String s1 = String.valueOf(1234);
        String s2 = String.valueOf(12.34);
        String s3 = String.valueOf(true);
        String s4 = String.valueOf(new Student("大可", 18));
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());*/

        /** String s1 = "hello";
        // 字符串转数组
        char[] ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();
        // 数组转字符串
        String s2 = new String(ch);
        System.out.println(s2);*/

        /**String str1 = "ababcabcabcdabcde";
        System.out.println("替换前：" + str1.toString());
        String ret1 = str1.replace("ab", "****");
        System.out.println("替换后：" + ret1.toString());
        System.out.println();

        String str2 = "ababcabcabcdabcde";
        System.out.println("替换前：" + str2.toString());
        String ret2 = str2.replace('b','*');
        System.out.println("替换后：" + ret2.toString());
        System.out.println();

        String str3 = "hello java java";
        System.out.println("替换前：" + str3.toString());
        String ret3 = str3.replaceFirst("java", "****");
        System.out.println("替换后：" + ret3.toString());*/

        /**String str1 = "ababcabcabcdabcde";
        String[] ret1 = str1.split("b");
        for (String s : ret1) {
            System.out.println(s);
        }
        System.out.println();

        String str2 = "ababcabcabcdabcde";
        String[] ret2 = str2.split("b", 3);
        for (String s : ret2) {
            System.out.println(s);
        }*/

        String str = "hello java java";
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,7));
    }
}

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + age;
    }
}