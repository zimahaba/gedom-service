package com.zimahaba.gedom.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class TestController {

    @GetMapping("/gettest")
    public TestResource getTest() {
        TestResource t = new TestResource();
        t.setHoraData(LocalTime.now());
        t.setHoraString(LocalTime.now().toString());
        t.getMapa().put("a", "a");
        t.getMapa().put("b", "b");
        return t;
    }

    @PostMapping("/posttest")
    public String postTest(@RequestBody TestResource t) {
        if (t != null) {
            System.out.println(t.getHoraData());
            System.out.println(t.getHoraString());
        }
        return "ok";
    }
}
