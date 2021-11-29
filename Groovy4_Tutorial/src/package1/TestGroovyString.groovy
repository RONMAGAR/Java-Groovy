package package1

class TestGroovyString {
    static void main(String[] args) {
        def str1 = 'my data in single quote'
        def str2 = '''this data is in triple single quote
so its multi line!!'''
        def str3 = """this data is in triple double quotes
so its multi line """

        println(str1)
        println(str2)
        println("""this data is 
str1 plus str2 ${str1} + ${str2}""")
        println(str3)

        println("-------------------------------------------")
        def stringDollar = $/Text/$ //for regular expressios used for validations like mail id
        def str4 = /string in slash/
        println(str4)
        println(stringDollar)
        println("---------------------------------------------")
        def str5 = "The sum is ${100 > 10}"
        println(str5)
        println("---------------------------------------------")
        def name2
        def name = name2?:"anonymus"
        println("name : " + name)
//        println("name2 : " + name2)

        def name1
        name1 ?=3
        println("name : " + name1)

    }
}
