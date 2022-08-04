package com.example.baekjoonstep2

import java.util.*

fun main(Args: Array<String>) = with(Scanner(System.`in`)){
    var H = nextInt()
    var M = nextInt()
    var cooking = nextInt()
    M += cooking
    H += M/60
    M %= 60
    if(H>=24)
        H %= 24
    println("$H $M")
}