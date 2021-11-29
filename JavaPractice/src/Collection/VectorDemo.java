package Collection;

import java.util.Enumeration;
import java.util.Vector;
// VECTOR IS THREAD SAFE
public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.addElement(new Integer(10));
        vector.addElement(new Float(20.55));
        vector.addElement(33.33);// it will create double object here
        vector.addElement(10);
        vector.addElement("universe!");
        vector.addElement("galaxy");
        vector.addElement(0);// add is not thread safe in vector

        System.out.println("Size of vector : "+ vector.size());

        Enumeration em = vector.elements();// to achieve the thread safety from getting elements from the vector

        while (em.hasMoreElements()){
            System.out.println(em.nextElement());
        }
    }
}
