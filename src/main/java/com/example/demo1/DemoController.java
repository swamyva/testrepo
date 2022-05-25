package com.example.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/")
    public String rootPrint()
    {
        System.out.println("simple controller");
        return "hello vani";
    }
}
