package com.andriosi.fabio.udemy.arudio.udemyarudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.andriosi.fabio.udemy.arudio.udemyarudio.services.Calculator;

@RestController
@RequestMapping("api-v1")
public class CalculatorController {

    @Autowired
    private Calculator calculator;

    @GetMapping("/sum/{first}/{second}")
    public Double sum(@PathVariable(value="first") String first, @PathVariable(value="second") String second) throws Exception {

        return calculator.getSum(first.trim(), second.trim());         
    }
}
