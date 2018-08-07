package com.thamira.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ResponseEntity<?> getUser() {

		return ResponseEntity.ok("done");
	}
	
}