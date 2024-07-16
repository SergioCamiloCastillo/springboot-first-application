package com.scastillonu.primeraweb.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_people")
public class Person {
    @Id
    private long id;
    private String name;
    private int edad;


}
