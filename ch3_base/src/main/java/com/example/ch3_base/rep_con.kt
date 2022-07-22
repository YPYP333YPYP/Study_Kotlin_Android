package com.example.ch3_base

fun main() {
    // if else 문을 표현식으로 작성 가능
    var data1 = 10
    val result = if ( data1 > 0) {
        println("data > 0")
        true
    } else {
        println("data < 0")
        false
    }
    println(result)

    // 조건문 when
    var data2 = 10
    when(data2){
        10 -> println("data is 10")
        20 -> println("data is 20")
        else -> {
            println("data is not valid data")
        }
    }

    // when 문을 표현식으로 사용
    var data3 = 10
    val result2 = when {
        data3 <= 0 -> "data is <= 0"
        data3 > 100 -> "data is > 100"
        else -> "data is valid"
    }
    println(result2)

    // for문
    var sum : Int = 0
    for ( i in 1..10) {
        sum += i
    }
    println(sum)

    // while문
    var x = 0
    var sum1 = 0
    while(x < 10) {
        sum1 += ++x
    }
    println(sum1)


}