package com.example.test

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface MemberRepository : JpaRepository<Member, Long> {
    @Query(
        """
            select m
            from Member m
            where m.id = :id
        """,
    )
    fun getMember(id: Long): Member?
}
