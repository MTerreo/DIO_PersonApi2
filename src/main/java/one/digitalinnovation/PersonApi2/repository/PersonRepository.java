package one.digitalinnovation.PersonApi2.repository;

import one.digitalinnovation.PersonApi2.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
