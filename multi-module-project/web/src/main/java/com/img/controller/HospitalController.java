package com.img.controller;

import com.img.exception.UserDefinedException;
import com.img.model.Hospital;
import com.img.service.HospitalService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;


    @PostMapping("/add-hospital")
    public ResponseEntity<?> addHospital(@RequestBody @Valid Hospital hospital) throws UserDefinedException {
        return ResponseEntity.status(HttpStatus.OK).body(hospitalService.addHospital(hospital));
    }

    @GetMapping("/get")
    public List<Hospital> hospitalList() {
        return hospitalService.get();
    }
}
