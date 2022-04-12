package com.service;

import com.models.Hospital;


import java.util.List;

public interface HospitalService {
    List<Hospital> getHospital();
    Hospital getHospitalById(int hospitalId);
    Hospital createHospital(Hospital hospital);
    Hospital updateHospital(Hospital hospital);
}
