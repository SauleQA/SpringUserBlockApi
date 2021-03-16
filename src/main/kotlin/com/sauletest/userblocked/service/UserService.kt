package com.sauletest.userblocked.service

import com.sauletest.userblocked.controller.UserNotFoundException
import com.sauletest.userblocked.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun getIsUserBlocked(id: Long): Boolean? {
        if (!userRepository.existsById(id)) {
            throw UserNotFoundException("User with id $id does not exist")
        }

        println(userRepository.queryIsBlockedById(id)[0])
        return userRepository.queryIsBlockedById(id)[0]
    }
}