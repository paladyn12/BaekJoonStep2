package com.example.baekjoonstep2

import java.util.*

fun main(Args: Array<String>) = with(Scanner(System.`in`)){
    var A = nextInt()
    var B = nextInt()
    if (A>B) println(">")
    else if (A<B) println("<")
    else println("==")
}