package com.example.testing.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "employee_id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private long id;

    @Column(name = "employee_name", length = 45)
    private String name;
}
