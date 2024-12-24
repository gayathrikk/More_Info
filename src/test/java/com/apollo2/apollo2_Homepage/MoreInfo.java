package com.apollo2.apollo2_Homepage;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MoreInfo {

    private static final int TIMEOUT = 5000; // 5 seconds timeout

    // Helper method to make API requests
    private Response makeRequest(String url) {
        try {
            return RestAssured
                    .given()
                    .timeout(TIMEOUT)
                    .get(url);
        } catch (Exception e) {
            System.err.println("Failed to connect to URL: " + url);
            e.printStackTrace();
            return null;
        }
    }

    // Helper method to validate API response
    private void validateResponse(String url, Response response, int expectedStatusCode) {
        if (response == null) {
            Assert.fail("No response received for URL: " + url);
        }

        int statusCode = response.getStatusCode();
        String responseBody = response.asString();

        System.out.println("The URL is: " + url);
        System.out.println("Status Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);

        if (statusCode == expectedStatusCode) {
            System.out.println("API request passed. Status code: " + statusCode);
        } else {
            System.out.println("API request failed. Status code: " + statusCode);
        }

        Assert.assertEquals(statusCode, expectedStatusCode, "Unexpected status code for URL: " + url);
    }

    @Test(priority = 1)
    public void dgx_Request() {
        String url = "http://dgx1.humanbrain.in:1947/api/v1/describe?biosample_id=142";
        Response response = makeRequest(url);
        validateResponse(url, response, 200);
    }

    @Test(priority = 2)
    public void apollo2_Request() {
        String url = "https://apollo2.humanbrain.in/chat/api/v1/describe?biosample_id=52";
        Response response = makeRequest(url);
        validateResponse(url, response, 200);
    }
}
