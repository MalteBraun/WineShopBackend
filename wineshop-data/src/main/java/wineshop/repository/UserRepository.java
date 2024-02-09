package de.malte.wineshopbackend;

import org.springframework.data.repository.CrudRepository;
import de.malte.wineshopbackend.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
