package com.monique.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloHumanController {
	@RequestMapping("")
    public String index(){
      return "Hello Human!";
    }
	
    @RequestMapping("/name")
    public String index(@RequestParam(value="q", required=false) String nameQuery) {
        return "Hello " + nameQuery;
    }
}
