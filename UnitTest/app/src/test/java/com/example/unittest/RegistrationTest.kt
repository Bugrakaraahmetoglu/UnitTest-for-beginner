package com.example.unittest

import org.junit.Assert.*
import org.junit.Test

class RegistrationTest {

    @Test
    fun empty_username_returns_false() {
        val result = Registration.validateRegistration(
            "", "123", "123")
        assertFalse("\"empty username\"",result)
    }

    @Test
    fun existing_username_returns_false() {
        assertFalse("\"existing username\"",Registration.validateRegistration(
            "bugra", "123", "123"))
    }

    @Test
    fun non_existing_username_and_different_passwords_returns_false() {
        assertFalse("\"password and confirm password is different\"",Registration.validateRegistration(
            "john", "123", "456"))

    }

    @Test
    fun valid_registration_returns_true() {
        assertTrue(Registration.validateRegistration(
            "john", "123", "123"))
    }
}