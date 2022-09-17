package PostAPIs;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Minitab_order_post {
	    @SuppressWarnings("unchecked")
		@Test(description="This is HTTP post to create order details (positive case)")
		void NewOrderCreation() throws Throwable
		{
			RestAssured.baseURI="http://localhost:8080";
			RequestSpecification httprequest=RestAssured.given();
			
			//sending data Payload for post request
			JSONObject requestBody =new JSONObject();
			requestBody.put("OrderId","123456");
			requestBody.put("OrderName","1 Year - Minitab Statistical Software");
			requestBody.put("CustomerAccount","Bedrock, LLC");
			requestBody.put("PaymentTerms","NET30");
			requestBody.put("TaxExempt","false");
			requestBody.put("Currency","USD");
			
			requestBody.put("BillToPerson.EmailAddress","fred.flintstone@bedrock.com");
			requestBody.put("BillToPerson.FirstName","Fred");
			requestBody.put("BillToPerson.LastName","Flintstone");
			requestBody.put("BillToPerson.StreetLine1","1829 Pine Hall Rd.");
			requestBody.put("BillToPerson.StreetLine2","");
			requestBody.put("BillToPerson.StreetLine3","");
			requestBody.put("BillToPerson.City","State College");
			requestBody.put("BillToPerson.Region","PA");
			requestBody.put("BillToPerson.Country","US");
			
			requestBody.put("ShipToPerson.EmailAddress","barney.rubble@bedrock.com");
			requestBody.put("ShipToPerson.FirstName","Barney");
			requestBody.put("ShipToPerson.LastName","Rubble");
			requestBody.put("ShipToPerson.StreetLine1","1829 Pine Hall Rd.");
			requestBody.put("ShipToPerson.StreetLine2","");
			requestBody.put("ShipToPerson.StreetLine3","");
			requestBody.put("ShipToPerson.City","State College");
			requestBody.put("ShipToPerson.Region","PA");
			requestBody.put("ShipToPerson.Country","US");
			
			
			httprequest.header("content-type","application/jason");
			httprequest.body(requestBody.toJSONString()); //attaching data to request
			
			Response response = httprequest.request(Method.POST,"/order");//post request will be sent
			
			//asserting   status code is 200 from response
			String responsebody=response.getBody().toString();
			System.out.println("Response body is" +responsebody);
			
			
				int statusCode=response.getStatusCode();
				System.out.println("status code"+statusCode);
				Assert.assertEquals(statusCode,200);
				
				//asserting  success code
				String successcode= response.jsonPath().get("successcode");
				System.out.println("status Line"+successcode);
				Assert.assertEquals(successcode,"OPERATION_SUCCESS");
		}
	
		
		
		@SuppressWarnings("unchecked")
		@Test(description="This is HTTP post to create order details (Negative case)")
		void NewOrderCreationNegative() throws Throwable
		{
			RestAssured.baseURI="http://localhost:8080";
			RequestSpecification httprequest=RestAssured.given();
			
			//sending data Payload for post request
			JSONObject requestBody =new JSONObject();
			requestBody.put("OrderId","123456");
			requestBody.put("OrderName","1 Year - Minitab Statistical Software");
			requestBody.put("CustomerAccount","Bedrock, KKP");
			requestBody.put("PaymentTerms","NET40");
			requestBody.put("TaxExempt","false");
			requestBody.put("Currency","USD");
			
			requestBody.put("BillToPerson.EmailAddress","fred.flintstone@bedrock.com");
			requestBody.put("BillToPerson.FirstName","Fred");
			requestBody.put("BillToPerson.LastName","Flintstone");
			requestBody.put("BillToPerson.StreetLine1","1829 Pine Hall Rd.");
			requestBody.put("BillToPerson.StreetLine2","");
			requestBody.put("BillToPerson.StreetLine3","");
			requestBody.put("BillToPerson.City","State College");
			requestBody.put("BillToPerson.Region","PA");
			requestBody.put("BillToPerson.Country","US");
			
			requestBody.put("ShipToPerson.EmailAddress","barney.rubble@bedrock.com");
			requestBody.put("ShipToPerson.FirstName","Barney");
			requestBody.put("ShipToPerson.LastName","Rubble");
			requestBody.put("ShipToPerson.StreetLine1","1829 Pine Hall Rd.");
			requestBody.put("ShipToPerson.StreetLine2","");
			requestBody.put("ShipToPerson.StreetLine3","");
			requestBody.put("ShipToPerson.City","State College");
			requestBody.put("ShipToPerson.Region","PA");
			requestBody.put("ShipToPerson.Country","US");
			
			
			httprequest.header("content-type","application/jason");
			httprequest.body(requestBody.toJSONString()); //attaching data to request
			
			Response response = httprequest.request(Method.POST,"/order");//post request will be sent
			
			//asserting   status code is 400 from response
			String responsebody=response.getBody().toString();
			System.out.println("Response body is" +responsebody);
			
			
				int statusCode=response.getStatusCode();
				System.out.println("status code"+statusCode);
				Assert.assertEquals(statusCode,400);
	}
}


