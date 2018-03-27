package com.zuora.test.exam.testcases;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;
import com.mashape.unirest.http.HttpResponse;
import com.zuora.test.exam.TestBase;
import com.zuora.test.models.Deal;

public class DealTest extends TestBase {
	
	@Test
	public void testCreateDeal() {
		// Construct request body
		String body = new Deal("Deal-Tomato").expected_value(500).probability(75).close_date(1455042600)
				.milestone("Proposal").contact_ids("5758948741218304")
				.custom_data(ImmutableMap.of("name", "Group Size", "value", "10")).toString();
		System.out.println(body);
		HttpResponse<String> response = createDeal(body);
		System.out.println(response.getBody().toString());
		// The expectedBody is just for interview test
		String expectedBody = new Deal("Deal-Tomato").id(981L).toString();
		Assert.assertEquals(200, response.getStatus());
		Assert.assertEquals(expectedBody, response.getBody());
		
	}	
	
	@Test
    public void testGetDeals() {
        // Refer to https://github.com/agilecrm/rest-api#11-listing-contacts-
		HttpResponse<String> response = getDeals("page_size=10&cursor=E-ABAIICNGoRc35hZ2lsZS1jcm0tY2xvdWRyFAsSB0NvbnRhY3QYgICAgKLThAoMogEIcHJhYmF0aGuIAgAU");
		System.out.println(response.getBody().toString());
		// The expectedBody is just for interview test
		String expectedBody = new Deal("Deal-Tomato").id(981L).toString();
		Assert.assertEquals(200, response.getStatus());
		Assert.assertEquals(expectedBody, response.getBody());
				
    }
	
	@Test
	public void testGetDealByid() {
		HttpResponse<String> response = getDealById(981);
		System.out.println(response.getBody().toString());
		String expectedBody = new Deal("Deal-Tomato").id(981L).toString();
		Assert.assertEquals(200, response.getStatus());
		Assert.assertEquals(expectedBody, response.getBody()); 
	}
	


    
}
