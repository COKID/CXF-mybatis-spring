package com.cokid;

import com.cokid.bean.Student;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

public class Client {


    @Test
    public void testGet(){
        // 查询一个
        Student student =
                WebClient
                        .create("http://localhost:8080/ws/stuService/student/20190001")
                        .accept(MediaType.APPLICATION_JSON)
                        .get(Student.class);
        System.out.println(student);
    }
}