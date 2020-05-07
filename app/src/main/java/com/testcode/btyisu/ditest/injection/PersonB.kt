package com.testcode.btyisu.ditest.injection

import javax.inject.Inject

data class PersonB @Inject constructor(

    var name: String?,


    var age: Int?
)