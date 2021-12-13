package testGeneric;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class GenericTest <A,B,C>{
    A age;
    B name;
    C sex;

    public GenericTest(A age, B name, C sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public void test(A a, B b, C c){

    }

    public void b(){
        LinkedList<String> list = new LinkedList<>();
        list.add("adsf");
    }
}