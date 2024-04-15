package com.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.institute.entity.StudentInfo;

@Repository
public interface StudentInfoRepository extends JpaRepository<StudentInfo, Integer> {
	
	/*
	 * To Perform DB Operation use following methods
	 * save : use to insert and update the record(s)
	 * find : use to retrieve the the record(s)
	 * delete : use to delete the record(s)
	 */
}
