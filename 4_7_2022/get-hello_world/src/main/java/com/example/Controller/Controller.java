package com.example.Controller;

import com.example.Responce.Responce;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    //    @Value("${app.name:Default msg}")
    private String appName;

    @GetMapping(value = "/getString")
    public Responce getString(){

        Responce resObj = new Responce("Hello World!");
        return resObj;
    }

    @GetMapping("/getNewString")
    public String getString(@RequestParam String str){
        return "String : "+str;
    }

}
