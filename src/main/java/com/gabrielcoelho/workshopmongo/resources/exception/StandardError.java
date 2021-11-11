package com.gabrielcoelho.workshopmongo.resources.exception;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long timestamp;
	private Integer status;
	private String errors;
	private String message;
	private String path;
	
	public StandardError() {
	}

	public StandardError(Long timestamp, Integer status, String errors, String message, String path) {
		this.timestamp = timestamp;
		this.status = status;
		this.errors = errors;
		this.message = message;
		this.path = path;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getErrors() {
		return errors;
	}

	public void setErrors(String errors) {
		this.errors = errors;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
