package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// There is a standard implementation because of JPA

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
