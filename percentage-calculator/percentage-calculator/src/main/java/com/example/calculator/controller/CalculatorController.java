package com.example.calculator.controller;

import com.example.calculator.model.CalculationRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    @PostMapping("/percentage")
    public double calculatePercentage(@RequestBody CalculationRequest request) {
        return (request.getPart() / request.getWhole()) * 100;
    }

    @PostMapping("/increase")
    public double calculateIncrease(@RequestBody CalculationRequest request) {
        return ((request.getWhole() - request.getPart()) / request.getPart()) * 100;
    }

    @PostMapping("/decrease")
    public double calculateDecrease(@RequestBody CalculationRequest request) {
        return ((request.getPart() - request.getWhole()) / request.getPart()) * 100;
    }

    @PostMapping("/find-whole")
    public double findWhole(@RequestBody CalculationRequest request) {
        return (request.getPart() * 100) / request.getPercentage();
    }
}
