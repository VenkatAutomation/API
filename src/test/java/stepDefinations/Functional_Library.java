 package stepDefinations;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.json.JSONObject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Functional_Library 
{

//	public String uri = "https://gorest.co.in/public/v2/users";
//	Response id;
//	
//	@Given("^Post user$")
//	public void post_user() 
//	{
//		JSONObject jo = new JSONObject();
//		jo.put("name","john123");
//		jo.put("gender","male");
//		jo.put("email","john123@gmail.com");
//		jo.put("status","active");
//		
//		id=given()
//			.headers("Authorization","Bearer "+"f7efb7d9775f3e00e2f2715d847a052047a9dbe8300464ca4279a9544c8abc4a")
//			.contentType(ContentType.JSON)
//			.body(jo.toString())
//			
//			.when()
//			.post(uri);
//	}
//
//	@And("^Get user$")
//	public void get_user() 
//	{
//		given()
//			.headers("Authorization","Bearer "+"f7efb7d9775f3e00e2f2715d847a052047a9dbe8300464ca4279a9544c8abc4a")
//			.contentType(ContentType.JSON)
//			.when()
//			.get(uri+id)
//			.then()
//			.assertThat().statusCode(200)
//			.log().all();
//	}
//
//	@And("^Put user$")
//	public void put_user() 
//	{
//		JSONObject data = new JSONObject();
//		data.put("name","Johnqwerty");
//		data.put("gender","male");
//		data.put("email","Johnqwerty@gmail.com");
//		data.put("status","active");
//		
//		given()
//			.headers("Authorization","Bearer "+"f7efb7d9775f3e00e2f2715d847a052047a9dbe8300464ca4279a9544c8abc4a")
//			.contentType(ContentType.JSON)
//			.body(data.toString())
//			
//			.when()
//			.put(uri+id)
//			
//			.then()
//			.assertThat().statusCode(200)
//			.body("name",equalTo("Johnqwerty"))
//			.body("gender",equalTo("male"))
//			.body("email",equalTo("Johnqwerty@gmail.com"))
//			.body("status",equalTo("active"));
//		
//	}
//
//	@And("^Delete user$")
//	public void delete_user() 
//	{
//		given()
//			.headers("Authorization","Bearer "+"f7efb7d9775f3e00e2f2715d847a052047a9dbe8300464ca4279a9544c8abc4a")
//			.contentType("application/json")
//			
//			.when()
//			.delete(uri+id)
//			
//			.then()
//			.assertThat().statusCode(204)
//			.log().all();
//	}
}
