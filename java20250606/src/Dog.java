public class Dog extends Animal implements ISwimming, IRunning {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + "正在吃狗粮");
    }

    public void swim() {
        System.out.println(name + "正在用狗腿游泳");
    }
    public void run() {
        System.out.println(name + "正在用狗腿跑");
    }
}
