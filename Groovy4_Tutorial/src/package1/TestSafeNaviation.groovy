package package1

class TestSafeNaviation {
    static void main(String[] args) {
        String name
        def data
//        if (name!=null)
//            data = name.charAt(1)
        data = name?.charAt(1)
        println(data)


    }
}
