package com.eru.testingapp

import java.lang.NumberFormatException

class Math {

    fun add(a: String, b: String): String {

        var result = ""
        if (a.isEmpty() || b.isEmpty()) {
            result = "Вы не заполнили поля"
        } else if (a.toInt() < 0 || b.toInt() < 0) {
            result = "Нельзя отрицательные закидывать"
        } else if (a.toDoubleOrNull() != null || b.toDoubleOrNull() != null) {
            result = (a.toDouble() + b.toDouble()).toString()
        } else if (!a.tryParseInt() || !b.tryParseInt()) {
            result = "Буквы не складываются"
        } else {
            val num1 = a.toInt()
            val num2 = b.toInt()
            result = (num1 + num2).toString()
        }
        return result
    }

    fun String.tryParseInt(): Boolean {
        return try {
            this.toInt()
            true
        } catch (a: NumberFormatException) {
            false
        }
    }

    fun divide(a: String, b: String): String{
        return (a.toInt() / b.toInt()).toString()
    }
}