package com.hardik.location.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hardik.location.entities.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

	@Query("select type, count(type) from location group by type")  //This is HQL(hibernate query language or JPql -> GPA query against our objects against our entities
	public List<Object[]> findTypeAndTypeCount();

	
}
