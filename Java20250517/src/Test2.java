
/**
class Base {
    public int a = 1;
    public int b = 2;
}

class B extends Base {
    public int a = 11;
    public int c = 3;

    public void Method() {
        System.out.println("a = " + super.a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
*/

/**
class B extends Base {
    public int a = 11;
    public int c = 3;

    public void Method() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
*/

/**
class Base {
    public int a = 1;
    public int b = 2;
    public int d = 4;
}

class B extends Base {
    public int a = 11;
    public int c = 3;

    public void Method() {
        //子类中的this可以访问a,b,c,d
        //子类中的super只能访问a,b,d
        System.out.println("a = " + super.a);
        System.out.println("a = " + this.a);
        System.out.println("b = " + super.b);
        System.out.println("b = " + this.b);
        System.out.println("c = " + this.c);
        System.out.println("d = " + super.d);
        System.out.println("d = " + this.d);
    }
}
*/

/**
class Shape {
    public void draw() {
        System.out.println("画图形！！！");
    }
}

// 画矩形
class Rect extends Shape {
    // 重写 draw 方法
    public void draw() {
        System.out.println("矩形");
    }
}

// 画圆
class Cycle extends Shape {
    // 重写 draw 方法
    public void draw() {
        System.out.println("圆形");
    }
}

// 画朵❀
class Flower extends Shape {
    // 重写 draw 方法
    public void draw() {
        System.out.println("❀");
    }
}
*/

/**
// 将 Shape 类设计成抽象类
abstract class Shape {
    public abstract void draw(); // 没有实现体
}

// 画矩形
class Rect extends Shape {
    // 重写 draw 方法
    public void draw() {
        System.out.println("矩形");
    }
}

// 画圆
class Cycle extends Shape {
    // 重写 draw 方法
    public void draw() {
        System.out.println("圆形");
    }
}

// 画朵❀
class Flower extends Shape {
    // 重写 draw 方法
    public void draw() {
        System.out.println("❀");
    }
}
*/

/**
// 将 Shape 类设置成接口
interface IShape {
    int draw = 10;
    void draw();

    default public void func1() {
        System.out.println("func1()");
    }

    public static void func2() {
        System.out.println("func2()");
    }
}

class Rect implements IShape {
    public void draw() {
        System.out.println("矩形");
    }
}

class Cycle implements IShape {
    public void draw() {
        System.out.println("圆形");
    }
}

class Flower implements IShape {
    public void draw() {
        System.out.println("❀");
    }
}
public class Test2 {
    public static void drawMap(IShape ishape) {
        ishape.draw();
    }
    public static void main(String [] args) {
        drawMap(new Cycle());
        drawMap(new Rect());
        drawMap(new Flower());
        drawMap(new Rect());
        drawMap(new Cycle());

        /**
        // 现在要打印圆形 矩形 ❀
        Cycle cycle = new Cycle();
        Rect rect = new Rect();
        Flower flower = new Flower();

        drawMap(cycle);
        drawMap(rect);
        drawMap(flower);
        */

        /**
        // 打印 圆形 矩形 ❀ 圆形 矩形 —— 不使用多态思想
        Rect rect = new Rect();
        Cycle cycle = new Cycle();
        Flower flower = new Flower();
        String[] shapes = {"cycle", "rect", "flower", "cycle", "rect"};

        for (String shape : shapes) {
            if (shape.equals("cycle")) {
                cycle.draw();
            } else if (shape.equals("rect")) {
                rect.draw();
            } else if (shape.equals("flower")) {
                flower.draw();
            }
        }
        */

        /**
        // 打印 圆形 矩形 ❀ 圆形 矩形 —— 使用多态思想
        Shape[] shapes = {new Cycle(), new Rect(), new Rect(),
                          new Flower(), new Cycle()};
        for (Shape shape : shapes) {
            shape.draw();
        }
        */

        /**
        drawMap(new Cycle());
        drawMap(new Rect());
        drawMap(new Flower());
        */

        /**
        // 实例化对象
        B b = new B();
        b.Method();

    }
}
*/