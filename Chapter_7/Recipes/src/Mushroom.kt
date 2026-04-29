class Mushroom(val size: Int, val isMagic: Boolean) {
    constructor(isMagic_param: Boolean) : this(0, isMagic_param) {
        println("Mushroom constructor is $isMagic_param")
    }
}
