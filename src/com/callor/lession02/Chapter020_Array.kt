package com.callor.lession02

/*=============================
  Array : 배열형 자료
    Array 클래스로 부터 선언
    get, [] 이 오버로딩(자동으로 생성)
    size 등 여러 맴버변수, method를 사용할 수 있다

 */

// Array<DataTyle> 클래스로 선언하고
//      라이브러리함수 arrayOf()로 초기화 한다.
var myArray : Array<String> = arrayOf("대한민국","우리나라")

// 팩토리 함수로 선언하고 초기화한다.
var myFactoryArray : Array<String> = Array(5,{i -> i.toString()})

// myfactoryArray와 같은 결과
var myArrayOfArray_old : Array<String> = arrayOf("0","1","2","3","4")

/*-------------------------------
  특별한 Array
 */

// 숫자형 배열
var intArray0 : IntArray = intArrayOf(1,2,3)
var intArray1 : Array<Int> = Array(3,{i -> i})
var intArray2 : Array<Int> = arrayOf(1,2,3)

var shortArray : ShortArray = shortArrayOf(1,2,3)
var longArray : LongArray = longArrayOf(1L,2L,3L)
var doubleArray : DoubleArray = doubleArrayOf(1.0,2.0,3.0)

/*-------------------------
   문자열형은 char 배열과 같다
 */

var strName = "Korea"
var charN1 = strName[0]

/*--------------------------
  문자열 리터럴
 */

// 전통적인 문자열이다
var escString : String = "우리는 민족중흥의\n" +
        "역사적 사명을 띄고 이땅에 태어났다\n" +
        "조상의 빛난 얼을 오늘에 되살려"

// escape 없는 문자열
var rawString = """
    우리는 민족중흥의
    역사적 사명을 띄고 이땅에 태어났다
    조상의 빛난 얼을 오늘에 되살려
    """

var escPath = "C:\\temp\\mydata.txt" // 특수문자를 표현하기 위해 역슬래시를 사용해야 한다
var rawPath = """C:\temp\mydata.txt""" // 모든 문자를 있는 그대로 취급한다.

fun main(argv : Array<String>){

    // 배열에 접근하기
    println("myArray.get(0): ${myArray.get(0)}")     // 0 번째 위치 값 추출 >> 대한민국
    println("myArray[0]: ${myArray[0]}")

    myArray[1] = "Korea"        // 값 재 할당

    println("toString: ${myArray.toString()}")
    println("size: ${myArray.size}")       // 배열의 크기

    // 문자열에 접근하기
    println("strName[3]: ${strName[3]}")       // 문자열의 일부문자에 접근
    println("strName.get(3): ${strName.get(3)}")   // get 메서드를 통해 접근
    println("strName.length, 문자열길이: ${strName.length}")   // 문자열은 size 가 아니고 length 이다

    // 문자열 리터럴 연습
    println("escape String: ${escString}")
    println("raw String ${rawString}")

}

