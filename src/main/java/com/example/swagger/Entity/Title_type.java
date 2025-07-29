package com.example.swagger.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Title_type")
public class Title_type {
	@Id
    @Column(name = "Code", length = 100, nullable = false)
    private String TitleTypeId;

    @Column(name = "Description")
    private String TitleTypeName;
    
    @Column(name = "Change_date")
    private LocalDateTime ChangeDate;

    @Column(name = "Change_name")
    private String ChangeName;
    
    @Column(name = "Expired", columnDefinition = "CHAR(1)")
    private String Expired;

	public String getTitleTypeId() {
		return TitleTypeId;
	}

	public void setTitleTypeId(String titleTypeId) {
		TitleTypeId = titleTypeId;
	}

	public String getTitleTypeName() {
		return TitleTypeName;
	}

	public void setTitleTypeName(String titleTypeName) {
		TitleTypeName = titleTypeName;
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
