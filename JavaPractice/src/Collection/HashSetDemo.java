package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new Integer(10));
        set.add(new Float(2.22));
        set.add(new String("hello"));
        set.add(45.5);
        set.add(new Student(103,"stark",98.8f));
        set.add(new Student(104,"thor",88.9f));
        set.add(10);
        set.add(new Student(104,"thor",88.9f)); // refer Student.java where hashCode and equal are overriden
        // here hashCode() will look for reference , here as reference are different it will identify same content as unique
        //so we have to override the hashCode() and equlas() from student
        System.out.println("size of HASHSET : "+ set.size());

        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());// for student.java class objects we have to override the tostring() method
        }
        HashSet<String> set1 = new HashSet<String >();// declared tyoesafe for only strings so no other data types will be allowed
        //set1.add(3); strictly String
        set1.add("hello");
        set1.add("hii");
        set1.add("tony");
        set1.add("Stark");
        System.out.println(set1);

    }
}
