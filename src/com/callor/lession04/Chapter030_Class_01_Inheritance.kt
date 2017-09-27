package com.callor.lession04

/*=============================
  클래스 상속
    모든 클래스의 최 상위 클래스는 Any가 된다

    kotrlin의 모든 클래스는 final 이다. 즉, 상속 불가 클래스이다
    상속을 해 주려면 open 키워드를 선행해주어야 한다.

    클래스의 메서드는 모두 private 이다
    오버라이딩 하려면 open 키워드를 선행해야 한다.
    오버라이딩을 할때는 override 키워드로 시작해야 한다.

 */
class MyClassInHeri01 {}  // 암시적이지만 Any 클래스를 상속하고 있다.
class MyClassInHeri02 : Any() {}  // 명시적 Any 클래스를 상속

//-----------------------------
// 상속을 허용하려면 open 키워드로 시작해야 한다.
open class ParentClass(fullName : String) {}
class ChildClass : ParentClass("홍길동") {}  // 상속을 할때 기본생성자를 호출해주어야 한다.

/*----------------------------
  상속받은 클래스에 기본생성자가 없이 보조 생성자만 있을 경우
    보조 생성자에서 super() 메서드를 호출해 주어야 한다.
 */

class SunClass : ParentClass {
    constructor() : super("이몽룡")
}

/*----------------------------
    함수 override
        오버라이딩을 허용하기 위해 open 키워드
        받는 쪽에서는 override 키워드
 */

open class ParentMethod() {
    open fun test() {  }
}

class ChildMethod : ParentMethod() {
    override fun test() { println("반갑습니다")}
}

fun main(args : Array<String>) {
    var childClass = ChildClass()
}