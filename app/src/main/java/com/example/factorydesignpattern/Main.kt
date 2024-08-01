package com.example.factorydesignpattern

/*
*Design pattern
1:- Factory Design Pattern
It belongs to the creational patterns category.
This pattern is particularly useful for creating objects in a systematic and controlled way

2:-Why Use the Factory Pattern?
In large codebases, creating objects based on specific conditions can lead to code duplication and maintenance challenges.
The Factory Pattern centralizes this object creation logic in one place, making the code cleaner and easier to manage.

* */

fun main() {
val shapeFactory = ShapeFactory()
    val box = shapeFactory.getShape("box")
    box?.draw()

    val circle = shapeFactory.getShape("circle")
    circle?.draw()
}