package com.demo.demo.api;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    //List<Days> days = Arrays.asList(Days.values());
    List<String> days = Stream.of(Days.values()).map(Enum::name).collect(Collectors.toList());
    @RequestMapping(value="/hello")
    public List<String> sayHello()
    {
        return days;
    }
}
