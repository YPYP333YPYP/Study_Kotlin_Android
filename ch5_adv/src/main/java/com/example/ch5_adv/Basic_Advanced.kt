package com.example.androidlab



// 람다 함수
fun sum1(data1:Int, data2:Int):Int{
    return data1 + data2
}

// 위의 함수를 람다식으로 바꾸면
val sum2 = {data1:Int, data2:Int -> data1+data2 }

// 함수 타입 선언
val some3 : (Int, Int) -> Int = {data1:Int, data2:Int -> data1 + data2}
// 함수 타입을 선언하고 = 연산자 뒤에 함수의 내용을 작성

// 고차 함수
fun highfun(arg:(Int) -> Boolean): () -> String{ // 매개변수도 함수, 반환값도 함수인 함수를 고차함수라고 칭함
    val result = if(arg(10)) {
        "valid"
    }else {
        "invalid"
    }
    return {"Highfun result : $result"}
}

// typealias - 타입 별칭
typealias MyFunType = (Int,Int) -> Boolean



fun main(){
    // 매개변수가 1개인 람다 함수
    val some = {num:Int -> println(num)}
    some(10)

    // 매개변수가 1개인 람다 함수 - it 키워드 사용
    val some2: (Int) -> Unit = {println(it)}
    some2(10)

    // 고차 함수
    val result = highfun { no -> no >0 }
    println(result())

    // 타입 별칭 사용
    val somefun : MyFunType = {no1 : Int, no2:Int -> no1 > no2}

    // 널 안정성 관련 연산자
    var null1 :String? = "Lee" // ? 연산자 - 널 대입 허용
    null1 = null

    var null2:String = "Lee" // ?. 연산자 - 널 안정성 호출
    var null2length = null2?.length

    var null3:String? ="Lee" // ?: 연산자 - 변수가 null 이면 null을 반환
    null3 = null
    println("data= $null3 : ${null3?.length ?: -1}")

}