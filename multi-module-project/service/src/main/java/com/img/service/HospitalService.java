package com.img.service;

import com.img.exception.UserDefinedException;
import com.img.model.Hospital;
import com.img.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;

@Service
public class HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    public Hospital addHospital(Hospital hospital) throws UserDefinedException {
        String name = "[a-zA-Z]+";
        try {
            if (Pattern.matches(hospital.getHospitalName(), name)) {
                hospital.setHospitalName(hospital.getHospitalName());
            }
            return hospitalRepository.save(hospital);
        } catch (Exception ex) {
            throw new UserDefinedException();
        }
    }

    public List<Hospital> get() {
        return hospitalRepository.findAll();
    }
}
