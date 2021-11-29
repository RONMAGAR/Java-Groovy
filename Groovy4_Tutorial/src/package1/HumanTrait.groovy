package package1

trait HumanTrait {
    def reUseFromHumanTrait(){
        println("Human Trait object")
    }
    abstract def update()
    public int count = 10
    private void ownMethod(){
        println("Human Trait own method")
    }

    def reUseFromHumanT(){
        println("Human Trait reuse")
        this.ownMethod()
    }

    def updateHuman(){
        println("updateHuman in humanTrait")
    }
}