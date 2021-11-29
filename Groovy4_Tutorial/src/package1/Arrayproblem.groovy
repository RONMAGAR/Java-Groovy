package package1

class Arrayproblem {

    static void main(String[] args) {

        def arr = [1,2,3,4,true,"ronit","tony",6,7,34.34]
        def sortthearrayint = { arr1->
                for (i in arr1){
                    if (i instanceof Integer){
                        println("Integer is : "+i)
                    }
                }
        }
        def sortthearraybool = { arr1->
                for (i in arr1){
                    if (i instanceof Boolean)
                        println("Boolean is : " + i)
                }

        }

        def sortthearraydouble = { arr1->
            for (i in arr1){
                if (i instanceof BigDecimal)
                    println("Double is : " + i)
            }

        }

        def sortthearraystring = {
            arr1->
                for (i in arr1){
                    if (i instanceof String)
                        println("String is : " + i)
                }

        }

        sortthearraybool(arr)
        println("--------------------------")
        sortthearraydouble(arr)
        println("--------------------------")

        sortthearrayint(arr)
        println("--------------------------")
        sortthearraystring(arr)


    }
}
