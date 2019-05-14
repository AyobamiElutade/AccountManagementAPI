package PostBlockAccount;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
//import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;

//import static org.hamcrest.Matchers.equalTo;

public class Status400Validation {

	
@Test

public void Test (){
	

	String BlockAccountPath = "/api/v1/account/3074123890/block";
	
	//BaseUrl or Host
			RestAssured.baseURI = "https://accountmanagemenv2.azurewebsites.net";
			RestAssured.registerParser("text/plain", Parser.TEXT);
		
      
            //Response extractor	
			Response res=given().header("Content-Type", "application/json").
		body("{"+
  "\"lockType\": \"PND\","+
  "\"blockActionReason\": "+
"}").	
					 
      when().
      post(BlockAccountPath).
      then().assertThat().statusCode(400).//and().contentType(ContentType.TEXT).
      //contentType(ContentType.JSON).and().
      //body("status",equalTo("OK")).
      extract().response();
			String resresponse = res.asString();
			System.out.println(resresponse);
	
	
}
	
	
}
