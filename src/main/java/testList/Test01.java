package testList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {

        List list =new ArrayList();
        list.add(13);
        list.add(17);
        list.add(6);
        list.add(-1);
        list.add(2);
        System.out.println("list = " + list);
        list.add(3,66);//根据下标添加元素
        System.out.println("list = " + list);
        list.set(3,77);//根据下标修改元素
        System.out.println("list = " + list);
        list.remove(2);//在集合中存入的是Interger类型数据的时候，调用remove方法删除的是下标为2的对应元素
        System.out.println("list = " + list);
        Object o = list.get(0);//根据下标返回对应的值，类型为Object
        System.out.println("o = " + o);


        //list集合 遍历：
        //普通for循环
        System.out.println("===============================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i) = " + list.get(i));
        }
        System.out.println("===============================");
        //增强for循环
        for (Object o1 : list) {
            System.out.println("o1 = " + o1);
        }

        //迭代器
        System.out.println("===============================");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());
        }
    }
}
