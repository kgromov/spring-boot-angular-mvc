package com.examples.angular.repositories;

import com.examples.angular.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
