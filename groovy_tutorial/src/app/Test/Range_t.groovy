package app.Test

class Range_t {
    static void main(String[] args) {
        def range = 2..10
        def range_step = range.step(2)
        def ron = [1,1,2,3,4,"rxtrdtc"]
        def ronn = ron.count(1)
        println(ronn)
        def range_by = range.countBy {0}
        println(range)
        println(range_step)
        println(range_by)
        def arr = [2,3,4,5,6,7,"ronmagar"]
        for (i in (3..10).step(2)){
            println(i)
        }
    }
}
