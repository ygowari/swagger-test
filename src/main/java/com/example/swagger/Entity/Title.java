package com.example.swagger.Entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "Master_title")
public class Title {

    @Id
    @Column(name = "code", nullable = false)
    private String TitleId;

    @Column(name = "description")
    private String TitleName;

    @Column(name = "Release_date")
    private Date ReleaseDate;

    @Column(name = "Release_week")
    private Date ReleaseWeek;
    
    @Column(name = "Code_Title_type")
    private String TitleType;
    
    @Column(name = "Code_Distributor")
    private String CodeDistributor;
    
    @Column(name = "Code_Title_Master")
    private String CodeTitleMaster;

    @Column(name = "Change_date")
    private LocalDateTime ChangeDate;

    @Column(name = "Change_name")
    private String ChangeName;
    
    @Column(name = "Expired", columnDefinition = "CHAR(1)")
    private String Expired;
    
    
	public Title(String titleId, String titleName, Date releaseDate, Date releaseWeek, String titleType,
			String codeDistributor, String codeTitleMaster, LocalDateTime changeDate, String changeName, String expired) {
		super();
		TitleId = titleId;
		TitleName = titleName;
		ReleaseDate = releaseDate;
		ReleaseWeek = releaseWeek;
		TitleType = titleType;
		CodeDistributor = codeDistributor;
		CodeTitleMaster = codeTitleMaster;
		ChangeDate = changeDate;
		ChangeName = changeName;
		Expired = expired;
	}
	
	
	public Title(String titleId, String titleName, Date releaseDate, Date releaseWeek, String titleType,
			String codeDistributor, String codeTitleMaster) {
		super();
		TitleId = titleId;
		TitleName = titleName;
		ReleaseDate = releaseDate;
		ReleaseWeek = releaseWeek;
		TitleType = titleType;
		CodeDistributor = codeDistributor;
		CodeTitleMaster = codeTitleMaster;
	}



	public String getTitleId() {
		return TitleId;
	}

	public void setTitleId(String titleId) {
		TitleId = titleId;
	}

	public String getTitleName() {
		return TitleName;
	}

	public void setTitleName(String titleName) {
		TitleName = titleName;
	}

	public Date getReleaseDate() {
		return ReleaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		ReleaseDate = releaseDate;
	}

	public Date getReleaseWeek() {
		return ReleaseWeek;
	}

	public void setReleaseWeek(Date releaseWeek) {
		ReleaseWeek = releaseWeek;
	}

	public String getTitleType() {
		return TitleType;
	}

	public void setTitleType(String titleType) {
		TitleType = titleType;
	}

	public String getCodeDistributor() {
		return CodeDistributor;
	}

	public void setCodeDistributor(String codeDistributor) {
		CodeDistributor = codeDistributor;
	}

	public String getCodeTitleMaster() {
		return CodeTitleMaster;
	}

	public void setCodeTitleMaster(String codeTitleMaster) {
		CodeTitleMaster = codeTitleMaster;
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
