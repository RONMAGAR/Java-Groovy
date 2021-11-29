package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add(new Integer(10));
        set.add(new Float(2.22));
        set.add(new String("hello"));
        set.add(new String("hello"));
        set.add(45.5);
        set.add(new Student(103,"stark",98.8f));
        set.add(new Student(104,"thor",88.9f));
        set.add(10);
        set.add(new Student(104,"thor",88.9f));
        System.out.println("size of HASHSET : "+ set.size());

        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
