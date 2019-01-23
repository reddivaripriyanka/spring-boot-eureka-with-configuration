
package com.capgemini.website.Websiteservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Controller
public class controller {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/")
	public String helloworld(Model model) {
		String output = restTemplate
				.exchange("http://first", HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
				}).getBody();
		model.addAttribute("priya", output);
		return "demo";
	}

	/*
	 * @RequestMapping public String demo() {
	 * 
	 * return "demo"; }
	 */

}
