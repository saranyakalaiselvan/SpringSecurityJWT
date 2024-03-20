package com.crackit.SpringSecurityJWT.secured;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crackit/v1/management")
public class MemberController {

    @GetMapping
    public String getMember() {
        return "Secured Endpoint :: GET - Member controller";
    }

    @PostMapping
    public String post() {
        return "POST:: management controller";
    }
}
