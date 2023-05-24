package stepDefinations;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Steps 
{
	
	Response res;
	public String uri="https://gorest.co.in/public/v2/users/";
	
	//JsonPath js = new JsonPath(res.asPrettyString());
	int id ;
	
	@Given("^Post User$")
	public void post_User() 
	{
		JSONObject data = new JSONObject();
		data.put("name","jira");
		data.put("gender","male");
		data.put("email","jira@gmail.com");
		data.put("status","active");
		
		res=given()
			.headers("Authorization","Bearer "+"f7efb7d9775f3e00e2f2715d847a052047a9dbe8300464ca4279a9544c8abc4a")
			.contentType(ContentType.JSON)
			.body(data.toString())
			
			.when()
			.post(uri)
			
			.then()
			.assertThat().statusCode(201)
			.log().all()
			.extract().response()
			;
		//System.out.println("Generaed is is :"+id.asPrettyString());
	}

	@When("^Get User$")
	public void get_User() 
	{
		
		JsonPath js = new JsonPath(res.asPrettyString());
		
	id=js.getInt("id");
		
		
		given()
		.headers("Authorization","Bearer "+"f7efb7d9775f3e00e2f2715d847a052047a9dbe8300464ca4279a9544c8abc4a")
		.contentType(ContentType.JSON)
		.log().all()
		
		.when()
		
		.get(uri+id)
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}

	@Then("^Put User$")
	public void put_User() 
	{
		
		
		JSONObject data = new JSONObject();
		data.put("name","Jira123");
		data.put("gender","male");
		data.put("email","Jira123@gmail.com");
		data.put("status","active");
		
		given()
		.headers("Authorization","Bearer "+"f7efb7d9775f3e00e2f2715d847a052047a9dbe8300464ca4279a9544c8abc4a")
		.contentType(ContentType.JSON)
		.body(data.toString())
		
		.when()
		.put(uri+id)
		
		.then()
		.assertThat().statusCode(200)
		.body("name",equalTo("Jira123"))
		.body("gender",equalTo("male"))
		.body("email",equalTo("Jira123@gmail.com"))
		.body("status",equalTo("active"))
		.log().all();
	}

	@And("^Delete User$")
	public void delete_User() 
	{
		given()
		.headers("Authorization","Bearer "+"f7efb7d9775f3e00e2f2715d847a052047a9dbe8300464ca4279a9544c8abc4a")
		.contentType(ContentType.JSON)
		
		.when()
		.delete(uri+id)
		
		.then()
		.assertThat().statusCode(204)
		.log().all();
	}
}
