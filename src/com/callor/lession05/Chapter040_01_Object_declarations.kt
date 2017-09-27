package com.callor.lession05

/*==================================
  Object Declarations(객체 선언)

    싱글톤 패턴의 객체 생성
        object 키워드로 시작
        객체 이름 지정

    object expressions와는 사용법이 다르다
        할당식으로 사용할 수 없다.( = 오른쪽에 사용 불가 )

        object expressions : object {}              >> 이름이 없다
        object declarations : object objectName {}  >> 이름이 있다

    다른 객체로 부터 상속 받을 수 있다.

 */

object MyObject {  }            // object 선언
object MyObject1 : Any() { }    // object 선언과 상속

object CountManager {
    var count = 0
}

fun main(args : Array<String>) {
    // var countManager = CountManager()  // 사용불가
    println(CountManager.count)   // 이미 생성된 객체에 접근하는 것과 같다, static, 싱글톤 객체

}