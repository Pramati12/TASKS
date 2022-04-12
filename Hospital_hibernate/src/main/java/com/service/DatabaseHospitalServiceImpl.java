package com.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.models.Hospital;

@Service("database")
public class DatabaseHospitalServiceImpl implements HospitalService {

    @Autowired
    private SessionFactory sessionFactory;



    @Override
    public List<Hospital> getHospital() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Hospital> hospitalList = session.createQuery("from Hospital", Hospital.class).list();
        transaction.commit();
        session.close();
        return hospitalList;

    }

    @Override
    public Hospital getHospitalById(int hospitalId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Hospital hospital = session.get(Hospital.class, hospitalId);
        transaction.commit();
        session.close();
        return hospital;
    }

    @Override
    public Hospital createHospital(Hospital hospital) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(hospital);
        transaction.commit();
        session.close();
        return hospital;
    }

    @Override
    public Hospital updateHospital(Hospital hospital) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(hospital);
        transaction.commit();
        session.close();
        return hospital;
    }
}

