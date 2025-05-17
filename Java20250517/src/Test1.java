
/**
// 将 Dog 类 和 Cat 类的共有属性和方法抽象出来，形成一个类Animal
class Animal {
    public String name;
    public int age;
    public String color;

    public void eat() {
        System.out.println(name + "正在吃饭 --- Animal");
    }

    public void sleep() {
        System.out.println(name + "正在睡觉");
    }

    /**
    // 静态代码块
    static {
        System.out.println("Animal的静态代码块");
    }

    // 实例化代码块
    {
        System.out.println("Animal的实例化代码块");
    }
    */

    /**
    // 构造方法
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        //System.out.println("Animal的构造方法");
    }

    // 打印
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

}
*/

/**
// 定义一个 Dog 类
class Dog extends Animal{
    public void Bark() {
        System.out.println(name + "正在汪汪叫");
    }

    public void eat() {
        System.out.println(name + "正在吃狗粮 --- Dog");
    }

    /**
    // 静态代码块
    static {
        System.out.println("Dog的静态代码块");
    }

    // 普通代码块
    {
        System.out.println("Dog的普通代码块");
    }


    // 构造方法
    public Dog(String name, int age, String color) {
        super(name, age, color);
        //System.out.println("Dog的构造方法");
    }
}

// 定义一个 Cat 类
class Cat extends Animal {
    public void Meow() {
        System.out.println(name + "正在喵喵叫");
    }
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }
}

// 定义一个 Bird 类
class Bird extends Animal {
    public void Chirp() {
        System.out.println(name + "正在叽叽喳喳");
    }

    // 构造方法
    public Bird(String name, int age, String color) {
        super(name, age, color);
    }

    public void fly() {
        System.out.println(name + "正在飞");
    }
}

/**
class Student {

}

class Teacher {

}

class School {
    // Student 类 和 Teacher 类都是 School 类的组成部分
    // 所以 School 类可以写成这样，用别的对象作为自己的成员
    public Student[] students;
    public Teacher[] teachers;

    // 构造函数
    public School() {
        this.students = new Student[10];
        this.teachers = new Teacher[10];
    }
}
*/

/**
public class Test1 {
    public static void main(String[] args) {
        Animal animal1 = new Bird("小鸟1",1,"颜色1");
        // 向下转型
        if(animal1 instanceof Bird) {
            Bird bird1 = (Bird) animal1;
            bird1.fly();
        } else {
            System.out.println("不能飞!");
        }

        Animal animal2 = new Dog("小狗2",2,"颜色2");
        // 向下转型
        if(animal2 instanceof Bird) {
            Bird bird2 = (Bird) animal1;
            bird2.fly();
        } else {
            System.out.println("不能飞！");
        }

        /**
        // 实例化对象
        Dog dog = new Dog();
        dog.name = "初一";
        dog.eat();
        dog.wolfwolf();

        Cat cat = new Cat();
        cat.name = "十五";
        cat.eat();
        cat.miaomiao();
         */

        /**
        // 父类引用，引用了子类对象
        Animal animal1 = new Dog("小狗1",11,"颜色1");
        animal1.eat();

        Dog dog = new Dog("初一",10,"橘黄色");
         */

        /**
        Dog dog = new Dog("小狗1",11,"颜色1");
        dog.eat();
        dog.Bark();

        Animal animal = new Animal("动物1",21,"颜色1");
        animal.eat();
        animal.Bark();
        */

        /**
        //上面的代码可以看成是以下两行代码的合并
        // Dog dog = new Dog("小狗",1,"颜色");
        // Animal animal = dog;
        */

        /**
        // 被 final 修饰后的变量被认为是常量
        // 常量是不能被修改的，所以Java会报错
        final int a = 10;
        a = 20;
        System.out.println(a);
         */

        /**
        int[] array = { 1, 2, 3, 4, 5 };
        array = new int[10];

        final int[] array1 = { 1, 2, 3, 4, 5 };
        array1 = new int[10];

        array1[0] = 11;
         */

        /**
        // 这就是向上转型 父类引用 引用了子类对象
        // 方法1 ： 直接赋值
        Animal animal1 = new Dog("小狗",1,"颜色1");
        Animal animal2 = new Bird("小鸟",2,"颜色2");

        // 方法2 : 方法传参
        Dog dog = new Dog("小狗",1,"颜色");
        Bird bird = new Bird("小鸟",1,"颜色");
        func1(dog);
        func1(bird);

        // 方法3 : 返回值
        Animal animal3 = func2();

    }

    /**
    public static void func1(Animal animal) {

    }

    public static Animal func2() {
        // 返回值为父类Animal类型，那么返回值的类型可以是Animal类型，也可以是其子类类型
        return new Dog("小狗",1,"颜色");
    }

}
*/