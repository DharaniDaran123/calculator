package com.dharani.calclator.controller;

import com.dharani.calclator.service.calculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class calculatorController {
   private calculatorService service;
    public calculatorController(calculatorService service){
        this.service=service;
    }
    @GetMapping("/add/{a}/{b}")
    public String add(@PathVariable int a,@PathVariable int b){
          int result= service.add(a,b);
        return "Output is : "+result;
    }
    @GetMapping("/sub/{a}/{b}")
    public String sub(@PathVariable int a,@PathVariable int b){
        int result= service.sub(a,b);
        return "Output is : "+result;
    }
      @GetMapping("/mul/{a}/{b}")
    public String mul(@PathVariable int a,@PathVariable int b){
        int result= service.mul(a,b);
        return "Output is : "+result;
    }
}
