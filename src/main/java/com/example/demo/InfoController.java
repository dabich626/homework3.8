package com.example.demo;

import org.springframework.beans.factory.annotation.Value;

@RestController
@RestMapping("/info")
public class InfoController {

    private final int port;

    public InfoController(@Value("${server.port}") int port){

        this.port = port;
    }

    @GetMapping("/getPort")
    public int port(){
        return port;
    }
}
