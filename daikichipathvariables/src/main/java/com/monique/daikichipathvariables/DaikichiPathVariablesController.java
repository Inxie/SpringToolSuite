package com.monique.daikichipathvariables;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/daikichi")

public class DaikichiPathVariablesController {
	public static void main(String[] args) {
        SpringApplication.run(DaikichipathvariablesApplication.class, args);
	}
	
	@RequestMapping("")
    public String index(){
      return "Welcome!";
    }
	
	@RequestMapping("/today")
    public String today(){
      return "Today you will find luck in all your endeavors!";
    }
	
    @RequestMapping("/tomorrow")
    public String tomorrow(){
      return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }
    
    @RequestMapping("/day/{weekday}")
    public String showDay(@PathVariable("weekday") String weekday){
    	return "You will be lucky this " + weekday;
    }
    
    @RequestMapping("/holiday/{holiday}")
    public String showHoliday(@PathVariable("holiday") String holiday){
    	return "You will have a great " + holiday;
    }
    
    @RequestMapping("/travel/{city}")
    public String showCity(@PathVariable("city") String city){
    	return "Congratulations! You will soon travel to " + city;
    }
    
    @RequestMapping("/lotto/{number}")
    public String showNumber(@PathVariable("number") int number){
    	if (number%2==0) {
    		return "You will take a grand journey in the near future, but be weary of tempting offers";
    	}
    	else {
    		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
    	}
    }
}