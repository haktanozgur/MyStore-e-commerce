package com.haktanozgur.MyStore.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceResponse {

	private Integer httpStatusCode;

	private boolean isSuccess;
	
	private String message;

	private Object result;
	

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
	@JsonProperty("ErrorMessage")
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	@JsonProperty("Result")
	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public static ServiceResponse success() {
		ServiceResponse result = new ServiceResponse();
		result.setSuccess(true);
		result.setHttpStatusCode(200);
		return result;
	}
	
	public static ServiceResponse fail() {
		ServiceResponse result = new ServiceResponse();
		result.setSuccess(false);
		result.setHttpStatusCode(500);
		return result;
	}
	
	public static ServiceResponse fail(Integer statusCode) {
		ServiceResponse result = new ServiceResponse();
		result.setSuccess(false);
		result.setHttpStatusCode(statusCode);
		return result;
	}

	public ServiceResponse httpStatusCode(Integer statuscode) {
		this.httpStatusCode = statuscode;
		return this;
	}

	public ServiceResponse message(String message) {
		this.message = message;
		return this;
	}

	public ServiceResponse result(Object result) {
		this.result = result;
		return this;
	}

	
	
}
