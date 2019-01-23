package com.cokid.service;

import com.cokid.bean.Student;

import javax.ws.rs.*;

public interface StudentService {
    @GET
    @Path("/student/{id}")
    @Consumes({"application/json" })
    @Produces({"application/json" })
    public Student getStudentById(@PathParam("id") Integer id);
}
