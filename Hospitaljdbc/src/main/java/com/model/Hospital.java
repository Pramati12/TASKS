package com.model;

public class Hospital {
    private int HospitalId;
    private String HospitalName;
    private String Address;
    private String City;

    public int getHospitalId() {
        return HospitalId;
    }

    public void setHospitalId(int hospitalId) {
        HospitalId = hospitalId;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String hospitalName) {
        HospitalName = hospitalName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
