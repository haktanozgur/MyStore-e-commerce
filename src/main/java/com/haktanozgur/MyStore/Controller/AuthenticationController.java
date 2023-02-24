package com.haktanozgur.MyStore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haktanozgur.MyStore.dto.AuthenticationRequest;
import com.haktanozgur.MyStore.dto.AuthenticationResponse;
import com.haktanozgur.MyStore.dto.RegisterRequest;
import com.haktanozgur.MyStore.response.ServiceResponse;
import com.haktanozgur.MyStore.service.AuthenticationServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class AuthenticationController {

	@Autowired
	AuthenticationServiceImpl authenticationService;
	
	
	@PostMapping("/register")
	public ResponseEntity<ServiceResponse> register(@RequestBody RegisterRequest request) {
		ServiceResponse response = authenticationService.register(request);
		
		if(request != null) {
			
			return ResponseEntity.ok(response);
		}
		else {
			return ResponseEntity.ok().body(ServiceResponse.fail());
		}		
	}
	
	@PostMapping("/login")
	public ResponseEntity<AuthenticationResponse> login(@RequestBody AuthenticationRequest request) {
		
		AuthenticationResponse result = authenticationService.login(request);
		if(request != null) {
			
			return ResponseEntity.ok(result);
		}
		else {
			return ResponseEntity.ok().body(AuthenticationResponse.fail());
		}
	}
	


}
