package com.example;

import org.springframework.core.env.PropertySource;

public class CustomPropertySource extends PropertySource<Object> {

	public CustomPropertySource(String name) {
		super(name);
	}

	@Override
	public Object getProperty(String name) {
	  return "constant-property";
	}
}
