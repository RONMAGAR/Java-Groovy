package package1

class Vehicle{
    String model
    double price
}

class TestSpreadOperator {
    static void main(String[] args) {
        def vehicle = [new Vehicle(model: "maruti",price: 2345),
                       new Vehicle(model: "ashokl",price:10000),
                       new Vehicle(model:"Mahendra",price: 55000),
        new Vehicle(model: "suzuki",price: 200000)]
        def models = vehicle*.model //it will collect all the models from vehicle array of objects of class vehicles

        def prices=vehicle*.price
        println(models.class.name)
        println(prices)

        for (model in models){
            println("name of model : $model")
        }
        for (price in prices){
            println("price value is : $price")
        }
        println("---------------------------")

        Integer n1 =100
        Integer n2 = 120

        def output = n2.compareTo(n1)
        println("compareTo output is : $output")
        output = n2 <=> n1
        println("Spaceship (<=>) compare output is : $output")


    }
}
