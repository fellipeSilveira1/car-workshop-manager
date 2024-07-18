package com.fellipe_silveira.car_workshop_manager.models;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String licencePlate;
	private String description;
	private String color;
	
	private Client client;
	
	public Car() {
		
	}
	public Car(String licencePlate, String description, String color, Client client) {
		this.description = description;
		this.licencePlate = licencePlate;
		this.color = color;
		this.client = client;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLicencePlate() {
		return licencePlate;
	}
	public void setLicencePlate(String licencePlate) {
		this.licencePlate = licencePlate;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Client getClient() {
		return client;
	}
	@Override
	public int hashCode() {
		return Objects.hash(licencePlate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(licencePlate, other.licencePlate);
	}
	@Override
	public String toString() {
		return "Car [licencePlate=" + licencePlate + ", description=" + description + ", color=" + color + ", client="
				+ client + "]";
	}
}
