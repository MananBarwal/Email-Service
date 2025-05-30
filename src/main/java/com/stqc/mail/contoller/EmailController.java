package com.stqc.mail.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class EmailController {
	
	// Send HTML Email
    @GetMapping("/welcome")
    public String sendHtmlEmail() {
        
        return "Hello test project!";
    }
}
