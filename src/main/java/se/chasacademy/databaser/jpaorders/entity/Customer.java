package se.chasacademy.databaser.jpaorders.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "T_CUSTOMER")
public class Customer {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "CUST_ID")
    private Long id;

@Column(name = "CUST_FIRST_NAME", nullable = false)
    private String firstName;

@Column(name = "CUST_LAST_NAME", nullable = false)
    private String lastName;

@Column(name = "EMAIL_ADDR", nullable = false, unique = true)
    private String email;

@Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

// Getters & Setters
    public Long getId() {return id;}

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public LocalDateTime getCreatedAt() {return createdAt;}
}
