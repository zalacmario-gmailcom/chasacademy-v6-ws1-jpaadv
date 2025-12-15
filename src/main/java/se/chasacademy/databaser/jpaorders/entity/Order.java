package se.chasacademy.databaser.jpaorders.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "T_ORDER")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ORDER_NUMBER", nullable = false, unique = true)
    private String orderNumber;

    @Column(name = "ORDER_DATE", nullable = false)
    private LocalDate orderDate;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID", nullable = false)
    private Customer customer;

    @Column(name = "STATUS_CODE", nullable = false)
    private String statusCode;

    //constructor
    public Order() {
    }
    public Order(String orderNumber, LocalDate orderDate, Customer customer) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.customer = customer;
    }
    public Order(long id, String orderNumber, LocalDate orderDate, Customer customer){
        this.id = id;
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.customer = customer;
    }

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
