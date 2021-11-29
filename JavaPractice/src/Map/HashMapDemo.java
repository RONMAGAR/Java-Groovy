package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(10,"hello");
        map1.put(new Integer(20),"ronit");
        map1.put(1,"hiiii");
        map1.put(10,"hello changed");
        map1.put(null,"manoj");
        map1.put(4,"skdncklnc");

        System.out.println("1st map : ");
        System.out.println("value for key 10 : "+map1.get(10));
        Set<Integer> keys = map1.keySet();// keyset() returns all the keys of map associated with it
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            Integer key = it.next();
            System.out.println(key + " "+ map1.get(key) );
        }

        HashMap<Employee,String> map2 = new HashMap<>();
        map2.put(new Employee(101,"tony",1000000),"Trainer");
        map2.put(new Employee(102,"stark",2000000),"Manager");
        map2.put(new Employee(103,"thor",4000000),"Leader");
        map2.put(new Employee(104,"dr",3000000),"Training Leader");
        map2.put(new Employee(104,"dr",3000000),"Trainee");



        Set<Employee> keyset = map2.keySet();
        Iterator<Employee> it1 = keyset.iterator();
        while (it1.hasNext()){
            Employee e = it1.next();
            System.out.println("ID : "+e.getId() + " Name : "+e.getName() + " salary : "+e.getSalary());
        }


    }
}
