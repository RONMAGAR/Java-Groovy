package data

import com.sun.xml.internal.ws.util.xml.CDATA

// in groovy if we dont define void return type it will return the last variable value declared
class returnexm {

    def exm(num){
        println(num)
        def x =10
        def s ="string"
        def k =5
        return s
    }

    static void main(String[] args) {
        def o = new returnexm()
        println o.exm(10)
        def data = [1,2,3 ,"ronitm"]
        println(data)

        try {
            int []arr = new int[4];
            arr[] = [3,5,7,7]
            println arr[10]
        }
        catch ( e){
            println e.getMessage()
        }
    }
}
