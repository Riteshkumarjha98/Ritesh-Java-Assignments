package com.contest.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.contest.model.ShortenUrl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class UrlShorterRestController {

	private Map<String, ShortenUrl> shortenUrlList = new HashMap<>();
	
	@RequestMapping(value="/short-url/create", method=RequestMethod.POST)
	public ResponseEntity<Object> getShortenUrl(@RequestBody ShortenUrl shortenUrl) throws MalformedURLException {
		String randomChar = getRandomChars();
		setShortUrl(randomChar, shortenUrl);
		return new ResponseEntity<Object>(shortenUrl, HttpStatus.OK);
	}
	
	@RequestMapping(value="/s/{randomstring}", method=RequestMethod.GET)
	public void getactualUrl(HttpServletResponse response, @PathVariable("randomstring") String randomString) throws IOException {
		response.sendRedirect(shortenUrlList.get(randomString).getactual_url());
	}

	private void setShortUrl(String randomChar, ShortenUrl shortenUrl) throws MalformedURLException {
		 shortenUrl.setShort_url("http://localhost:8080/s/"+randomChar);
		 shortenUrlList.put(randomChar, shortenUrl);
	}

	private String getRandomChars() {
		String randomStr = "";
		String possibleChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		for (int i = 0; i < 6; i++)
			randomStr += possibleChars.charAt((int) Math.floor(Math.random() * possibleChars.length()));
		return randomStr;
	}
		
}