package com.nilmani.databasemigration.repository

import com.nilmani.databasemigration.entity.Teacher
import org.springframework.data.jpa.repository.JpaRepository

interface TeacherRepository : JpaRepository<Teacher,Long> {
}