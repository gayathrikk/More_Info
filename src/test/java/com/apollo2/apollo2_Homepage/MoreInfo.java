package com.apollo2.apollo2_Homepage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MoreInfo {
	
	//@Test(priority =1)
	//public void dgx_Request() {
	  //  Response response = RestAssured.get("http://dgx1.humanbrain.in:1947/api/v1/describe?biosample_id=142");
	    //String url="http://dgx1.humanbrain.in:1947/api/v1/describe?biosample_id=142";
	    //System.out.println("The URL is : "+url );
	    //int statusCode = response.getStatusCode();
	    //String responseBody = response.asString();

	    //if (statusCode == 200) {
	      //  System.out.println("API request of more info on dgx3 passed. Status code: " + statusCode);
	        //System.out.println("Response Body: " + responseBody);
	    //} else {
	      //  System.out.println("API request of more info on dgx3 failed. Status code: " + statusCode);
	    //}
	    
	   // Assert.assertEquals(statusCode, 200, "API request of more info on dgx3 failed");
	//}

	 @Test(priority=2)
	 public void apollo2_Request()
	 {
	        
	       
	        Response response2 = RestAssured.get("https://apollo2.humanbrain.in/atlas/describe_brain/?biosample=219");
	        String url="https://apollo2.humanbrain.in/atlas/describe_brain/?biosample=219";
	        System.out.println("The URL is :"+url);
	        int statusCode2 = response2.getStatusCode();
	        String responseBody = response2.asString();
	        
	        if (statusCode2 == 200) {
	            System.out.println("API request of more info on apollo2 passed. Status code: " + statusCode2);
	            System.out.println("Response Body: " + responseBody);
	        } else {
	            System.out.println("API request of more info on apollo2 failed. Status code: " + statusCode2);
	        }
	        Assert.assertEquals(statusCode2, 200, "API request of more info on apollo2 failed");
	        
	 }

}
