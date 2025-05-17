import java.util.Arrays;

class Person implements Comparable<Person> {
    public String name;
    public int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        // obj 不能为空
        if(obj == null) {
            return false;
        }
        // 若 this 与 obj 相等，则返回 true
        if(this == obj) {
            return true;
        }
        // 判断 obj 是否是 Person 对象，必须是相同类型的对象进行比较
        if(!(obj instanceof Person)) {
            return false;
        }
        // 向下转型，比较属性值
        Person person = (Person) obj;

        return this.name.equals(person.name) && this.age == person.age;
    }

    @Override
    public int compareTo(Person obj) {
        return this.age - obj.age;
    }
}
public class Test5 {

    public static void main(String[] args) {
        /**
        Person person1 = new Person("zhangsan",11);
        System.out.println(person1);
        Person person2 = new Person("zhangsan",11);
        System.out.println(person2);

        // 比较 person1 与 person2
        // 若直接用 == 来比较，比较的是两个对象的地址
        System.out.println(person1 == person2);
        // 要想比较两个对象，需要 equals 比较
        System.out.println(person1.equals(person2));
         */

        Person person1 = new Person("zhangsan",11);
        Person person2 = new Person("lisi", 15);
        Person person3 = new Person("wangwu", 18);
        Person[] persons = new Person[] { person1, person2, person3 };

        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
    }
}
