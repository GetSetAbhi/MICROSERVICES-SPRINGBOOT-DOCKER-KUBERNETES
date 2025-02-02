package com.example.ConfigServer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/b")
public class HelloController {
	
	@Value("${microservice.a.url}")
	private String aMicroserviceUrl;

	@GetMapping(path = "/hello")
	public ResponseEntity<String> hello() {
		return new ResponseEntity<>("Hello From B", HttpStatus.OK);
	}
	
	@GetMapping(path = "/helloa")
	public ResponseEntity<String> helloB() {
		RestTemplate rs = new RestTemplate();
		
		ResponseEntity<String> result = rs.getForEntity(aMicroserviceUrl, String.class);
		if (result.getStatusCode().equals(HttpStatus.OK)) {
			return result;
		}
		
		return new ResponseEntity<>("Error While calling A", HttpStatus.OK);
	}
	
}
