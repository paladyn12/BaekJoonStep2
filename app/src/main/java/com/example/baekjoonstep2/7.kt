package com.example.baekjoonstep2

import java.util.*

fun main(Args: Array<String>) = with(Scanner(System.`in`)){
    var A = nextInt()
    var B = nextInt()
    var C = nextInt()
    var num : Int
    var calCase : Int
    var result : Int
    if(A==B && B==C){
        num = A
        calCase = 3
    }
    else{
        num = findSameNum(A, B, C)
        if(num!=0)
            calCase = 2
        else calCase = 1
    }
    if(calCase == 3)
        result = 10000+num*1000
    else if (calCase == 2)
        result = 1000+num*100
    else{
        if(A>B && A>C) num = A
        else if(B>C) num = B
        else num = C
        result = num*100
    }
    println(result)
}

fun findSameNum(A : Int, B : Int, C : Int) : Int{
    var num : Int
    if(A==B) num = A
    else if(B==C) num = B
    else if(C==A) num = C
    else num = 0
    return num
}