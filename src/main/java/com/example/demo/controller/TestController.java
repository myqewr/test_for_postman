package com.example.demo.controller;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    public record RequestBody1(String name, String age){}

    public record ResponseBody1(String passedName, String passedAge){}

    @GetMapping("/api1")
    public String api1(){
        return "api1";
    }

    @PostMapping("/api2")
    public ResponseEntity<ResponseBody1> api2(@RequestBody RequestBody1 resquest){
        return ResponseEntity.ok(new ResponseBody1(resquest.name,resquest.age));
    }

    @GetMapping("/api3")
    public String api3(){
        return "api3";
    }

}
