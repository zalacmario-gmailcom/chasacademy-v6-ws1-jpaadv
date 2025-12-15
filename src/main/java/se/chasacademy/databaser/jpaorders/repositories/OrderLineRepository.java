package se.chasacademy.databaser.jpaorders.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import se.chasacademy.databaser.jpaorders.entity.OrderLine;

public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {
}