package testCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test02 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(18);
        col.add(12);
        col.add(11);
        col.add("何青松");

        //对集合遍历（对集合中元素进行查看）
        //方式增强for循环
        for (Object o : col) {
            System.out.println("o = " + o);
        }


        //迭代器
        Iterator iterator = col.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
