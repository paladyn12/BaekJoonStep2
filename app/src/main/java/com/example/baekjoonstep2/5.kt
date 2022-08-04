package com.example.baekjoonstep2

import java.util.*

fun main(Args: Array<String>) = with(Scanner(System.`in`)){
    var H = nextInt()
    var M = nextInt()
    if(M>=45)
        M-=45
    else{
        if(H>=1){
            H-=1
            M+=15
        }
        else{
            H=23
            M+=15
        }
    }
    println("$H $M")
}