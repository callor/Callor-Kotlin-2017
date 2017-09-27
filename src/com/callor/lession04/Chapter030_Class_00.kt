package com.callor.lession04

/*==================================
  클래스 생성

 */
/*----------------------------------
  기본 클래스 생성

class >> 클래스 생성 키워드
      MyClass01 >> 클래스 이름
            (data : int ) >> 헤더(형식 매개변수, 기본생성자
                       {} >> 클래스 바디
*/
class MyClass01(data : Int) {}

// 헤더와 바디를 생략할 수 있다.
class MyClass02

/*-------------------------------
  기본 생성자
    기본 생성자는 constructor 키워드를
    사용하여 헤더에 지정한다.

    클래스에 1개만 가질 수 있다.
 */

class Person01 constructor(firstName : String) {   }

// 어노테이션이나 접근지정자가 없으면 constructor 키워드를 생략할 수 있다
class Person02 (firstName : String) {  }

// 접근자가 있으면 constructor를 생략해서는 안된다
class Person03 public constructor(firstName : String) {  }

/*------------------------------
  기본 생성자의 코드는 init 블럭에 작성한다.
 */
class Customer(name : String) {
    // 기본 생성자 코드
    init {
        println("이름: $name")
    }
}

/*-------------------------------
  property 생성
 */
class PropertyClass() {
    var fullName : String = ""
        get(){ return field}
        set(value) { field = value }
}

// 기본생성자 없는 보조생성자
class SubConstruct {
    constructor(parent: SubConstruct) {
        println("보조생성자")
    }
}

//--------------------------------------------------------
// 기본생성자가 있는 보조 생성자
// 기본생성자가 있는 경우 보조 생성자에서 this를 호출해주어야 한다
class SubConstruct01 ( fullname : String ) {
    constructor(parent : SubConstruct01) : this("홍길동")
}

// 2번생성자에서 1번 생성자를 호출하고, 1번생성자에서 기본 생성자를 호출한다.
class SubConstruct02( fullname : String) {
    // 1번 보조 생성자
    constructor(firstName : String, parent: SubConstruct02) : this(firstName + "길동") {

    }
    // 2번 보조 생성자
    constructor() : this("김")
}

// 매개변수가 없는 생성자
class MyClass03 private constructor() {   }


fun main(argv : Array<String>) {

    var myClass01 = MyClass01(20)
    var myClass02 = MyClass02()

    var person01 = Person01("김")
    var person02 = Person02("김")

    var customer = Customer("홍길동")

    var propertyClass = PropertyClass()
    propertyClass.fullName = "홍길동"
    println(propertyClass.fullName)

}
