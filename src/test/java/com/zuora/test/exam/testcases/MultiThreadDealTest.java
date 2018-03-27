package com.zuora.test.exam.testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.mashape.unirest.http.HttpResponse;
import com.zuora.test.exam.TestBase;
import com.zuora.test.models.Deal;

public class MultiThreadDealTest extends TestBase {
	@Test(threadPoolSize = 3, invocationCount = 6)
	public void testGetDeals() {
        // Refer to https://github.com/agilecrm/rest-api#11-listing-contacts-
		HttpResponse<String> response = getDeals("page_size=10&cursor=E-ABAIICNGoRc35hZ2lsZS1jcm0tY2xvdWRyFAsSB0NvbnRhY3QYgICAgKLThAoMogEIcHJhYmF0aGuIAgAU");
		System.out.println(response.getBody().toString());
		// The expectedBody is just for interview test
		String expectedBody = new Deal("Deal-Tomato").id(981L).toString();
		Assert.assertEquals(200, response.getStatus());
		Assert.assertEquals(expectedBody, response.getBody());
				
    }

}
