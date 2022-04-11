package com.service;

import com.model.Hospital;
import java.util.List;

public interface HospitalService {
    List<Hospital> getHospital();
    Hospital createHospital(Hospital hospital);
    Hospital updateHospital(Hospital hospital);
    Hospital deleteHospital(int HospitalId);
}
