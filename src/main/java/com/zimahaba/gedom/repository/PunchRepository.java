package com.zimahaba.gedom.repository;

import com.zimahaba.gedom.entity.Punch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PunchRepository extends JpaRepository<Punch, Long> {
}
