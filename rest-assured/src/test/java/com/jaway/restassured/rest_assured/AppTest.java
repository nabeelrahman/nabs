package com.jaway.restassured.rest_assured;

import static com.jayway.restassured.RestAssured.get;

import java.util.List;

import org.json.JSONException;
import org.json.JSONArray;
import org.testng.Assert;
import org.testng.*;
import org.testng.annotations.Test;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;


import com.jayway.restassured.response.*;

public class AppTest {
	
	String url = "http://restcountries.eu/rest/v1/name/";
	
	@Test(dataProvider = "getData")
	public void getRequestFindCapital(String country, String expected_capital, String expected_region, String expected_trans_it ) throws JSONException{
		
		SoftAssert softAssert = new SoftAssert();
		//Make a request to fetch the capital of norway
		Response resp = get(url + country);
		System.out.println(url + country);
		JSONArray jsonResponse =new JSONArray(resp.asString());
		System.out.println(resp.asString());
		
		//Declare variables
		String actual_capital = jsonResponse.getJSONObject(0).getString("capital"); 
		String actual_region = jsonResponse.getJSONObject(0).getString("region");
		List<Object> actual_translations = resp.jsonPath().getList("translations.it");
		String actual_translations_string  = actual_translations.toString().replaceAll("[\\[\\]]", "");
		System.out.println(actual_translations);
		System.out.println(actual_translations_string);
		
		softAssert.assertEquals(actual_capital, expected_capital);
		softAssert.assertEquals(actual_region, expected_region);
		softAssert.assertEquals(actual_translations_string, expected_trans_it);
		softAssert.assertAll();
	}
	
	 @DataProvider
	     public Object[][] getData() {
	         return new Object[][]{{"Norway", "Oslo","Europe", "Norvegia"}, {"Britain", "London","Europe","Regno Unito"}, {"Bangladesh","Dhaka","Asia","Bangladesh"}};
	     }

}

