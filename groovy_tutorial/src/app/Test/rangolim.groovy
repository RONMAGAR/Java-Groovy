package app.Test

class rangolim {
    static void printrangolim(nrow){
        for (i in 1..nrow){
            for (j in 1..i){
                if (j==1){
                    int k = i-1
                    print(" "*k + "* "*(nrow-k))
                }
                else {continue}
            }
            println()
        }

    }

    static void main(String[] args) {
        printrangolim(10)
    }
}
