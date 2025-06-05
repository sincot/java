/**
public class Main {
    public static void main(String[] args) {
        A a = new A();
        A ab = new B();
        A abc = new C();
    }
}

class A{

}
class B extends A {

}

class C extends B {

}*/

/**
class X {
    Y y = new Y();
    public X() {
        System.out.print("X");
    }
}

class Y {
    public Y() {
        System.out.print("Y");
    }
}

class Z extends X {
    Y y = new Y();
    public Z() {
        System.out.print("Z");
    }
}

public class Main {
    public static void main(String[] args) {
        new Z();
    }
}*/

class Animal {
    public String name;
    public int age;

    // 带参的构造函数
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + "正在吃食物");
    }

    // 打印
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Dog extends Animal {
    // Dog 的构造
    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println(name + "正在汪汪叫");
    }
}

class Bird extends Animal {
    // Bird 的构造
    public Bird(String name, int age) {
        super(name, age);
    }

    public void fly() {
        System.out.println(name + "正在用翅膀飞");
    }
}

public class Main {
    public static void main1(String[] args) {
        /**Dog dog = new Dog("小狗",21);
        dog.eat();
        dog.bark();

        Animal animal = new Animal("动物", 23);
        animal.eat();*/

        //向上转型 —— 三种转型方式：直接赋值，方法传参，返回值
        // 方法1：直接赋值
        Animal animal1 = new Dog("动物1",11);
        Animal animal2 = new Bird("动物2",10);

        // 方法2：方法传参
        Dog dog = new Dog("小狗", 8);
        Bird bird = new Bird("小鸟",9);
        func1(dog);
        func1(bird);

        // 方法3：返回值
        Animal animal3 = func2();
        Animal animal4 = func2();
    }

    public static void func1(Animal animal) {

    }

    public static Animal func2() {
        //return new Dog("小狗",21);
        return new Bird("小鸟", 22);
    }

    public static void main(String[] args) {
        Rect rect = new Rect();
        Cycle cycle = new Cycle();
        Flower flower = new Flower();

        drawMap(rect);
        drawMap(cycle);
        drawMap(flower);
    }

    public static void drawMap(Shape shape) {
        shape.draw();
    }
}

abstract class Shape {
    public void draw();
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("▭");
    }
}

class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("○");
    }
}

class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("❀");
    }
}

// 图形类
/**
class Shape {
    public void draw() {
        System.out.println("画图");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("▭");
    }
}

class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("○");
    }
}

class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("❀");
    }
}
*/