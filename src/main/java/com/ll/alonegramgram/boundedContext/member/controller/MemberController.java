package com.ll.alonegramgram.boundedContext.member.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    @GetMapping("/join")
    public String showJoin() {
        return "usr/member/join";
    }

    @AllArgsConstructor
    @Getter
    public static class JoinForm {
        @NotBlank
        @Min(4)
        @Max(30)
        private final String username;
        @NotBlank
        @Min(4)
        @Max(30)
        private final String password;

    }

    @PostMapping("/join")
    public String join(@Valid JoinForm joinForm) {

        return "redirect:/";
    }
}