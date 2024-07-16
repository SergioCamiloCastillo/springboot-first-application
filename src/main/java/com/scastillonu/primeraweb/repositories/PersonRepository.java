package com.scastillonu.primeraweb.repositories;

import com.scastillonu.primeraweb.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //estereotipos
public interface PersonRepository extends JpaRepository<Person, Long> {

}
