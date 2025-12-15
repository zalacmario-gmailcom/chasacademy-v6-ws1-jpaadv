package se.chasacademy.databaser.jpaorders.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "t_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id")
    private Long id;

    @Column(name = "prod_name", nullable = false)
    private String name;

    @Column(name = "prod_desc")
    private String description;

    @Column(name = "unit_price_cents", nullable = false)
    private Integer unitPriceCents;

    @Column(name = "active_flag", nullable = false)
    private String activeFlag;

    // getters/setters
}
