package com.example.riya.service;

import com.example.riya.entity.ArEntity;
import com.example.riya.repository.ArRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service

public class ArService {
    @Autowired
    private ArRepository arRepository;

    public ArEntity save (ArEntity arEntity){
        ArEntity view = arRepository.save(arEntity);
        return view;

}

}


