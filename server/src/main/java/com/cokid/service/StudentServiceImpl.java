package com.cokid.service;

import com.cokid.bean.Student;
import com.cokid.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student getStudentById(Integer id) {

        return studentMapper.selectByPrimaryKey(id);
    }
}
