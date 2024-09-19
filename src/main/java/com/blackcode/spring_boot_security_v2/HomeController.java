package com.blackcode.spring_boot_security_v2;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello World";
    }

    @GetMapping("/getUser")
    private String getUser(){
        return "Halaman User";
    }

    @GetMapping("/getAdmin")
    private String getAdmin(){
        return "Halaman Admin";
    }
}
