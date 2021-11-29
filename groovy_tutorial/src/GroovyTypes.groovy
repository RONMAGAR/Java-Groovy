class GroovyTypes {
    static namer
    static void main(String[] args) {
        String data = "this is java string"

        namer = "ronit magar"
        println namer.class.name   //IN GROOVY WE DON'T NEED TO SPECIFY DATA-TYPE
        namer =20
        println(namer.class.name) // AS DATA TYPE OF VARIABLE NAMER IS NOT DECLARED EXPLICITLY IT WILL KEEP ON CHANGING ITS DATA TYPE
        data = 10
        println data.class.name // AS VARIABLE DATA IS DECLARED EXPLICITLY AS STRING IT WONT CHANGE ITS DATA TYPE
        namer = "milky way galaxy!!"
        println namer.charAt(2)
    }

}
