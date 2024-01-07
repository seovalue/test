package com.example.test

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class MemberService(
    private val memberRepository: MemberRepository,
) {
    fun getMember(id: Long): Member? {
        return memberRepository.findByIdOrNull(id)
    }

    fun getMemberNotUsingSimple(id: Long): Member? {
        return memberRepository.getMember(id)
    }
}
