package com.unitedinternet.calendar.api;

import org.unitedinternet.cosmo.controller.CalendarController;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.ldap.userdetails.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


@RestController
@RequestMapping("/")
public class HelloController extends CalendarController {

/*
    @GetMapping("/")
    public String hello(Authentication authentication) {
        return "Hello " +
                authentication.getName() +
                "!";
    }

    @GetMapping("/friendly")
    public String hello(@AuthenticationPrincipal Person person) {
        return "Hello " +
                person.getUsername() + "\n" +
                person.getGivenName() + "\n" +
                person.getDn() + "\n" +
                Arrays.toString(person.getCn()) + "\n" +
                person.getSn() +
                "!";
    }

    @GetMapping("/test")
    public String test(){
        return "<h2>Test</h2><br/>It is working...";
    }
*/

}