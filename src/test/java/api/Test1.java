package api;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test1 {
	@Test
	public void restapi() {
		
		Response res=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(res.getStatusCode());
		System.out.println(res.getTime());
		System.out.println(res.getBody().asString());
		System.out.println(res.getStatusLine());
		
		int statuscode=res.getStatusCode();
		
		Assert.assertEquals(statuscode, 200);
	}

}
