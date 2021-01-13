package com.pluralsight.conferencedemo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@Value("${app.version}")
	private String appV;
	@GetMapping
    @RequestMapping("/")
    public Map getStatus() {
		Map<String, String> x = new HashMap<String, String>(1);
		x.put("version", appV);
        return x;
    }

}
