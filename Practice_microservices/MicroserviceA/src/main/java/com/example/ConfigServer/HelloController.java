package com.example.ConfigServer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/a")
public class HelloController {
	
	@Value("${microservice.b.url}")
	private String bMicroserviceUrl;

	@GetMapping(path = "/hello")
	public ResponseEntity<String> hello() {
		return new ResponseEntity<>("Hello From A", HttpStatus.OK);
	}
	
	@GetMapping(path = "/hellob")
	public ResponseEntity<String> helloB() {
		RestTemplate rs = new RestTemplate();
		
		ResponseEntity<String> result = rs.getForEntity(bMicroserviceUrl, String.class);
		if (result.getStatusCode().equals(HttpStatus.OK)) {
			return result;
		}
		
		return new ResponseEntity<>("Error While calling B", HttpStatus.OK);
	}
	
}
