package com.testcode.btyisu.ditest.injection

import dagger.Component

/**
 *
 */
@Component(modules = [PersonA::class])
interface PersonComponent {

    fun getPersonA(): PersonA   // 프로비전 메서드

    fun inject(personB: PersonB)    // 멤버-인젝션 메서드
}