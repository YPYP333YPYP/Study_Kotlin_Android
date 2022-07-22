package com.example.ch4_oop

// 클래스의 주생성자
class User1 constructor(name:String, count:Int) { // 주생성자의 constructor는 생략가능
    var name:String
    var count:Int

    // 생성자의 매개변수를 다른 함수에서 사용하는 법
    // 혹은 주 생성자에서 (val name:String, val count:Int) 로도 가능
    init {
        println("init 공간")
        this.name = name
        this.count = count
    }

    fun someFun(){
        println("name : $name, count: $count")
    }
}

// 클래스의 보조 생성자
class User2{
    constructor(name:String){
        println("보조 생성자(String) 호출")
    }

    constructor(name:String, count: Int){
        println("보조 생성자(String, Int) 호출")
    }
}

// 주 생성자와 보조 생성자
// 주 생성자만 단독 사용 가능, 보조 생성자만 단독 사용 가능, 둘다 사용할때에는 반드시 연결
class User3(name:String){
    constructor(name:String, count:Int) : this(name) { // this(name) 부분이 연결 부분

    }
    constructor(name:String, count: Int, email:String) : this(name,count) { // this(name,count) 부분이 연결 부분

    }
}

// 상속
open class ParentClass { // 상속하는 클래스와 멤버변수, 메소드의 경우 open 키워드 사용
    open var someData = 10
    open fun someFun(){
        println("상위 클래스 : $someData")
    }
}

class ChildClass : ParentClass(){ // 상속받은 클래스의 멤버변수나 메소드를 재정의 하는 것을 오버라이드라고 칭함
    override var someData = 20    // 오버라이드 시 반드시 override 키워드 사용
    override fun someFun(){       // 상속 받을 시 반드시 상위 클래스의 생성자를 호출해야함
        println("하위 클래스 : $someData")

    }
}

// 접근 제한자
open class Super() {
    var publicData = 10                 // 하위 클래스 사용가능, 다른 함수에서 사용가능
    protected  var protectedData = 10   // 하위 클래스 사용가능, 다른 함수에서 사용 불가능
    private  var privateData = 10       // 하위 클래스 사용 불가능, 다른 함수에서 사용 불가능
}

// 데이터 클래스
class NonDataClass(val name:String, val email: String, val age:Int) // 일반 클래스
data class DataClass(val name:String, val email: String, val age:Int) // 데이터 클래스

// 오브젝트 클래스
open class Super {

}

val obj = object :Super() {
    var data = 20
    fun some() {
        println(data)
    }
}

// 캠패니언 클래스
class MyClass {
    companion object { // 객체를 생성하지 않고 클래스 이름으로 사용 가능
        var data = 10
        fun some() {
            println(data)
        }
    }
}


fun main(){
    val user1 = User1("Lee", 24)
    val user2 = User2("Lee", 24)

    val user3 = ChildClass()
    user3.someFun()

    // 데이터 클래스
    val non1 = NonDataClass("Lee", "abc@gmail.com", 24)
    val non2 = NonDataClass("Lee", "abc@gmail.com", 24)

    val data1 = DataClass("Lee", "abc@gmail.com", 24)
    val data2 = DataClass("Lee", "abc@gmail.com", 24)

    println(non1.equals(non2)) // false -> 내용은 같지만 주소가 다른 객체이기 때문
    println(data1.equals(data2)) // true -> 주 생성자의 매개변수 내용만 같으면 같은 객체로 취급

    println(non1.toString()) // 주소 -> 객체의 구체적인 주소를 반환
    println(data1.toString()) // 객체가 포함하는 멤버 변수의 데이터를 출력

    // 오브젝트 클래스
    obj.data =30
    obj.some()

    // 컴패니언 클래스
    MyClass.data = 20
    MyClass.some()

}