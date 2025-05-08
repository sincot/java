
//定义一个类类型
class Student
{
    //这些就是成员变量/成员属性
    public int id;
    public String name;
    public double high;
    public String sex;

    //行为/成员方法
    public void DoHomeWork() {
        System.out.println("做家庭作业");
    }

    public void PlayGame() {
        System.out.println("玩游戏");
    }
}

class Dog {
    //属性
    public String name;
    public String color;
    public int age;

    //成员方法
    public void DogBark() {
        System.out.println(name + " wolf wolf");
    }

    public void DogEat() {
        System.out.println(name + " eat eat");
    }
}


//定义一个日期类
class Date {
    public int year;
    public int month;
    public int day;

    public Date() {
        this(2027, 6, 10);
        System.out.println("不带参数的构造方法");
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void DatePrint() {
        System.out.println(this.year + "年" + this.month + "月" + this.day + "日");
    }
}

public class Test {
    public static void main(String[] args) {
        //实例化出一个Date对象
        Date date1 = new Date();//这里相当于调用了一个不带参数的构造方法
        date1.DatePrint();

        //这里相当于调用了带参数的构造方法
        Date date2 = new Date(2025, 5, 8);
        date2.DatePrint();


        /**
        //通过关键字 new 来实例化了一个 Dog 对象
        Dog dog = new Dog();
        //dog 就是一个引用，指向了 Dog 对象

        //访问类中的成员变量/成员方法，并进行赋值
        dog.name = "初一";
        dog.age = 8;
        dog.color = "白色";
        dog.DogBark();
        dog.DogEat();

        System.out.println("/*************");
        Dog dog2 = new Dog();
        //dog 就是一个引用，指向了 Dog 对象

        //访问类中的成员变量/成员方法，并进行赋值
        dog2.name = "十五";
        dog2.age = 6;
        dog2.color = "橘黄色";
        dog2.DogBark();
        dog2.DogEat();
        */
    }
}
