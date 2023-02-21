package com.andriosi.fabio.udemy.erudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.andriosi.fabio.udemy.erudio.services.MathService;

@RestController
@RequestMapping("api-v1")
public class MathController {

    @Autowired
    private MathService math;

    @GetMapping("/sum/{first}/{second}")
    public Double sum(@PathVariable(value="first") String first, @PathVariable(value="second") String second) throws Exception {
        return math.getSum(first.trim(), second.trim());
    }
    @GetMapping("/division/{first}/{second}")
    public Double division(@PathVariable(value="first") String first, @PathVariable(value="second") String second) throws Exception {
        return math.getDivision(first.trim(), second.trim());
    }
    @GetMapping("/multiply/{first}/{second}")
    public Double Multiply(@PathVariable(value="first") String first, @PathVariable(value="second") String second) throws Exception {
        return math.getMultiply(first.trim(), second.trim());
    }
    @GetMapping("/sub/{first}/{second}")
    public Double subtraction(@PathVariable(value="first") String first, @PathVariable(value="second") String second) throws Exception {
        return math.getSub(first.trim(), second.trim());
    }
}
