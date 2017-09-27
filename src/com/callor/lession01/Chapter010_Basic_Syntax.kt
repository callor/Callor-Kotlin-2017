//=========================================
// 코틀린 기본 문법 설명
//-----------------------------------------


// kotlin의 한줄 주석

/*
    kotlin의 여러줄 주석
    2017-09-26

 */


/*

패키지는 문서의 시작에 위치한다
패키지는 일반적으로 디렉토리와 같이 사용하지만
특별히 일치하지 않아도 된다.


*/
package com.callor.lession01

import java.util.* // 필요한 외부 라이브러리를 import 한다.

/*--------------------------------

  Kotlin의 변수는 var로 시작하고 자료형 지정이 뒤에 따라온다

  var로 시작
  콜론(:) 변수형
  equal(=) 초기값

  변수선언과 동시에 초기화를 해주어야 한다.

 */
var num1: Int = 3
var num2: Int = 4
var num3: Int = 5

// 자료형을 생략 할 수 있다

var name1 = "홍길동"
var name2 = "이몽룡"
var name3 = "장영실"



/*----------------------------------

  kotlin의 자료형

  Int : 정수형
  Float : 실수형
  String : 문자열형
  Bloolean : 블린형

  Any : 모든것

 */

// Any 형은 어떤 자료형이라도 올수 있다.
// 변수의 자동 형변환, main 함수 내부 참조
var obj : Any = "대한민국"


// 변수에 null 값을 할당하려면 자료형? 형식이어야 한다
var nullVar: String? = null


/*-----------------------------------

  final 변수는 val 로 시작하고 변수 선언과 동일하다.

  val로 시작
  콜론(:) 변수형 >> : Int
  equal(=) 초기값

  ※ val로 선언된 final 변수는 반드시 초기화를 같이 해야 한다.

 */

val valNum1 = 3
val valNum2: Int = 3
// val valNum3  // 초기값이 없으면 컴파일 오류가 난다.


/*--------------------------------
  main은 진입점 함수 이다.
  class, file에 반드시 main() 함수가 있어야만 run(실행)을 할 수 있다

*/
fun main(argv: Array<String>) {

    println("안녕하세요")  // 콘솔에 메시지 표시, Enter 포함
    print("우리나라만세")  // 콘솔에 메시지 표시, Enter 없음

    println() // 빈줄


    var nation : String? = null
    println(nation) // null 출력

    nation = "대한민국"
    println(nation)


    var nation1 = null
    println(nation1 is String) // nation1이 String 형이냐?


    // Any로 선언된 변수는 is 키워드로 변수형을 검사하는 순간 자동으로 형변환이 일어난다.
    println( "obj 변수는 문자열형? : ${obj is String}" )
    println("obj 변수는 정수형? : ${obj is Int}, $obj" )


}



