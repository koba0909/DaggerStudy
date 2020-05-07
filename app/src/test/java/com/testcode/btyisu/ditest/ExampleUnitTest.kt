package com.testcode.btyisu.ditest

import com.testcode.btyisu.ditest.basic.MyClass
import com.testcode.btyisu.ditest.basic.MyComponent
import com.testcode.btyisu.ditest.injection.PersonB
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun daggerTest(){
        var component: MyComponent = DaggerMyComponent.create()
        println(component.getString())
    }

    @Test
    fun memberInjection(){
        val myClass = MyClass()

        DaggerMyComponent.create()
            .inject(myClass)

        val str = myClass.str

        assertNotNull(str)

        println("after inject str : $str")
    }

    @Test
    fun injection(){
        val personComponent = DaggerPersonComponent.create()

        val personA = personComponent.getPersonA()
        println("name : ${personA.name}, age : ${personA.age}")

        val personB = PersonB(null, null)
        DaggerPersonComponent.create()
            .inject(personB)

        println("name : ${personB.name}, age : ${personB.age}")

    }
}
