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
    vet.giveShot(hippo)
    vet.giveShot(wolf)
}
