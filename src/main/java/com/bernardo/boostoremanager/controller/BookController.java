package com.bernardo.boostoremanager.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class BookController {


    @ApiOperation(value="return response hello")
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "sucess")
    })
    @GetMapping
    public String hello(){
        return "hello";
    }
}
