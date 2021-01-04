package com.examples.angular.repositories;

import com.examples.angular.domain.User;
import com.examples.angular.domain.UserProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource(excerptProjection = UserProjection.class)
public interface UserRepository extends CrudRepository<User, Long> {

}
