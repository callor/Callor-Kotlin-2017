package com.callor.lession01

import com.callor.lession02.myArray

/*=======================
  for 문을 이용한 반복
 */

fun main(argv : Array<String>) {


    /*--------------------------------
       iterator를 제공하는 모든것들을 반복 할 수 있다.
            대표적으로 Array
     */
    var myList = listOf<Int>(1,2,3,4,5,6,7,8)
    for( i in myList) {
        print(i)
    }
    println()

    var myStrings : Array<String> = Array(20,{i->i.toString()})
    for( i in myArray) {
        print(i)
    }
    println()

    var myNumbers : Array<Int> = Array(100,{i->i+1})
    var sum : Int = 0
    for( i in myNumbers) {
        sum += i
    }
    println(sum)


    // index를 사용하고자 할때 indices 맴버 변수사용
    for( i in myNumbers.indices) {
        println("index : $i")
    }
    println()

    // index와 value를 동시에 사용할때 withindex() 메서드 사용
    for((index,value) in myNumbers.withIndex()) {
        println("index = $index, value = $value")
    }



}