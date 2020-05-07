package com.testcode.btyisu.ditest.basic

import javax.inject.Inject


/**
 * 멤버-인젝션 메서드 구현
 *
 * 컴포넌트에서는 하나의 매개 변수를 갖는 메서드를 멤버-인젝션 메서드라고 칭한다.
 *
 * 멤버-인젝션 메서드는 void를 반환하거나 빌더 패턴처럼 메서드 체이닝이 가능한 메서드를
 * 만들기 위해 매개 변수 타입을 반환형으로 갖는 메서드로 선언할 수 있다.
 */
class MyClass{
    @Inject
    lateinit var str: String
}