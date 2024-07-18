package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// There is a standard implementation because of JPA

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
