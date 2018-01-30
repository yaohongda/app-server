package com.app.server;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import net.sf.json.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class AppServerApplicationTests {
	private static final String ROOT_URL = "http://localhost:8080";
	private String access_token;
	
	
	@Autowired
	TestRestTemplate restTemplate;

	@Before
	public void getAccessToken() {
		ResponseEntity<Object> responseEntity = restTemplate.withBasicAuth("my-trusted-client", "secret").exchange(
				ROOT_URL + "oauth/token?grant_type=password&username=admin&password=123456", HttpMethod.POST, null,
				Object.class);
		JSONObject json = JSONObject.fromObject(responseEntity.getBody());
		access_token = "?access_token=" + json.getString("access_token");
		System.out.println("-----------" + access_token + "--------------------------------------------");

	}

	@Test
	public void testUserController() {
		ResponseEntity<Object> response = restTemplate.getForEntity(getUrl("/userList/"), Object.class);
		System.out.println(JSONObject.fromObject(response));
	}

	private String getUrl(String relativePath) {
		return ROOT_URL + relativePath + access_token;
	}
}
