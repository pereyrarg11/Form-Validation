package com.pereyrarg11.formvalidation.domain.use_case

class ValidateRepeatedPasswordUseCase {

    operator fun invoke(password: String, repeatedPassword: String): ValidationResult {
        if (repeatedPassword.isBlank()) {
            return ValidationResult(
                successful = false,
                errorMessage = "The password can't be blank",
            )
        }

        if (password != repeatedPassword) {
            return ValidationResult(
                successful = false,
                errorMessage = "The passwords don't match",
            )
        }

        return ValidationResult(
            successful = true,
        )
    }
}