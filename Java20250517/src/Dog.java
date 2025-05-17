// 继承
public class Dog extends Animal implements IRunning, ISwimming {
    // 重写
    public Dog(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + "正在吃狗粮 --- Dog");
    }

    @Override
    public void swim() {
        System.out.println(name + "正在游 --- Dog");
    }

    @Override
    public void run() {
        System.out.println(name + "正在跑 --- Dog");
    }
}
