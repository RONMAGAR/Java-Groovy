package package1
class Numberlist{
    def array
    Numberlist(size){
        array = new Integer[size]

    }
    def putAt(Integer index,Object value){
        array[index] = value
    }

    def getAt(Integer index){
        array[index]
    }
}

class TestIndexOperator {
    static void main(String[] args) {
        println("-------this is normal way----------")
        def arrayins = new Numberlist(10)
        arrayins.putAt(1,34)
        def value = arrayins.getAt(1)
        println(value)

        println("------------this is groovy way------------------")

        arrayins[0] = 1010
        println(arrayins[0]) // for this to function the class upper class needs to be have putAt and
                            // getAt method compulsory with correct spelling
        println arrayins.getAt(0)
    }
}
