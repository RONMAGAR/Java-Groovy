package Collection;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Integer(10));
        list.add(new Float(20.5));
        list.add(new Integer(30));
        list.add(23);//autooxing
        list.add(new String("hello"));
        list.add(new String("hello"));// stores duplicate object
        list.add(new Integer(10));
        list.add(2,new String("welcome"));// it doesnt replace  but pushes the elements forward and occupy
        list.add(3,"home");
        list.add(new Student(101,"tony",99.9f));

        System.out.println("size of Arraylist : "+ list.size());
        System.out.println("arraylist elements : ");
        for (int i = 0; i<list.size();i++){
            Object obj = list.get(i);
            if (obj instanceof Student){
                System.out.println("Roll no : "+ ((Student) obj).getRollNo());
                System.out.println("Name : " + ((Student) obj).getName());//casting from Object to student class(Downcasting)
                System.out.println("Percentage : "+((Student) obj).getPercentage());
            }
            else {
                System.out.println(obj);
            }
        }
        ArrayList<Integer> list1 = new ArrayList<Integer>();//declared type safe for integer

        //list1.add("scsc"); it will throw class cast exception as we have used generics and made arraylist compulsory to take int values as input

        list1.add(2);
        list1.add(45);




    }
}
