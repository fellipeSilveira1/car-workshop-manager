package com.fellipe_silveira.car_workshop_manager.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Service implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long orderNumber;
	private Car car;
	private Client client;
	private LocalDate momment;
	private String description;
	private Double laborCost;
	private Double totalValue;
	private List<Part> parts = new ArrayList<>();
	
	public Service() {
		
	}
	public Service(Long orderNumber, Car car, Client client, LocalDate momment, String description) {
		super();
		this.orderNumber = orderNumber;
		this.car = car;
		this.client = client;
		this.momment = momment;
		this.description = description;
	}
	public Long getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public LocalDate getMomment() {
		return momment;
	}
	public void setMomment(LocalDate momment) {
		this.momment = momment;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getLaborCost() {
		return laborCost;
	}
	public void setLaborCost(Double laborCost) {
		this.laborCost = laborCost;
	}
	public Double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	public List<Part> getParts() {
		return parts;
	}
	@Override
	public int hashCode() {
		return Objects.hash(orderNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Service other = (Service) obj;
		return Objects.equals(orderNumber, other.orderNumber);
	}
	@Override
	public String toString() {
		return "Service [orderNumber=" + orderNumber + ", car=" + car + ", client=" + client + ", momment=" + momment
				+ ", description=" + description + ", laborCost=" + laborCost + ", totalValue=" + totalValue + "]";
	}
}
