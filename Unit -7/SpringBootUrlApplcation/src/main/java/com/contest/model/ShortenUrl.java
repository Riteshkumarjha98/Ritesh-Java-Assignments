package com.contest.model;





public class ShortenUrl {

//	@NotEmpty(message = "Please provide Actual_Url")
	private String actual_url;
	
//	@NotEmpty(message = "Please provide Actual_Url")
	private String short_url;
	
//	@NotEmpty(message = "Please provide Actual_Url")
	private String expiry;
	

	public String getactual_url() {
		return actual_url;
	}

	public void setactual_url(String actual_url) {
		this.actual_url = actual_url;
	}

	public String getShort_url() {
		return short_url;
	}

	public void setShort_url(String short_url) {
		this.short_url = short_url;
	}
}
