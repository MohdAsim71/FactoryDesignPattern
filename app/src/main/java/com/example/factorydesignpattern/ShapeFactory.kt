package com.example.factorydesignpattern

class ShapeFactory {
    fun getShape(s:String): Shape? {
        return when(s){
            "box"->Box()
            "circle"->Circle()
            else->null
        }
    }
}