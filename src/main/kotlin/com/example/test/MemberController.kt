package com.example.test

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController(
    private val memberService: MemberService,
) {
    @GetMapping("/members/{id}/simple")
    fun getMember(
        @PathVariable id: Long,
    ): Member? {
        return memberService.getMember(id)
    }

    @GetMapping("/members/{id}/not-simple")
    fun getMemberNotUsingSimple(
        @PathVariable id: Long,
    ): Member? {
        return memberService.getMemberNotUsingSimple(id)
    }
}
