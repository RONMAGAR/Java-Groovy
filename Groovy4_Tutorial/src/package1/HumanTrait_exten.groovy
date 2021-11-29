package package1

class HumanTrait_exten implements HumanTrait,PersonTrait{
    public int count = 20
    def update(){
        println("HumanTraitTest......")
    }

    def updateHua

    @Override
    Object updateHuman() {
        println("updateHuman() in HumanTrait_exten")
        HumanTrait.super.updateHuman()
        PersonTrait.super.updateHuman()
    }
}
