package com.example.swagger.DTO;

import java.sql.Date;

public interface TitleView {
		

	String getTitleId();
    String getTitleName();
    Date getReleaseDate();
    Date getReleaseWeek();
    String getTitleType();
    String getDistributor();
    String getTitleMasterDescription();


}
