package package2

class Employee_Sorter {
    private static List<Employee> list
    static void main(String[] args) {
        list = new ArrayList<Employee>()
        list.add(new Employee(id: 110,name: "abc",salary: 1000))
        list.add(new Employee(id:111,name: "bcd",salary: 1100))

        list.add(new Employee(id: 112,name: "cde",salary: 1300))
        list.add(new Employee(id:113,name: "def",salary: 1200))

        list.add(new Employee(id: 114,name: "efg",salary: 1050))
        list.add(new Employee(id:115,name: "fgh",salary: 1900))

        list.sort()
        list.each {
            println(it.name)
        }

    }
}
