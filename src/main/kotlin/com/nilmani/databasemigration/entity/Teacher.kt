package com.nilmani.databasemigration.entity

import javax.persistence.*

@Entity
@Table(name = "teachers")
data class Teacher(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id:Long=-1,
    val name:String="",
    @Column(unique = true)
    val email:String="",
    val phone:Long=-1,
)
