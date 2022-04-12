package com.models;

import javax.persistence.*;


@Entity
@Table(name = "`Hospital`")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HospitalID")
    private int hospitalId;

    @Column(name= "HospitalName")
    private String hospitalName;

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setBookName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}




