package com.zimahaba.gedom.repository;

import com.zimahaba.gedom.entity.Month;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonthRepository extends JpaRepository<Month, Long> {

    @Query(" SELECT m FROM Month m WHERE employee.id = :employeeId ")
    List<Month> findAllByEmployeeId(@Param("employeeId") Long employeeId);
}
