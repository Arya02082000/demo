package com.example.riya.controller;

import com.example.riya.entity.ArEntity;
import com.example.riya.service.ArService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/div")
public class ArController {
@Autowired
    private ArService arService;
@PostMapping("asha")
    public ArEntity bot (@RequestBody ArEntity arEntity){
    ArEntity save = arService.save(arEntity);
    return save;

    }
}

