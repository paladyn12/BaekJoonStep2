package com.example.baekjoonstep2

import java.util.*

fun main(Args: Array<String>) = with(Scanner(System.`in`)){
    var x = nextInt()
    var y = nextInt()
    if(x>0){
        if(y>0) println(1)
        else println(4)
    }
    else{
        if(y>0) println(2)
        else println(3)
    }
}