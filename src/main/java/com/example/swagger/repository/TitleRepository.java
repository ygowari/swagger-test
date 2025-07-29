package com.example.swagger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.swagger.Entity.Title;

import com.example.swagger.DTO.TitleView;

@Repository
public interface TitleRepository extends JpaRepository<Title, String> {

	@Query(value = """
			SELECT
			    MT.code AS titleId,
			    MT.description AS titleName,
			    MT.Release_date AS releaseDate,
			    MT.Release_week AS releaseWeek,
			    TT.description AS titleType,
			    D.Description AS distributor,
			    MTM.description AS Season_name
			FROM
			    master_title MT
			JOIN
			    title_type  TT ON MT.Code_Title_type = TT.code AND TT.expired = 'n'
			JOIN
			    distributor D ON MT.Code_Distributor = D.Code
			LEFT JOIN
			    master_title MTM ON MT.code_title_master = MTM.code;
			""", nativeQuery = true)
	List<TitleView> fetchTitleDetails();
}



