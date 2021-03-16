package com.sauletest.userblocked.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class MyExceptionController {
    @ExceptionHandler(value = [(UserNotFoundException::class)])
    fun handleUserNotFound(ex: UserNotFoundException): ResponseEntity<ErrorsDetails> {
        val errorDetails = ErrorsDetails(
                "User is not found",
                ex.message!!
        )
        return ResponseEntity(errorDetails, HttpStatus.NOT_FOUND)
    }
}

class UserNotFoundException(override val message: String?) : Exception(message)
data class ErrorsDetails(val message: String, val details: String)
