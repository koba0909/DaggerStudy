package com.testcode.btyisu.ditest

import dagger.Component
import dagger.Provides

/**
 * @Component은 참조하는 모든 모듈을 정의해야한다. 안그럼 컴파일시 에러가 발생한다.
 */
@Component(modules = [MyModule::class])
interface MyComponent {
    fun getString(): String // 프로비전 메서드, 바인드된 모듈로부터 의존성을 제공
}

