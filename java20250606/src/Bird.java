public class Bird extends Animal implements ISwimming, IFlying {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + "正在吃虫子");
    }

    public void swim() {
        System.out.println(name + "正在用蹼游泳");
    }

    public void fly() {
        System.out.println(name + "正在用翅膀飞");
    }
}
