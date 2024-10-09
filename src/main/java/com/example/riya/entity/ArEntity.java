package com.example.riya.entity;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RestController;
@Entity
@Table(name="asha")
public class ArEntity {
    public ArEntity(Long id, String name, Long age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public ArEntity() {
    }

    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String name;
    private Long age;
    private String address;
}
