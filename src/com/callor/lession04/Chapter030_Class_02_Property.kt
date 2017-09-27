package com.callor.lession04

/*==================================
  kotlin은 Properties와 Field
    1. kotlin은 기본적으로 Properties를 지원한다
 */

/*----------------------------------
  Properties 선언
 */

// 기본 문법
// getter와 setter를 생성하여 내부 Properties에 접근한다.
class Phone  {
    val name : String = "홍길동"
        get() { return "너의 이름은 $field" }  // 'field'(Backing Field라 한다) identity 키워드로 접근한다.
        // set(value) { field = value } // val은 Read Only 이기 때문에 set을 정의 할 수 없다.
    var phone : String = ""
        get() { return field}
        set(value) {
            if(!value.startsWith("0")) {
                println("전화번호는 0으로 시작해야 합니다")
                return
            }
            field = value   // field identity 키워드로 접근한다.
        }

    // 자료형이 명확한 경우 자료형 지정자를 생략할 수 있다
    var isFamily = true
        get() = true
        set(value) {field = value}

    // Properties에 접근 제한자를 둘 수 있다.
    var  setterVisible = "Not Visible"
        private set     // set 자체를 사용할 수 없도록 선언, 보통 val 로 선언하는 것이 편리
        get() { return field }

}

// 간소화한 선언
// 내부적으로 getter와 setter가 자동으로 생성된다.
class Address {
    var name : String = "홍길동"       // mutable
    val city : String = "광주광역시"   // Read only
}

fun main(args : Array<String>) {

    val phone = Phone()
    // phone.name = "홍길동" // name은 Read only 이므로 값을 할당 할 수 없다
    phone.phone = "1112"    // 내부적으로 setter가 먼저 받아 작동한다.
    println(phone.name)
    println(phone.phone)


    var address = Address()
    println(address.name)
    println(address.city)

}
