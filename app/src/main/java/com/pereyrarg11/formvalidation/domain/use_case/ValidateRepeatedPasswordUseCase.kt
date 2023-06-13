package com.pereyrarg11.formvalidation.domain.use_case

class ValidateRepeatedPasswordUseCase {

    operator fun invoke(password: String, repeatedPassword: String): ValidationResult {
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