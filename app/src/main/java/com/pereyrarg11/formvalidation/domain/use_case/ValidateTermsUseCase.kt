package com.pereyrarg11.formvalidation.domain.use_case

class ValidateTermsUseCase {

    operator fun invoke(terms: Boolean): ValidationResult {
        if (!terms) {
            return ValidationResult(
                successful = false,
                errorMessage = "Please accept the terms",
            )
        }

        return ValidationResult(
            successful = true,
        )
    }
}