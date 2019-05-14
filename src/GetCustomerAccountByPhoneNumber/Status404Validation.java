package GetCustomerAccountByPhoneNumber;
import io.restassured.RestAssured;
//import static org.hamcrest.Matchers.equalTo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class Status404Validation {
	
	@Test

	public  void Test () {
		// TODO Auto-generated method stub
		
		String QueryCustomerAccountByCIFID = "/api/v1/account/customerid/20212376892";
		
		//BaseUrl or Host
		RestAssured.baseURI = "https://accountmanagemenv2.azurewebsites.net";
		Response res=given().
		
		
		//Given method where parameters, Request headers and Request cookies.
		
		      param("", "").
		      param("", "").
		      
		      //When method where the Get or Post method is used.
		      when().
		      get(QueryCustomerAccountByCIFID).
		      
		      // The then method is used for confirming status codes.
		      then().assertThat().statusCode(404).and().contentType(ContentType.JSON).
		      extract().response();
		
	String responseString=res.asString();
	System.out.println(responseString);
	} 

	}


