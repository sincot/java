interface A {
    void testA();
}

interface B {
    void testB();
}

interface C {
    void testC();
}

// 上面实现了三个接口，现在想实现一个接口 D ，同时具有接口 B 和接口 C 的功能
interface D extends B,C {
    void testD();
}

public class Test4 implements D {
    @Override
    public void testB() {

    }

    @Override
    public void testC() {

    }

    @Override
    public void testD() {

    }
}



