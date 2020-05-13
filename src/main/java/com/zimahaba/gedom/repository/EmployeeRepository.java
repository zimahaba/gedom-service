package com.zimahaba.gedom.repository;

import com.zimahaba.gedom.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("FROM Employee WHERE employer.id = :employerId")
    List<Employee> findByEmployerId(@Param("employerId") Long employerId);

}
