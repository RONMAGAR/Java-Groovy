package app.Test

class Range_array {
    static void printfrang(nrow){
        for (i in 1..nrow){
            for (j in 1..i){
                if (j==1){
                    int k = nrow -i
                    print(" "*k + "* "*i)
                }
                else {continue}
            }
            println()
        }
    }


    static void main(String[] args) {
         printfrang(10)
    }
}
