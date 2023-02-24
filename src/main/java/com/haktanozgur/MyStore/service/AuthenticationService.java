package com.haktanozgur.MyStore.service;

import com.haktanozgur.MyStore.dto.AuthenticationRequest;
import com.haktanozgur.MyStore.dto.AuthenticationResponse;
import com.haktanozgur.MyStore.dto.RegisterRequest;
import com.haktanozgur.MyStore.response.ServiceResponse;

public interface AuthenticationService {

	ServiceResponse register(RegisterRequest request);
	AuthenticationResponse login(AuthenticationRequest request);
}
