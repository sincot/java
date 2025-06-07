public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        /**Person person1 = new Person(21);
        Person person2 = (Person)person1.clone();
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);*/

        new A() {
            public void testA() {
                System.out.println("public void testA()");
            }
        }.testA(); // 匿名内部类，这个类没有名字
    }
}

class OuterClass {
    // 实例内部类
    class InnerClass1 {

    }

    // 静态内部类
    static class InnerClass2 {

    }
}

interface A {
    void testA();
}

class Money {
    public double money = 19.9;
}

class Person implements Cloneable {
    public int age;

    public Money m;
    public Person(int age) {
        this.age = age;
        this.m = new Money();
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", m=" + m +
                '}';
    }
}

class Student implements Comparable<Student> {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.age > o.age) {
            return 1;
        } else if(this.age < o.age) {
            return -1;
        } else {
            return 0;
        }
    }
}

