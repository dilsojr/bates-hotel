package br.com.apex.bates_hotel.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Price {

	@Column (scale = 2)
	private BigDecimal value;
	private Roomtype roomtype;
	
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public Roomtype getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(Roomtype roomtype) {
		this.roomtype = roomtype;
	}
	
	
	
	
	
	
}