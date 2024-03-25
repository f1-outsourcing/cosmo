package com.unitedinternet.calendar.api;

import com.unitedinternet.calendar.ldap.LdapSearchComponent;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.ldap.userdetails.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("test")
public class HelloController {

    private final LdapSearchComponent ldapSearchComponent;

    public HelloController(LdapSearchComponent ldapSearchComponent) {
        this.ldapSearchComponent = ldapSearchComponent;
    }

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

    @GetMapping("/ldap/search")
    public List<String> ldapSearch(){
        return ldapSearchComponent.search();
    }
}