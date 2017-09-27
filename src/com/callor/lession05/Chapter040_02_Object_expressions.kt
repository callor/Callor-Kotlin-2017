package com.callor.lession05

/*====================================
  Object Expressions
     익명 객체라고 한다.
        어떤 class에서 약간의 변경이 아루어진 객체를 생성할때
        새로운 subclass의 명시적 선언 없이 객체를 생성할 수 있다

  Object Declarations
      싱글턴 객체

  Companion Object

 */

class MyRunnable : Runnable {
    override fun run() {
        println("Runnable Class : 안녕하세요")
    }
}

fun main(args : Array<String>) {

    //------------------------------------------
    // Thread를 실행하기 위해
    // Runnable interface를 implement하고
    // run 매서드를 구현해주었다
    var myRunnable = Thread(MyRunnable())
    myRunnable.run()

    //=========================================
    // java에서 사용하던 익명 내부 클래스를
    // Object Expressions를 이용하여 처리
    //      object key word로 시작하는 클래스 지정
    //      object : Class
    var thread = Thread( object : Runnable {
        override fun run() {
            println("Inner Class : 안녕하세요")
        }
    })
    thread.run()

    //----------------------------------------
    var myobject = object : Runnable {
        override fun run(){
            println("변수에 담긴 object express")
        }
    }
    var varThread = Thread(myobject)
    varThread.run()

    //-------------------------------------------
    // 람다식으로 표현
    var lambdaThread = Thread(Runnable { println("Lambda : Runnable")})
    lambdaThread.run()


    /*============================================
      클래스 없는 객체의 사용
     */

    var superObject = object {
        var name = "홍길동"
        var addr = "광주광역시"
    }
    println("${superObject.name} ${superObject.addr}")

    superObject.name = "이몽룡"
    superObject.addr = "서울특별시"
    println("${superObject.name} ${superObject.addr}")



}