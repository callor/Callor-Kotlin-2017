package com.callor.lession03

/*--------------------------------------
    함수의 정의, fun 키워드로 시작한다.
        funcName : 함수이름
        argv : 매개변수(:Int는 매개변수의 자료형)
        : Int는 리턴 자료형을 나타낸다
*/
fun funcName(argv: Int) : Int { return 0 }


// 리턴 값 Unit은 void 형 리턴값이다
// Unit은 생략할 수 있다
fun funcName(argv : Float) : Unit {}
fun funcName(argv : String) {}

// 두 정수를 받아 더한 후 리턴하는 함수 정의
fun funcName(num1 : Int, num2 : Int) : Int {
    return num1 + num2
}

fun funcName(str1 : String, str2 : String) : String {

    /*--------------------------
      val : 상수 선언 keyword
      자료형 정의  >> 콜론(:) 자료형
      상수를 초기화(값을 할당)할 경우, 자료형이 명확하면 자료형 지정을 생략할 수 있다.
      상수는 선언과 초기화를 반드시 동시에 수행해야 한다.

     */
    val name1 = "홍길동"
    val nation1 :String = "대한민국"

    /*---------------------------
      var : 변수 선언 keywoard
      자료형정의 >> 콜론(:) 자료형
      변수를 초기화(값을 할당0할 경우, 자료형이 명확하면 자료형 지정을 생략할 수 있다
     */
    var message : String = ""
    message = name1 + nation1 + str1 + str2

    println(message)
    return message


}

/*---------------------
   문자열 보간법
 */
fun funString(str1 : String) : String {

    // 문자열 내부에서 $변수 를 사용하여 문자열 포맷을 생성할 수 있다.
    return "우리나라는 $str1 입니다"

}

fun funString(str1 : String, str2 : String) : String {

    // 문자열 내부에서 메서드를 직접 호출하는 것도 가능하다.
    val str = "내이름은 무엇인가요, ${str1.replace("Korea" ,"대한민국")}, $str1, $str2"
    return str

}

// 가장단순한 리턴일 경우 {} , return을 생략할 수 있다.
fun oneReturn(num1 : Int, num2 : Int) = num1 + num2

// 위 함수와 똑같은 기능
fun oneReturn_old(num1 : Int, num2 : Int) : Int {
    return num1 + num2
}


// null을 리턴하는 함수는 리턴 자료형에 반드시 물음표(?)를 붙여줘야 한다.
fun nullReturn() : Int? {
    return null
}



/*----------------------------
  main 함수는 클래스의 진입점 함수이다

 */
fun main(args : Array<String>) {
    funcName("우리나라", "대한민국")

    println(funString("대한민국"))
    println(funString("Republic of Korea", "이몽룡"))
}

