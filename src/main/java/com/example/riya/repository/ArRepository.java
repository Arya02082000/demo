package com.example.riya.repository;

import com.example.riya.entity.ArEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;

@Repository
public interface ArRepository extends JpaRepository<ArEntity,Long> {
}
