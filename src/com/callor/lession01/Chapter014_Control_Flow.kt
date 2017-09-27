package com.callor.lession01

import java.lang.Integer.parseInt
import java.lang.Long.parseLong

fun main(arg : Array<String>){


    /*==========================
      Kotlin if else 구문
     */

    var num1 = 10
    var num2 = 200
    var max1 = num1

    if(num1 < num2 ) max1 = num2 // 두 값을 비교하여 큰값을 max에 할당, 최대값 찾기중 일부

    var max2 : Int
    if(num1 > num2  ) {
        max2 = num1
    }else{
        max2 = num2
    }

    /*-----------------------
       Kotlin 방식 if else 구문

     */
    // 1. if를 식(inline statement)로 사용, 3항 연산자와 유사함
    var max3 = if(num1 > num2 ) num1 else num2

    //    2. return 문이 없는 리턴
    var max4 = if(num1 > num2 ) {
        println("num1 > num2")
        num1    // return num1과 같음
    } else {

        println("num1 > num2")
        num2    // return num2와 같음
    }


    /*==============================
      switch 문 대신에 사용하는 when
     */

    // x값을 순차적으로 비교 하고 없으면 else 다음 구문 실행

    var sq : Int = 4
    when(sq) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("Not found")
        }
    }

    var strSq = "Korea"
    when(strSq) {
        "USA" -> println("미국")
        "Korea" -> println("대한민국")  // 일치하는 값을 찾으면 더이상 진행하지 않는다, break 불필요
        "china" -> println("중국")
    }

    // 다른 변수에 할당 할 수도 있다
    var strRes = when(strSq) {
        "USA" -> "미국"
        "Korea" -> "대한민국"  // 일치하는 값을 찾으면 더이상 진행하지 않는다, break 불필요
        "china" -> "중국"
        else -> "몰라"         // 식으로 사용된 경우 else 문이 반드시 있어야 한다. 예외 상황 배제원칙
    }
    println(strRes)

    // 다음의 경우는 예외 상황이 발생할 수 없다
    //      oxVar의 값은 true, false 이외의 값이 절대 올수 없다는 것이 명백하므로
    //      이경우 else 문이 없어도 된다
    var oxVar = true
    println(when(oxVar){
        true -> "맞아요"
        false -> "틀려요"
    })

    // 여러조건을 공통으로 사용할때
    var sq1 : Int = 3
    when(sq1) {
        1,2,3 -> println("x == 1 이거나 2이거나 3")
        4 -> println("x == 4")
        5 -> println("x == 5")
        else -> {
            println("Not found")
        }
    }

    // 조건문에 함수나 식을 사용할 수 있다
    when(sq1) {
        sq1.toInt() -> println("s encodes x")
        1 + 3  -> println(4)
        else -> println("s does not encode x")
    }

    var myNum = intArrayOf(1,2,3,4,5,6,6,7,8,9)
    var getNum = 3
    when(getNum) {
        in myNum -> println("myNum 배열에 있음!")
        in 1..10 -> println("값이 1부터 10 사이에 있음")
        !in 20..30 -> println("값이 20부터 30 사이에 없음") // not
        else -> println("알수 없음")
    }

    // smart cast 후 값 사용
    var xVal : Any = "Republic of Korea"
    var yesno = when(xVal) {
        is String -> xVal.endsWith("Korea") // 끝에 일치하는 문자열 검사
        is String -> xVal.startsWith("Korea") // 시작에 일치하는 문자열 검사
        else -> false
    }
    println("${xVal}에 Korea가 포함 ${if(yesno) "되었음" else "안 되었음" }")

    /*---------------------------
      if를 대치한 논리연산
         인자를 사용하지 않으면 논리연산으로 처리
     */

    var x1 = "A"
    when{
        x1.equals("A") -> println("Yes A")
        x1.equals("B") -> println("Yes B")
        else->println("Not found")

    }



}