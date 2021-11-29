package package1

class TestHumanTrait {
    static void main(String[] args) {
        def human = new HumanTrait_exten()
        HumanTrait h = new HumanTrait_exten()
        human.update()
        human.reUseFromHumanTrait()
        human.reUseFromHumanT()


//        def baseCount1 = human.count
//        println(baseCount1)

        def basecount2 = human.package1_HumanTrait__count // Inorder if we get name conflict between parent
        // trait (bcoz we cant create objects of trait class)
        //and child class variable name conflict then we access by obj.packagename_Traitname__vname
        println(basecount2)

        def basecount1 = human.count
        println(basecount1)
        human.updateHuman()

    }
}
