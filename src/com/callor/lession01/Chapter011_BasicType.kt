package com.callor.lession01

/*=======================================

  Kotlin의 자료형
     kotlin의 모든 자료형은 객체다
     자료형을 지시하는 keywoard는 모두 대문자로 시작한다.

 */

/*---------------------------------------

  Number : 정수와 실수

 */

var doubleNumber: Double = 0.0  // 64 Bit
var floatNumber: Float = 0f     // 32 Bit
var longNumber: Long = 0       // 64 Bit
var intNumber: Int = 0         // 32 Bit  ** Integer가 아니며, 첫글자는 대문자이다
var shortNumber: Short = 0     // 16 Bit
var byteNumber: Byte = 0       // 8 Bit


/*--------------------------------------

  리터럴(Literal)

 */

var longNum: Long = 123L           // Long 형
var doubleNum: Double = 123.5e19   // double 형
var floatNum: Float = 123f         // Float형

//  진수 표현
var intNum: Int = 123              // 10 진수
var shortNum: Short = 123          // 10 진수

var binNum: Int = 0b1001           // 2진수
var octNum: Int = 0                // 8진수는 지원하지 않는다
var hexNum: Int = 0xF0             // 16진수


/*---------------------------------------

  (_) underScore 숫자 표현
  ※ Kotlin 1.1 부터 지원

 */


var oneMillion = 1_000_000
var creditCardNum = 1234_5678_9012_3456L  // Long 형
var hexByte = 0xFF_EC_DE_5E               // 16진수 표현
var binByte: Long = 0b0110_0011_1001_0101_0001_0001


/*----------------------------

  숫자 변수의 형변환
    각 변수형 간에 암시적 형변환이 안된다
    반드시 강제 형변환을 해 주어야 한다.

 */

var intA : Int = 1
// var longA = intA >> 컴파일 오류
var longA : Long = intA.toLong() // 강제 형변환을 해주어야 한다



/*-------------------------------
  Char 자료형
    Kotlin]의 Char는 숫자형이 아닌 문자형이다

 */

var charA : Char = 'A'
var charB = 'B'

// 문자형을 숫자형 변수에 할당하려면 ascii 코드로 변환 시켜줘야 한다.
var ascA : Int = charA.toInt()
var ascB : Int = charB.toInt()


//컴파일 타임 상수 지정
// java static 키워드와 같은 역할

const val THIS_APP_NAME = "코틀린 정복하기"

fun main(argv: Array<String>) {

    print(THIS_APP_NAME)

    /*----------------------------------------
    identity (객체 비교 )
    */

    var idNum1: Int = 1000
    var idNum2: Int = 1000


    println("idNum1 = $idNum1")
    println("idNum2 = $idNum2")

    // 두 변수에 저장된 값이 같은가
    println("두 값이 같은가?, idNum1 == idNum2 : ${idNum1 == idNum2}")

    // 같은 객체인가?( 주소 비교 )
    println("같은 객체인가?, idNum1 === idNum2 : ${idNum1 === idNum2}")

}

