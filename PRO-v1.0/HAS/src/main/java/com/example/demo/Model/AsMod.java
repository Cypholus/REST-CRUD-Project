package com.example.demo.Model;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="AppServData")
public class AsMod {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String ProdName;
    private String ModName;
    private String Description;
    private String Solution;
    private int ServCharge;
    private long phoneNumber;
    private Date ServDate;
    

	public AsMod(int id, String prodName, String modName, String description, String solution, int servCharge,
			long phoneNumber, Date servDate) {
		super();
		Id = id;
		ProdName = prodName;
		ModName = modName;
		Description = description;
		Solution = solution;
		ServCharge = servCharge;
		this.phoneNumber = phoneNumber;
		ServDate = servDate;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getProdName() {
		return ProdName;
	}


	public void setProdName(String prodName) {
		ProdName = prodName;
	}


	public String getModName() {
		return ModName;
	}


	public void setModName(String modName) {
		ModName = modName;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public String getSolution() {
		return Solution;
	}


	public void setSolution(String solution) {
		Solution = solution;
	}


	public int getServCharge() {
		return ServCharge;
	}


	public void setServCharge(int servCharge) {
		ServCharge = servCharge;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public Date getServDate() {
		return ServDate;
	}


	public void setServDate(Date servDate) {
		ServDate = servDate;
	}


	public AsMod() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}