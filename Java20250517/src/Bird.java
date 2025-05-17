public class Bird extends Animal implements IRunning, IFlying {
    public Bird(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + "正在吃虫子 --- Bird");
    }

    @Override
    public void fly() {
        System.out.println(name + "正在飞 --- Bird");
    }

    @Override
    public void run() {
        System.out.println(name + "正在跑 --- Bird");
    }
}
