package com.greatlearning.EMPMAN.EMPAPI.repository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	  List<Employee> findByPublished(boolean published);
	  List<Employee> findByTitleContaining(String title);
	}

