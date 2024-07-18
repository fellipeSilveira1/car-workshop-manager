package com.fellipe_silveira.car_workshop_manager.models;

import java.io.Serializable;
import java.util.Objects;

public class Part implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long code;
	private String description;
	private String value;
	
	public Part() {
		
	}
	public Part(Long code, String description, String value) {
		super();
		this.code = code;
		this.description = description;
		this.value = value;
	}
	public Long getcode() {
		return code;
	}
	public void setcode(Long code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public int hashCode() {
		return Objects.hash(code);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Part other = (Part) obj;
		return Objects.equals(code, other.code);
	}
	@Override
	public String toString() {
		return "Part [code=" + code + ", description=" + description + ", value=" + value + "]";
	}
}
