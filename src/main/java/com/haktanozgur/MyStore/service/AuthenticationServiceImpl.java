package com.haktanozgur.MyStore.service;

import java.util.NoSuchElementException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.haktanozgur.MyStore.dto.AuthenticationRequest;
import com.haktanozgur.MyStore.dto.AuthenticationResponse;
import com.haktanozgur.MyStore.dto.RegisterRequest;
import com.haktanozgur.MyStore.entity.User;
import com.haktanozgur.MyStore.entity.UserAdress;
import com.haktanozgur.MyStore.enums.Role;
import com.haktanozgur.MyStore.repository.UserRepository;
import com.haktanozgur.MyStore.repository.adressRepository;
import com.haktanozgur.MyStore.response.ServiceResponse;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

	private final UserRepository repository;
	private final adressRepository adressRepository;
	private final JwtService jwtService;
	private final PasswordEncoder passwordEncoder;	
	private final AuthenticationManager authenticationManager;
	
	
   @Override 
   public ServiceResponse register(RegisterRequest request) {

	   try {
		     if (request.getEmail()
				   .equals(repository.findByEmail(request.getEmail())
						   .get()
						   .getEmail())) {
			     return ServiceResponse.fail().message("Bu mail adresi daha önceden alınmıştır");
	         }
	         else {	   
	        	 
		         return ServiceResponse.fail().message("Hata");
	         }  
	   }
	   catch( NoSuchElementException e) {
		   
		   if(request.getPassword().length() < 6) {
			   
			   return ServiceResponse.fail().message("Belirlediğiniz şifre 6 karakterden az olmamalıdır");
		   }
		   
		   else {
			   User user = User.builder().firstname(request.getFirstname())
						  .username(request.getUsername())
						  .identifier(request.getIdentifier())
						  .lastname(request.getLastname())
						  .email(request.getEmail())
						  .password(passwordEncoder.encode(request.getPassword())).role(Role.USER).build();
				  UserAdress adress = UserAdress.builder().user(user).postcode(request.getPostcode()).country(request.getCountry())
						  .city(request.getCity()).neighboord(request.getNeighboord())
						  .fullAdress(request.getFullAdress()).build();
				  
				  repository.save(user);
				  adressRepository.save(adress);
					  
					  return ServiceResponse.success().message("Kaydınız başarıyla alınmıştır");
		   }	  
	   }
   }

   @Override
   public AuthenticationResponse login(AuthenticationRequest request) {
	
	   try {
		      authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
			  
		      User user = repository.findByEmail(request.getEmail()).orElseThrow(); 
			  
		      String jwtToken = jwtService.generateToken(user);
			  
		          return AuthenticationResponse.success().token(jwtToken);
	   }
	   catch(UsernameNotFoundException e) {
		   
		      return AuthenticationResponse.wrongInformation();
	   }
   }
   
}





