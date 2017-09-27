package com.callor.lession05

/*=================================
  Companion Object
     Java의 static class와 유사하다
     바디에 companion object 키워드를 작성한다.
     Class.Companion 으로 접근한다.
 */

class CompanionObjectName {
    companion object ObjectName {  // ObjectName은 사용하지 않아도 된다.
        var name = "CompanionObjectName"
    }
}


class CompanionObject {
    companion object {  // ObjectName은 사용하지 않아도 된다.
        var name = "CompanionObject"
    }
}


class CompanionObjectMethod {
    companion object ObjectName {  // ObjectName은 사용하지 않아도 된다.
        fun create() : CompanionObject = CompanionObject()
        fun name() = "CompanionObjectMethod"
    }
}

fun main(args : Array<String>) {
    var obj = CompanionObjectName
    println(CompanionObjectName.name)

    var obj1 = CompanionObject.name
    println(obj1)

    var obj2 = CompanionObjectMethod
    println(CompanionObjectMethod.name())

    var obj3 = CompanionObjectMethod.name()
    println(obj3)


}