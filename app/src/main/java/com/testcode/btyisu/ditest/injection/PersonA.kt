package com.testcode.btyisu.ditest.injection

import javax.inject.Inject

data class PersonA @Inject constructor(
    var name: String,

    var age: Int
)