package com.eru.testingapp

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test


class MathTest {

    var math: Math? = null


    @Before
    fun install(){
        math = Math()
    }

    @Test
    fun simpleAddCase(){
        assertEquals("4", math?.add("2", "2"))
    }

    @Test
    fun emptyAddCase(){
        assertEquals("Вы не заполнили поля", math?.add("2", ""))
    }

    @Test
    fun letterAddCase(){
        assertEquals("Буквы не складываются", math?.add("2", "2в"))
    }

    @Test
    fun dotAddCase(){
        assertEquals("4.0", math?.add("2.0", "2.0"))
    }

    @Test
    fun negativeAddCase(){
        assertEquals("Нельзя отрицательные закидывать", math?.add("2", "-2"))
    }

    @After
    fun detach(){
        math = null
    }
}

