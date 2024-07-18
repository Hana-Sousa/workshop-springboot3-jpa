package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// There is a standard implementation because of JPA
public interface UserRepository extends JpaRepository<User, Long> {

}
