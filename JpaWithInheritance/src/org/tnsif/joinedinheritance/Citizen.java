package org.tnsif.joinedinheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Citizen")
public class Citizen extends Student{
	private String citizenType;
	private Integer cardno;
	public String getCitizenType() {
		return citizenType;
	}
	public void setCitizenType(String citizenType) {
		this.citizenType = citizenType;
	}
	public Integer getCardno() {
		return cardno;
	}
	public void setCardno(Integer cardno) {
		this.cardno = cardno;
	}
	

}