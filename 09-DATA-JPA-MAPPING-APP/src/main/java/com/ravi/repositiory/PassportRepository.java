package com.ravi.repositiory;

import com.ravi.utilities.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<Passport,Integer> {
}
