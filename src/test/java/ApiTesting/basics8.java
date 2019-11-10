package ApiTesting;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import static io.restassured.RestAssured.given;

import ApiTesting.Test.ReusableMethods;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.response.Response;
public class basics8 extends basics7{
	Properties prop=new Properties();
	@BeforeTest
	public void getData() throws IOException
	{
		
		FileInputStream fis=new FileInputStream("D:\\QA\\Selenium learning\\src\\test\\java\\ApiTesting\\Test\\env.properties");
		prop.load(fis);
		
		//prop.get("HOST");
	}
	@Test
	public void JiraAPIUpdate()
	{
		//Creating Issue/Defect
	
		RestAssured.baseURI= "http://localhost:8080";
		Response res=given().header("Content-Type", "application/json").
		header("Cookie","JSESSIONID="+ ReusableMethods.getSessionKEY()).
		pathParams("commentid","10103").
		
		body("{ \"body\": \"Updating comment from the automation code\","+
    "\"visibility\": {"+
        "\"type\": \"role\","+
        "\"value\": \"Administrators\" }"+
"}").when().
		put("/rest/api/2/issue/10207/comment/{commentid}").then().statusCode(200).extract().response();
	
		
		
		
		
		
		
		
		
		  
	}
				
		
		
		
		}
	
