package com.example.ch3_base

fun main() {

    val data1 = 10 // val == value의 줄임말 -> 값 변경 불가능
    var data2 = 10 // var == variable의 줄임말 -> 값 변경 가능

    // 초기화 미루기
    lateinit var data3 : String // lateinit 키워드 사용


    val data4 :Int by lazy { // lazy 키워드 사용
        println("In lazy")
        10
    }

    // 코틀린의 모든 변수는 객체임에 주의
    val data5 : Long = 10L
    val data6 : Float = 10.0f

    // Any - 코틀린의 최상의 객체
    val data7 : Any = 10

    // Notthing - null 관련
    val data8 : Nothing? = null
    fun nothingfunc() : Nothing? { // 반환 값이 null인 함수
        return null
    }

    // 문자열 템플릿 사용
    fun printdata() : Unit { // 반환문이 없는 함수의 경우 -> : Unit 사용
        println("data1 : ${data1} ")
        println("data2 : ${data2} ")
        println("data4 : ${data4} ")
        println("data5 : ${data5} ")
        println("data6 : ${data6} ")
        println("data7 : ${data7} ")
    }

    printdata()

    // 함수 생성
    fun mul(data1 : Int, data2 : Int) : Int { // 매개변수의 타입과 반환값의 타입을 반드시 명시
        return data1 * data2
    }

    mul(10,10)

    // Array - 배열 표현
    var data9 : Array<Int> = Array(3, {0}) // 첫번째 매개변수는 배열의 크기를, 두번째 매개변수는 초깃값을 지정
    data9[0] = 10
    data9[1] = 20
    data9.set(2, 30)

    println("Array : ${data9[0]}, ${data9[1]}, ${data9[2]}" )

    var data10 = arrayOf<Int>(10,20,30)
    println("ArrayOf : ${data10[0]} , ${data10[1]}, ${data10[2]}")

    // List
    var list = listOf<Int>(10,20,30)
    println("List : ${list[0]}, ${list[1]}, ${list[2]}")

    // MutableList
    var mutableList = mutableListOf<Int>(10,20,30)
    mutableList.add(3,40)
    mutableList.set(0,50)

    println("MutableList : ${mutableList[0]}, ${mutableList[1]}, ${mutableList[2]} , ${mutableList[3]}")

    var map = mapOf<String, String>(Pair("One","Hello"),"Two" to " World")
    println("Map : ${map.get("One")} , ${map.get("Two")}")


}