package se.chasacademy.databaser.jpaorders.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import se.chasacademy.databaser.jpaorders.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}