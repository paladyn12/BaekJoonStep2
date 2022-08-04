package com.example.baekjoonstep2

import java.util.*

fun main(Args: Array<String>) = with(Scanner(System.`in`)){
    var score = nextInt()
    when(score){
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        in 60..69 -> println("D")
        else -> println("F")
    }
}