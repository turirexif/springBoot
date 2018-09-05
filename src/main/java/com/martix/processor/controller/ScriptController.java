package com.martix.processor.controller;



import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = {"*"})
@RestController
public class ScriptController {


    @RequestMapping(value = "ping", method = RequestMethod.GET)
    public String processScript(){

        return "pong";
    }

}
