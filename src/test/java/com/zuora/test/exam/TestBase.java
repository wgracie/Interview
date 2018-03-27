package com.zuora.test.exam;

import java.util.Map;
import java.util.ResourceBundle;

import com.google.common.collect.ImmutableMap;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import com.mashape.unirest.request.body.RequestBodyEntity;
import com.zuora.test.exam.util.PropertiesUtil;

public class TestBase {
    //TODO This is a base class for all test cases.
    //Please do your best to enhance it.
	public static ResourceBundle rb = PropertiesUtil.getTestProperties();
	
	public String getTestServer() {
		return rb.getString("test.server.url");
	}
	
	public String getDealUrl() {
		return getTestServer() + "/opportunity";
	}
	
	public String getTestUsername() {
		return rb.getString("test.username");		
	}
	
	public String getTestPassword() {
		return rb.getString("test.password");		
	}
	
	public Map<String, String> headersForPost() {
		return ImmutableMap.of("Content-Type", "application/json", "Accept", "application/json");
	}
	
	public Map<String, String> headersForGet() {
		return ImmutableMap.of("Accept", "application/json");
	}
	
	public HttpResponse<String> createDeal(String body) {
		RequestBodyEntity request = Unirest.post(this.getDealUrl()).basicAuth(this.getTestUsername(), this.getTestPassword())
				.headers(this.headersForPost()).body(body);
		HttpResponse<String> response = null;
		try {
			response = request.asString();
		} catch (UnirestException e) {			
			e.printStackTrace();
		}
		return response;
	}
	
	public HttpResponse<String> getDeals(String params) {
		GetRequest request = Unirest.get(this.getDealUrl() + "?" + params).basicAuth(this.getTestUsername(), this.getTestPassword())
				.headers(headersForGet());
		HttpResponse<String> response = null;
		try {
			response = request.asString();
		} catch (UnirestException e) {			
			e.printStackTrace();
		}
		return response;
	}
	
	public HttpResponse<String> getDealById(long id) {
		GetRequest request = Unirest.get(this.getDealUrl() + "/" + id).basicAuth(this.getTestUsername(), this.getTestPassword())
				.headers(headersForGet());
		HttpResponse<String> response = null;
		try {
			response = request.asString();
		} catch (UnirestException e) {			
			e.printStackTrace();
		}
		return response;
	}
	
	
	
	
	
}
