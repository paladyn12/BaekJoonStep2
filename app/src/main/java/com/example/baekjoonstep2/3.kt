package com.example.baekjoonstep2

import java.util.*

fun main(Args: Array<String>) = with(Scanner(System.`in`)){
    var year = nextInt()
    if(year%4 == 0){
        if(year%100 == 0){
            if(year%400 == 0) println(1)
            else println(0)
        }
        else println(1)
    }
    else println(0)
}