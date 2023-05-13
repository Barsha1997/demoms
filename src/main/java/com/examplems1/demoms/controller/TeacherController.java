package com.examplems1.demoms.controller;

import com.examplems1.demoms.model.Teacher;
import com.examplems1.demoms.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teachers")
    public List<Teacher> getAll(){
        return teacherService.getAll();
    }

    @GetMapping("/teacher")
    public Teacher getTeacher(){
        return teacherService.getTeacher();
    }

}
