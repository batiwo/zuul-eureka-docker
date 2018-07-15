package com.github.rest1server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/admin")
public class AdminController {

    @GetMapping()
    public String hello() {
        return "Hello from Rest1";
    }

    @GetMapping("/page1")
    public List<Admin> getAllAdmin() {
        List<Admin> out = new ArrayList<>();

        out.add(new Admin("bobo"));
        out.add(new Admin("baba"));
        out.add(new Admin("baba2"));

        return out;
    }

}
