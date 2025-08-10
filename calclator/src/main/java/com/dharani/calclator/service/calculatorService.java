package com.dharani.calclator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class calculatorService {

    public int add(@PathVariable int a, @PathVariable int b){
      int result= a+b;
       return result;
    }
    public int sub(@PathVariable int a, @PathVariable int b){
        int result= a-b;
        return result;
    }
}
