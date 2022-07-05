package com.example.Controller;

import com.example.Operations.Operations;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/controller")
public class Controller {

    @GetMapping("/calculate/{number1}/{symbol}/{number2}")
    public String getOperations(@PathVariable Integer number1, @PathVariable Character symbol, @PathVariable Integer number2){
        Operations op = new Operations(number1,symbol,number2);
        Integer answer = op.doOpration();
        String answer_string = "Answer of Following operation is : "+ answer.toString();
        return answer_string;
    }

    @GetMapping("/calculate")
    public String getOperations_1(@RequestParam("number1") Integer number1, @RequestParam("symbol") Character symbol, @RequestParam("number2") Integer number2){
        Operations op = new Operations(number1,symbol,number2);
        Integer answer = op.doOpration();
        String answer_string = "Answer of Following operation is : "+ answer.toString();
        return answer_string;
    }
}
