package com.testcode.btyisu.ditest

import dagger.Module
import dagger.Provides

/**
 * @Module은 의존성을 제공하는 클래스에 붙인다.
 */
@Module
class MyModule {
    @Provides
    fun provideString(): String{
        return "di test!!!"
    }
}