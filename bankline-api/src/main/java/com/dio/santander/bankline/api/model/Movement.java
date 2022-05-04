package com.dio.santander.bankline.api.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name = "tab_movement")
public class Movement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "date_time")
	private LocalDateTime dateHour;
	private String description;
	private Double value;
	
	@Enumerated(EnumType.STRING)
	private TypeMovement type;
	
	@Column(name = "id_account")
	private Integer idAccount;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getDateHour() {
		return dateHour;
	}
	public void setDateHour(LocalDateTime dateHour) {
		this.dateHour = dateHour;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public TypeMovement getType() {
		return type;
	}
	public void setType(TypeMovement type) {
		this.type = type;
	}
	public Integer getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(Integer idAccount) {
		this.idAccount = idAccount;
	}
}