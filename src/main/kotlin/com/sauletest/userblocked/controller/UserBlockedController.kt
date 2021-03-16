package com.sauletest.userblocked.controller

import com.sauletest.userblocked.service.UserService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@Api(description = "User Blocked controller")
@RequestMapping()
class UserBlockedController(val userService: UserService) {
    @RequestMapping(path = [("/{id}")], method = [(RequestMethod.GET)])
    @ApiOperation("Get user by id")
    fun getUser(@PathVariable("id") id: Long): Boolean? = userService.getIsUserBlocked(id)
}