package testGeneric;

import java.util.ArrayList;

/**
 * TestGeneric就是一个普通的类
 * TestGeneric<E> 它就是一个泛型类
 * <>里面就是一个参数类型，但是这个类型是什么呢？这个类型现在是不确定的，相当于一个占位
 * 但是现在确定的是这个类型一定是一个引用数据类型，而不是基本数据类型
 */
public class TestGeneric<E> {
    int age;
    String name;
    E sex;

    public void a(E e) {

    }

    public void b(E[] e) {

    }
}

class SubGeneric extends TestGeneric<Integer> {

}
class SubGeneric2<E> extends TestGeneric<E> {

}

class Demo{
    public static void main(String[] args) {
        //指定父类泛型，那么子类就不需要在指定泛型了
        SubGeneric sub = new SubGeneric();
        sub.a(19);
    }
}

class Demo2{
    public static void main(String[] args) {
        SubGeneric2<Integer> sub2 = new SubGeneric2<>();
        sub2.a(18);
    }
}


class Test{
    public static void main(String[] args) {
        //GenericTest进行实例化；
        //1 实例化的时候不指定泛型: 如果实例化的时候不明确的指定类的泛型，那么认为次泛型为Object类型

        TestGeneric testGeneric = new TestGeneric();
        testGeneric.a("abc");
        testGeneric.a(17);
        testGeneric.a(7.8);
        testGeneric.b(new String[]{"a","b","3"});

        //2 实例化的时候指定泛型：
        TestGeneric<String> t2 = new TestGeneric<>();
        t2.sex = "男";
        t2.a("abc");
        t2.b(new String[]{"a","b","3"});
    }
}
