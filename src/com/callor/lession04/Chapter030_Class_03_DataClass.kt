package com.callor.lession04

/*====================================
  Data 클래스
    일반적으로 VO 클래스에 해당

    Data에 엑세스할때 필요한 method를 자동 생성한다
        equals()
        hashCode()
        copy()
        toString()
        componentN()

    기본생성자에 1개 이상의 파라메터를 작성한다.
    Data 클래스는 abstract, open, inner 할 수 없다

    1.1 이후 interface 구현할수 있다.

 */

// 기본 생성
data class UserVO(var name : String, var age : Int)


// 객체를 생성할때 빈생성자(super 생성자)를 사용하고자 할때는 파라메터를 초기화 하라
data class PhoneVO(var name : String = "홍길동", var phoneNum : String = "001")


fun main(args : Array<String>) {
    var userVO = UserVO("홍길동", 12)
    userVO.name = "이몽룡"
    println(userVO.name)
    println(userVO.toString()) // toString() 함수를 자동으로 생성한다
                               // UserVO(name=이몽룡, age=12)


    // 자동 생성되는 method
    var phoneVO = PhoneVO()
    println(phoneVO.toString()) // PhoneVO(name=홍길동, phoneNum=001)
    println(phoneVO.hashCode())
    println(phoneVO.equals(PhoneVO())) // 내가 PhoneVO 클래스의 객체인가?
    println(phoneVO.name)

    // 생성과 동시에 맴버, method 호출가능
    println(PhoneVO("장영실").toString())
    println(PhoneVO(phoneNum = "0003").toString())

    // 기존 객체의 값을 유지하면서 일부만 다른 새로운 객체를 생성할 수 있다.
    var phoneVO_1 = phoneVO.copy(phoneNum = "0003")
    println(phoneVO_1.toString())

    println("phoneVO.name == phoneVO1.name ? : ${phoneVO.name == phoneVO_1.name}")
    println("phoneVO === phoneVO1 ? : ${phoneVO === phoneVO_1}")


    /*--------------------------------
     Destructuring(식의 분해) 생성
        Data 클래스는 componentN() 메서드를 자동생성하는데 이 메서드에 의해
        각 data item을 분해하여 변수로 받을 수 있다.
      */
    var (name,phoneNum) = PhoneVO("성춘향", "009-001")
    println("이름 : $name, 전화번호 : $phoneNum")


    // 2 또는 3개의 item을 갖는 data의 경우
    // kotrlin에서 제동하는 기본 클래스를 사용할 수 있다
    var pair = Pair("대한민국",1919)
    println(pair.toString())

    // 자료형에 제한이 없다
    println(Pair("홍길동","0001").toString())

    var triple = Triple("대한민국",1919,2017)
    println(triple.toString())


}


