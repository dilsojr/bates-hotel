package br.com.apex.bates_hotel.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Room {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	private Integer number;
	@Column(scale = 2)
	private BigDecimal dailyValue;
	private Roomtype type;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public BigDecimal getDailyValue() {
		return dailyValue;
	}
	public void setDailyValue(BigDecimal dailyValue) {
		this.dailyValue = dailyValue;
	}
	public Roomtype getType() {
		return type;
	}
	public void setType(Roomtype type) {
		this.type = type;
	}
	
	
}
