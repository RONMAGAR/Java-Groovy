package package1

class TestEmployee {

    static void main(String[] args) {
        Employee obj1 = new Employee(sal: 100,name: "a")
        Employee obj2 = new Employee(sal : 200,name: "b")

        obj1.sal++
        println(obj1.sal)

    }
}
