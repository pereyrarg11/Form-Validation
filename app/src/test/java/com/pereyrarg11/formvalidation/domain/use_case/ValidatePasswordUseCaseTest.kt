package com.pereyrarg11.formvalidation.domain.use_case

import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class ValidatePasswordUseCaseTest {

    private lateinit var systemUnderTest: ValidatePasswordUseCase

    @Before
    fun setUp() {
        systemUnderTest = ValidatePasswordUseCase()
    }

    @Test
    fun `Password is letter-only, returns error`() {
        val result = systemUnderTest("abcdefgh")

        assertEquals(result.successful, false)
    }
}