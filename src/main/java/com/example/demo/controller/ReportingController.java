package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reporting")
@Tag(name = "Reporting", description = "Operations related to reporting")
public class ReportingController {

    @GetMapping("/hello")
    @Operation(description = "Return the critical hello operation.")
    public String hello() {
        return "Hello";
    }
}
