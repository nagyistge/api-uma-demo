package com.uma.server.domain.model.scim;

/*
 * Copyright (c) 2014, Gluu
 */

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 * SCIM Custom Attributes
 * 
 * @author Reda Zerrad Date: 07.26.2012
 */
@JsonPropertyOrder({ "name", "values" })
@XmlType(propOrder = { "name", "values" })
public class ScimCustomAttributes {

	private String name;
	private List<String> values;

	public ScimCustomAttributes() {
		name = "";
		values = new ArrayList<String>();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElementWrapper(name = "values")
	@XmlElement(name = "value")
	public List<String> getValues() {
		return this.values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}

}
