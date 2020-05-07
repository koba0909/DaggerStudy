package com.testcode.btyisu.ditest.basic

import androidx.annotation.Nullable
import dagger.Component

/**
 * @Component은 참조하는 모든 모듈을 정의해야한다. 안그럼 컴파일시 에러가 발생한다.
 */
@Component(modules = [MyModule::class])
interface MyComponent {
    /**
     * 매개 변수를 갖지 않으면서 반환형은 모듈로부터 제공되거나
     * 주입되는 메서드를 프로비전 메서드라 한다.
     */
    fun getString(): String // 프로비전 메서드, 바인드된 모듈로부터 의존성을 제공

    @Nullable
    fun getInt(): Int?

    fun inject(myClass: MyClass)
}


