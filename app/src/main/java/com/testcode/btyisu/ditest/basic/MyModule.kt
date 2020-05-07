package com.testcode.btyisu.ditest.basic

import androidx.annotation.Nullable
import dagger.Module
import dagger.Provides

/**
 * 모듈은 컴포넌트에 의존성을 제공하는 역할을 한다.
 * @Module을 붙이는 것으로 모듈 클래스를 만들면 된다.
 */
@Module
class MyModule {
    /**
     * @Provides을 붙이면 컴파일 타임에 의존성을 제공하는 바인드된 프로바이더를 생성한다.
     * 메서드의 반환형을 보고 컴포넌트 내에서 의존성이 관리되어 중복되는 타입이 하나의
     * 컴포넌트 내에 존재하면 안된다.
     *
     * 모듈 클래스가 추상 클래스인 경우 @Provides를 붙인 메소드는 static 메소드여야만 한다.
     */
    @Provides
    fun provideString(): String{
        return "di test!!!"
    }

    /**
     * null을 반환하는것은 허용되지 않으며, 명시적으로 허용하려면 @Nullable을 추가해야 한다.
     * @Provides에  @Nullable을 붙였다면 의존성을 주입받는 곳에서도 @Nullable을 붙여야한다.
     */
    @Provides
    @Nullable
    fun provideInt(): Int?{
        return null
    }
}