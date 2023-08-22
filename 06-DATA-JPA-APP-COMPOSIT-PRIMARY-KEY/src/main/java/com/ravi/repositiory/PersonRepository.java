package com.ravi.repositiory;

import com.ravi.entities.Person;
import com.ravi.entities.PersonPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, PersonPk> {
}
