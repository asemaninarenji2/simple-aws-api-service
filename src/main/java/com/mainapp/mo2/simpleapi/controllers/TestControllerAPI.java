package com.mainapp.mo2.simpleapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/test")
public class TestControllerAPI {
    @GetMapping(value = "/test1/{id}")
    public String test(@PathParam("id") String id){
        return "TEST SUCCESS";
    }
    @GetMapping(value = "/test2/{id}")
    public String tes2(@PathParam("id") String id){
        return "TEST 2 SUCCESS";
    }


}
