package com.github.rest2server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/download")
public class DownloadController {

    @GetMapping()
    public String hello() {
        return "Hello from Rest2";
    }

    @GetMapping("/page1")
    public List<Download> listDowloads() {
        return Arrays.asList(new Download("test1", "C:\\Test1", true),
                             new Download("test2", "C:\\Test2", false),
                             new Download("test3", "C:\\Test3", true));
    }

}
