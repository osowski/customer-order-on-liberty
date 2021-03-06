package org.pwte.example.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Basic;


@Entity
@DiscriminatorValue("RESIDENTIAL")
public class ResidentialCustomer extends AbstractCustomer implements
		Serializable {

	public ResidentialCustomer() {
		// TODO Auto-generated constructor stub
	}
	
	@Column(name="RESIDENTIAL_HOUSEHOLD_SIZE")
	protected short householdSize;
	
	
	@Column(name="RESIDENTIAL_FREQUENT_CUSTOMER")
	protected boolean frequentCustomer;


	public short getHouseholdSize() {
		return householdSize;
	}


	public void setHouseholdSize(short householdSize) {
		this.householdSize = householdSize;
	}


	public boolean isFrequentCustomer() {
		return frequentCustomer;
	}


	public void setFrequentCustomer(boolean frequentCustomer) {
		this.frequentCustomer = frequentCustomer;
	}


	
	
	
}
