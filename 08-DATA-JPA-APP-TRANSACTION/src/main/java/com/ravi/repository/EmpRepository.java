package com.ravi.repository;

import com.ravi.entities.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Emp,Integer> {
}
