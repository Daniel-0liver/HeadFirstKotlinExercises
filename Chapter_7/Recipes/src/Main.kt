fun findRecipes(
    title: String = "",
    ingredient: String = "",
    isVegetarian: Boolean = false,
    difficulty: String = "",
): Array<Recipes> {
    return arrayOf(
        Recipes("Thai Curry", "Chicken", false, "Medium"),
        Recipes("Vegetable Stir Fry", "Broccoli", true, "Easy"),
        Recipes("Beef Stew", "Beef", false, "Hard"),
    ).filter { recipe ->
        (title.isEmpty() || recipe.title.contains(title, ignoreCase = true)) &&
                (ingredient.isEmpty() || recipe.mainIngredient.contains(ingredient, ignoreCase = true)) &&
                (!isVegetarian || recipe.isVegetarian) &&
                (difficulty.isEmpty() || recipe.difficulty.equals(difficulty, ignoreCase = true))
    }.toTypedArray()
}

fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

fun addNumbers(a: Double, b: Double): Double {
    return a + b
}

fun main() {
    val r1 = Recipes("Thai Curry", "Chicken")
    val r2 = Recipes("Thai Curry", "Chicken", false)
    val r3 = r1.copy(title = "Chicken Bhuna")

    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")
    println("r1 toString: ${r1.toString()}")
    println("r1 == r2? ${r1 == r2}")
    println("r1 === r2? ${r1 === r2}")
    println("r1 == r3? ${r1 == r3}")
    val (title, mainIngredient, isVegetarian, difficulty) = r1
    println("title: $title, mainIngredient: $mainIngredient, isVegetarian: $isVegetarian, difficulty: $difficulty")

    val m1 = Mushroom(6, false)
    println("m1 size is ${m1.size} and isMagic is ${m1.isMagic}")
    val m2 = Mushroom(true)
    println("m2 size is ${m2.size} and isMagic is ${m2.isMagic}")

    println(addNumbers(5, 10))
    println(addNumbers(5.5, 10.5))
}
