package com.controllers;

import com.models.Hospital;
import com.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    @Qualifier("database")
    private HospitalService hospitalService;

    public HospitalController() {

    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Hospital> getHospital() {
        return hospitalService.getHospital();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Hospital getHospitalsById(@PathVariable("id") int hospitalId) {

        return hospitalService.getHospitalById(hospitalId);
    }


    @RequestMapping(method = RequestMethod.POST)
    public Hospital createHospital(@RequestBody Hospital hospital) {
        hospitalService.createHospital(hospital);
        return hospital;
    }
}

