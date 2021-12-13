package testCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        /*
         * Collection接口的常用方法：
         * 增加：add（E e）addAll(Collection<? extends E> c)
         * 删除：clear() remove（Object o)
         * 修改：
         * 查看：iterator（）size（）
         * 判断：contains（） equals（Object o）isEmpty()
         */
        //创建对象：接口不能创建对象，利用实现类创建对象：
        Collection col = new ArrayList();
        //调用方法：
        //集合有一个特点：只能存放引用数据的类型的数据，不能是基本数据类型
        //基本数据类型自动装箱，对应包装类。int---> Interger
        col.add(18);
        col.add(12);
        col.add(11);
        col.add(17);
        System.out.println(col.toString());


        List list = Arrays.asList(new Integer[]{11, 15, 3, 7, 1});

        col.addAll(list);//将另一个集合放入col
        System.out.println(col.toString());

//        col.clear();//清空集合
        System.out.println("col.isEmpty() = " + col.isEmpty());//判断集合是否非空

        System.out.println("col.size() = " + col.size());//集合大小

        boolean remove = col.remove(15);//删除指定元素
        System.out.println("remove = " + remove);
        System.out.println(col.toString());

        System.out.println("col.size() = " + col.size());//集合大小


        Collection col2 = new ArrayList();
        col2.add(18);
        col2.add(12);
        col2.add(11);
        col2.add(17);

        Collection col3 = new ArrayList();
        col3.add(18);
        col3.add(12);
        col3.add(11);
        col3.add(17);

        System.out.println("col2.equals(col3) = " + col2.equals(col3));
        System.out.println( col2 == col3);


        System.out.println("col3.contains(17) = " + col3.contains(17));//是否包含元素
    }
}
