package com.pereyrarg11.formvalidation.domain.use_case

class ValidatePasswordUseCase {

    operator fun invoke(password: String): ValidationResult {
        if (password.length < 8) {
            return ValidationResult(
                successful = false,
                errorMessage = "The password needs to consist of at least 8 characters",
            )
        }

        val containsDigitsAndLetters = password.any { it.isLetter() }
                && password.any { it.isDigit() }
        if (!containsDigitsAndLetters) {
            return ValidationResult(
                successful = false,
                errorMessage = "The password needs to contain at least one letter and digit",
            )
        }

        return ValidationResult(
            successful = true,
        )
    }
}