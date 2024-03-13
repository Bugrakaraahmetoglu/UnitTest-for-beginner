package com.example.unittest

object Registration {

    private val users = listOf("bugra", "omer")

    fun validateRegistration(
        username: String,
        password: String,
        confirmPassword: String): Boolean {
        if (username.isEmpty() && users.contains(username) && password != confirmPassword) {
            return false
        }
        return true
    }
}