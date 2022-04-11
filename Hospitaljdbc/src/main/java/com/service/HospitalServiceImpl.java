package com.service;

import com.database.ToConnection;
import com.model.Hospital;


import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


  public class HospitalServiceImpl implements HospitalService{

      @Override
      public List<Hospital> getHospital() {
          List<Hospital> HospitalList = new ArrayList<>();
          try {
              ResultSet resultSet = ToConnection.getHospitalList();
              while (resultSet.next()) {
                  Hospital hospital = new Hospital();
                  hospital.setHospitalId(resultSet.getInt(1));
                  hospital.setHospitalName(resultSet.getString(2));
                  hospital.setAddress(resultSet.getString(3));
                  hospital.setCity(resultSet.getString(4));
                  HospitalList.add(hospital);
              }
          } catch (Exception e) {
           System.out.println(e);
          }
          return HospitalList;
      }

      @Override
    public Hospital createHospital(Hospital hospital) {
        try {
            ResultSet resultSet = ToConnection.createHospitalList(hospital);
        } catch (Exception e){
            System.out.println(e);
        }
        return hospital;
    }

    @Override
    public Hospital updateHospital(Hospital hospital) {
        try {
            ResultSet resultSet = ToConnection.updateHospitalList(hospital);

        } catch (Exception e) {
           System.out.println(e);
        }
        return hospital;
    }
    @Override
    public Hospital deleteHospital(int id ) {
        try {
            ResultSet resultSet = ToConnection.deleteHospitalList(id);
        }catch (Exception e) {
            System.out.println(e);
        }
        return null;
      }
  }


