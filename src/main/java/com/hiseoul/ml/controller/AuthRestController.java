package com.hiseoul.ml.controller;

import org.apache.logging.log4j.LogManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.hiseoul.ml.model.Auth;
import com.hiseoul.ml.model.Result;
import com.hiseoul.ml.repositories.AuthRepository;
import com.hiseoul.ml.service.AuthService;

@RestController
@RequestMapping(value="restapi/auth")
public class AuthRestController{
	private static final org.apache.logging.log4j.Logger
	logger = LogManager.getLogger(AuthRestController.class);
		@Autowired
		AuthRepository repository;
		
		@Autowired
		AuthService authService;
		
		@GetMapping
		public Result retrieveAuthList() {
			Result result = authService.retrieveAuthList();
			return result;
		}
		
		@GetMapping("/{authUuid}")
		public Result retrieveAuth(@PathVariable String authUuid) {
			Result result = authService.retrieveAuth(authUuid);
			return result;
		}
		
		@PostMapping
		public Result createAuth(@ModelAttribute Auth auth) {
			Result result = authService.createAuth(auth);
			return result;
		}
		
		@PutMapping
		public Result updateAuth(@ModelAttribute Auth auth) {
			Result result = authService.updateAuth(auth);
			return result;
		}
		
		@DeleteMapping
		public Result deleteAuth(@RequestParam String authUuid) {
			Result result = authService.deleteAuth(authUuid);
			return result;
		}
		
}