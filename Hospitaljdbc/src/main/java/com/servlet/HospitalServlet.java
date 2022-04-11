package com.servlet;

import com.model.Hospital;
import com.database.ToConnection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.service.HospitalService;
import com.service.HospitalServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;



public class HospitalServlet extends HttpServlet {
    private  static final Gson gson = new GsonBuilder().create();
    private static Logger logger = LoggerFactory.getLogger(HospitalServlet.class);

    private static HospitalService hospitalService = new HospitalServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  {
        try {
            List<Hospital> list =  hospitalService.getHospital();
            resp.setStatus(201);
            resp.setHeader("Content-Type","application/json");
            resp.getOutputStream().println(gson.toJson(list));

        } catch (Exception e) {
            logger.info(e.toString());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        try{
            Hospital hospital = gson.fromJson(req.getReader(), Hospital.class);
            hospitalService.createHospital(hospital);
            resp.setStatus(201);
            resp.setHeader("Content-Type","application/json");
            resp.getOutputStream().println(gson.toJson(hospital));
        } catch (Exception e ) {
            logger.info(e.toString());
        }

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp)  {
        try {
            Hospital hospital = gson.fromJson(req.getReader(), Hospital.class);
            hospitalService.updateHospital(hospital);
            resp.setStatus(201);
            resp.setHeader("Content-Type","application/json");
            resp.getOutputStream().println(gson.toJson(hospital));
        } catch (Exception e) {
            logger.info(e.toString());
        }

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp)  {
        try {
            int id=Integer.parseInt(req.getPathInfo().replace("/",""));
            hospitalService.deleteHospital(id);
            resp.setStatus(201);
            resp.getOutputStream().println(gson.toJson("Successfully Deleted"));
        }catch (Exception e){
            logger.info(e.toString());
        }
    }
}