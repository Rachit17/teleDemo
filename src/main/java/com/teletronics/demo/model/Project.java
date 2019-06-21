package com.teletronics.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Project {
	private final long id;
	private final String name;
	private final String full_name;
	private final String html_url;
	private final String description;
	
	public Project(long id, String name, String full_name, String html_url, String description) {
		super();
		this.id = id;
		this.name = name;
		this.full_name = full_name;
		this.html_url = html_url;
		this.description = description;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the full_name
	 */
	public String getFull_name() {
		return full_name;
	}

	/**
	 * @return the html_url
	 */
	public String getHtml_url() {
		return html_url;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	
}
