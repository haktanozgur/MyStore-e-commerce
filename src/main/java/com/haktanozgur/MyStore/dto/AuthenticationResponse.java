package com.haktanozgur.MyStore.dto;

import javax.naming.spi.DirStateFactory.Result;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.haktanozgur.MyStore.response.ServiceResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {

	private String token;
	
	private Integer httpStatusCode;

	private boolean isSuccess;
	
	private String message;

	

	@JsonProperty("StatusCode")
	public Integer getHttpStatusCode() {
		return httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}
	@JsonProperty("Success")
	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	@JsonProperty("Message")
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	@JsonProperty("Token")
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public static AuthenticationResponse success() {
		AuthenticationResponse result = new AuthenticationResponse();
		result.setSuccess(true);
		result.setHttpStatusCode(200);
		result.setMessage("Giriş Başarılı");
		return result;
	}
	
	public static AuthenticationResponse fail() {
		AuthenticationResponse result = new AuthenticationResponse();
		result.setSuccess(false);
		result.setHttpStatusCode(500);
		return result;
	}
	
	public static AuthenticationResponse wrongInformation() {
		AuthenticationResponse result = new AuthenticationResponse();
		result.setSuccess(false);
		result.setHttpStatusCode(400);
		result.setMessage("Girilen bilgiler yanlıştır");
		return result;	}
	
	public static AuthenticationResponse fail(Integer statusCode) {
		AuthenticationResponse result = new AuthenticationResponse();
		result.setSuccess(false);
		result.setHttpStatusCode(statusCode);
		return result;
	}

	public AuthenticationResponse httpStatusCode(Integer statuscode) {
		this.httpStatusCode = statuscode;
		return this;
	}

	public AuthenticationResponse message(String message) {
		this.message = message;
		return this;
	}

	public AuthenticationResponse token(String token) {
		this.token = token;
		return this;
	}
}
