// 设置 3 个接口
interface IFlying {
    void fly();
}

interface ISwimming {
    void swim();
}

interface IRunning {
    void run();
}

public class Test3 {
    public static void test1(Animal animal) {
        animal.eat();
    }

    public static void test2(IFlying iFlying) {
        iFlying.fly();
    }

    public static void test3(ISwimming iSwimming) {
        iSwimming.swim();
    }

    public static void test4(IRunning iRunning) {
        iRunning.run();
    }

    public static void main(String[] args) {
        Bird bird = new Bird("小鸟",80);
        Dog dog = new Dog("小狗", 90);
        test1(bird);
        test1(dog);

        test2(bird);

        test3(dog);

        test4(bird);
        test4(dog);

    }
}
