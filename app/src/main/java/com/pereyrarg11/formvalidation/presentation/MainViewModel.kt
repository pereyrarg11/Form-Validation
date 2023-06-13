package com.pereyrarg11.formvalidation.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.pereyrarg11.formvalidation.domain.use_case.ValidateEmailUseCase
import com.pereyrarg11.formvalidation.domain.use_case.ValidatePasswordUseCase
import com.pereyrarg11.formvalidation.domain.use_case.ValidateRepeatedPasswordUseCase
import com.pereyrarg11.formvalidation.domain.use_case.ValidateTermsUseCase

class MainViewModel(
    private val validateEmailUseCase: ValidateEmailUseCase = ValidateEmailUseCase(),
    private val validatePasswordUseCase: ValidatePasswordUseCase = ValidatePasswordUseCase(),
    private val validateRepeatedPasswordUseCase: ValidateRepeatedPasswordUseCase = ValidateRepeatedPasswordUseCase(),
    private val validateTermsUseCase: ValidateTermsUseCase = ValidateTermsUseCase(),
) : ViewModel() {

    var state by mutableStateOf(RegistrationFormState())


}