package package1
class Human{
    def salary = 10000
    def name
    def run(num){
        def sal = num
        println("run() is running")
        println("salary is "+sal)
    }

    static def update(data){
        if(data){

        }
        else {

        }
    }
}

class TestMethodOperator {
    static void main(String[] args) {
        def obj = new HumanTrait(name: "aman")
        def ref  = obj.name
        def ref2 = obj.&run  //creating reference for a method
        ref2(20)
        obj.run(67890)
        println(ref)
        useHumanRun(ref2)
        println("-----------------------")
        println(ref3(true))
        println("-----------------------")

        def ref3
    }

    static void useHumanRun(ref){
        ref("user in human!")
    }

}
