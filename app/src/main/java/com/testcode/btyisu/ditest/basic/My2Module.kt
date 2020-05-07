package com.testcode.btyisu.ditest.basic

import dagger.Module

/**
 * 모듈간 상속을 해야하는 경우 include 속성을 이용한다.
 * 컴포넌트를 선언 할때 해당 모듈을 참조하는 경우 MyModule를 상속하여 객체가 바인딩된다.
 *
 * 주의할 점은 모듈 간 상속을 할 때 중복되는 타입이 존재하면 안된다.
 */
@Module(includes = [MyModule::class])
class My2Module {

}