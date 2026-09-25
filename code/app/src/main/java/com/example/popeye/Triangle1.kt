package com.example.popeye

class Triangle1(x: Int, y: Int, val sides: Int = 3) : Shape(x, y){
    fun getSides(): Int {return sides}
}