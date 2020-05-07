package com.testcode.btyisu.ditest.injection

import dagger.Module
import dagger.Provides

@Module
class PersonModule {
    @Provides
    fun provideName(): String?{
        return "koba"
    }

    @Provides
    fun provideAge(): Int?{
        return 20
    }
}