package org.sid.servicecompany.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Controller {

    @Value("${yp}")
    private int yparam;
    @Value("${name}")
    private String name;

    @GetMapping("/test")
    public void test(){
        System.out.println("parematre= " +yparam);
        System.out.println("nm" +name);
    }
}
