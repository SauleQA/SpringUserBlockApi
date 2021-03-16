package com.sauletest.userblocked.repository

import com.sauletest.userblocked.model.entity.Users
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<Users, Long> {
    @Query("select u.isBlocked from Users u where u.id = :id", nativeQuery= true)
    fun queryIsBlockedById(@Param("id") id: Long?):List<Boolean>
}