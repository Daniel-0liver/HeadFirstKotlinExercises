fun main() {
    val animals = listOf(
        Hippo(),
        Wolf()
    )

    for (animal in animals) {
        animal.roam()
        animal.eat()
    }

    val vet = Vet()
    val hippo = Hippo()
    val wolf = Wolf()
    val vehicle = Vehicle()
    vet.giveShot(hippo)
    vet.giveShot(wolf)
    vehicle.roam()

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (roamable in roamables) {
        roamable.roam()
        if (roamable is Animal) {
            roamable.eat()
        }
    }
}
