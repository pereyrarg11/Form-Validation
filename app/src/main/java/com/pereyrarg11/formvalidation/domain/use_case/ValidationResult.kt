package com.pereyrarg11.formvalidation.domain.use_case

data class ValidationResult(
    val successful: Boolean,
    val errorMessage: String? = null,
)
