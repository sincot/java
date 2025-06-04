public class Main {
    public static void main(String[] args) {
        /**Date date1 = new Date();
        date1.setDate(2025, 6, 4);
        date1.DatePrint();
        System.out.println(date1.getYear());*/

        /**Student stu1 = new Student("lisi", 2);
        System.out.println(stu1);

        // 访问 static 成员变量
        Student.classroom = "309";*/

        /**Dog dog = new Dog();
        dog.name = "小狗";
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.name = "小猫";
        cat.eat();
        cat.mew();*/

        Dog dog = new Dog("小狗", 2);
    }

    /**public static void main1(String[] args) {
        {
            int x = 10;
            double y = 3.14;
            System.out.println("普通代码块");
        }

    }*/
}

// 将 Dog 和 Cat 之间相同的成员变量和成员方法抽象成一个类 Animal
class Animal {
    public String name;
    public int age;
    //public String color;

    // Animal 的静态代码块
    static {
        System.out.println("Animal的静态代码块");
    }

    // Animal 的实例化代码块
    {
        System.out.println("Animal的实例化代码块");
    }

    // Animal 的构造方法
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal的构造方法");
    }
    public void eat() {
        System.out.println(name + "正在吃粮");
    }
}

// Dog 继承 Animal 中的成员
class Dog extends Animal {
    // Dog 的静态代码块
    static {
        System.out.println("Dog 的静态代码块");
    }

    // Dog 类的实例化代码块
    {
        System.out.println("Dog 的实例化代码块");
    }
    public Dog(String name, int age) {
        super(name, age);
        System.out.println("Dog类的构造方法");
    }

    public void bark() {
        System.out.println(name + "正在汪汪叫");
    }
}

// Cat 继承 Animal 中的成员
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    public void mew() {
        System.out.println(name + "正在喵喵叫");
    }
}

/**
// Dog类
class Dog {
    public String name;
    public int age;
    public String color;

    public void eat() {
        System.out.println(name + "正在吃粮");
    }

    public void bark() {
        System.out.println(name + "正在汪汪叫");
    }
}

class Cat {
    public String name;
    public int age;
    public String color;

    public void eat() {
        System.out.println(name + "正在吃粮");
    }

    public void mew() {
        System.out.println(name + "正在喵喵叫");
    }
}
*/

// 学生类
class Student {
    public String name;
    public int age;
    public static String classroom;

    {
        name = "lisi";
        age = 7;
        System.out.println("实例代码块");
    }

    static
    {
        classroom = "305";
        System.out.println("静态代码块");
    }

    Student() {
        System.out.println("无参的构造函数");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("带参的构造函数");
    }

    // 获取静态成员变量
    public static String getClassroom() {
        return classroom;
    }

    public String toString() {
        return "[" + " name = " + name
                + " age = " + age + "]";
    }
    // 获取类中的成员变量
    /**public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }*/
}

// 日期类
class Date {
    public int year;
    public int month;
    public int day;

    // 不带参数的构造方法
    public Date() {
        System.out.println("不带参数的构造方法");
    }

    // 带参的构造方法
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("带参的构造方法");
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void DatePrint() {
        System.out.println(year + "年" + month + "月" + day + "日");
    }
}