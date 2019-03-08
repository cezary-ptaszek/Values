package com.simple.program.controller;

import com.simple.program.bean.Value;
import com.simple.program.services.IValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    IValueService valueService;

    @GetMapping("/showValues")
    public List<Value> getAllValues(){
        return valueService.findAll();
    }


}
