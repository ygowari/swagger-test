package com.example.swagger.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Distributor")
public class Distributor {
	@Id
    @Column(name = "Code", length = 100, nullable = false)
    private String DistributorId;

    @Column(name = "Description")
    private String DistributorName;
    
    @Column(name = "Change_date")
    private LocalDateTime ChangeDate;

    @Column(name = "Change_name")
    private String ChangeName;
    
    @Column(name = "Expired", columnDefinition = "CHAR(1)")
    private String Expired;

	public String getDistributorId() {
		return DistributorId;
	}

	public void setDistributorId(String distributorId) {
		DistributorId = distributorId;
	}

	public String getDistributorName() {
		return DistributorName;
	}

	public void setDistributorName(String distributorName) {
		DistributorName = distributorName;
	}

	public LocalDateTime getChangeDate() {
		return ChangeDate;
	}

	public void setChangeDate(LocalDateTime changeDate) {
		ChangeDate = changeDate;
	}

	public String getChangeName() {
		return ChangeName;
	}

	public void setChangeName(String changeName) {
		ChangeName = changeName;
	}

	public String getExpired() {
		return Expired;
	}

	public void setExpired(String expired) {
		Expired = expired;
	}
	
    
}
