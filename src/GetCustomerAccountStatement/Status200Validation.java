package GetCustomerAccountStatement;
import io.restassured.RestAssured;
//import static org.hamcrest.Matchers.equalTo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class Status200Validation {
	
	@Test

	public  void Test () {
		// TODO Auto-generated method stub
		
		String QueryCustomerAccountStatement = "/api/v1/account/3074123890/transaction";
		
		//BaseUrl or Host
		RestAssured.baseURI = "https://accountmanagemenv2.azurewebsites.net";
		Response res=given().
		
		
		//Given method where parameters, Request headers and Request cookies.
		
		      param("dateFrom", "2019-01-20 12:00:00").
		      param("dateTo", "2019-01-20 12:00:00").
		      
		      //When method where the Get or Post method is used.
		      when().
		      get(QueryCustomerAccountStatement).
		      
		      // The then method is used for confirming status codes.
		      then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		      extract().response();
		
	String responseString=res.asString();
	System.out.println(responseString);
	} 

	}


