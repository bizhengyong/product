package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bizy
 * @date 2020/5/3 20:51
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg(){
        return "this is product msg";
    }
}
