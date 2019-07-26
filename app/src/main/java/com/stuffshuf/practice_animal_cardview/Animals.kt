package com.stuffshuf.practice_animal_cardview

data class Animals(
    val dog: String
)

val AnimalName = arrayOf("dog","cat", "owl","cheetah", "raccoon","bird","snake","lizard","hamster","bear","lion")


fun getAllAnimal(n:Int):ArrayList<Animals> {
    val animal = ArrayList<Animals>()

    for (i in 0..n) {
        animal.add(Animals(AnimalName[i].toString())

        )
    }
    return animal
}