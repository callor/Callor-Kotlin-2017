package com.callor.lession04

/*================================
  클래스의 중첩(Nested Class)
  클래스 내부에 클래스를 정의하여 사용 할 수 있다.
 */
class NestedOuter {
    private var intNum : Int = 1
    var strName = "홍길동"

    class Nested {
        fun nestedMethod() = 2
    }
}

/*================================
  내부 클래스(Inner Class)
 */

class InnerOuter{
    var strName : String = "홍길동"

    // inner 클래스에서는 outer의 맴버에 접근 할 수 있다.
    inner class Inner {
        fun innerMethod() = strName
    }
}

fun main(args : Array<String>) {

    var nestedOuter = NestedOuter()
    println(nestedOuter.strName)

    //---------------------------------
    // Nested Class(중첩클래스)는 경로만 지정하여 직접 생성 할 수 있다.
    var nested = NestedOuter.Nested()
    println(nested.nestedMethod())

    //---------------------------------
    // Inner Class(내부 클래스)는 외부 클래스를 생성한 후 내부 클래스를 생성해야 한다

    var outerInner = InnerOuter()
    var inner = outerInner.Inner() // 대소문자 유의 !!!
    println(inner.innerMethod())

    var inner2 = InnerOuter().Inner() // InnerOuter에 괄호(생성자)가 있음에 유의!!
    println(inner2.innerMethod())




}