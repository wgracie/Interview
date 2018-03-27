package com.zuora.test.models;

import com.zuora.test.exam.util.JsonUtils;

public class ResponseObject {
	private int statusCode;
	private String payload;
	
	public ResponseObject(int statusCode, String payload) {
		this.statusCode = statusCode;
		this.payload = payload;
	}
	
	public ResponseObject statusCode(int statusCode) {
		this.statusCode = statusCode;
		return this;
	}
	
	public ResponseObject payload(String payload) {
		this.payload = payload;
		return this;
	}
	
	public int getStatusCode() {
		return this.statusCode;
	}
	
	public String getPayload() {
		return this.payload;
	}
	
	public String toString() {
		return JsonUtils.toString(this);
	}

}
