package com.sipios.springsearch

import java.time.Duration
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.util.Date
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "USERS")
data class Users(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var userId: Long? = null,

    @Column(name = "FirstName")
    var userFirstName: String = "John",

    @Column(name = "isAdmin")
    var isAdmin: Boolean = true,

    @Column(name = "LastName")
    var userLastName: String = "Doe",

    @Column(name = "email")
    var userEmail: String = "john.doe@wanahoo.fr",

    @Column(name = "PostalAddress")
    var userAddress: String = "1 rue de l'angleterre",

    @Column(name = "NumberOfChildren")
    var userChildrenNumber: Int = 3,

    @Column(name = "Salary")
    var userSalary: Float = 3000.0F,

    @Column(name = "AgeInSeconds")
    var userAgeInSeconds: Double = 1261440000.0,

    @Column
    var createdAt: Date = Date(),

    @Column
    var updatedAt: LocalDateTime = LocalDateTime.now(),

    @Column
    var updatedTimeAt: LocalTime = LocalTime.now(),

    @Column
    var updatedDateAt: LocalDate = LocalDate.now(),

    @Column
    var updatedInstantAt: Instant = Instant.now(),

    @Column
    var validityDuration: Duration = Duration.ofDays(30),

    @Column(name = "UserType")
    var type: UserType? = UserType.TEAM_MEMBER,

    @Column
    var uuid: UUID = UUID.randomUUID()
)
