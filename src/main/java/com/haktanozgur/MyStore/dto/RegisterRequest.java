package com.haktanozgur.MyStore.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RegisterRequest {

	private String firstname;	
	private String lastname;
	private String email;
	private String username;
	private Long identifier;
	private String password;
	private String country;
	private String city;
	private String neighboord;
	private String fullAdress;
	private Integer postcode;
	

	
}
