package com.sauletest.userblocked.model.entity

import javax.persistence.*

@Entity
@Table(name = "users")
class Users(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(columnDefinition = "serial")
        var id: Long?,

        var isBlocked: Boolean?
)
