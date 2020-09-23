package org.wrrrrrrry.evaluationteaching.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wrrrrrrry.evaluationteaching.entity.*;
import org.wrrrrrrry.evaluationteaching.service.AddintroService;

import java.util.List;

@RestController
public class AddIntro {

    @Autowired
    AddintroService addintroService;
    @RequestMapping("/admin/class/create")
    public int createClass(@RequestBody List<Clazz> clazzes){
        return addintroService.insertClass(clazzes);
    }
    @RequestMapping("/admin/course/create")
    public int createCourse(@RequestBody List<Course> courses){
        return addintroService.insertCourse(courses);
    }
    @RequestMapping("/admin/insertInfo/user")
    public int createUser(@RequestBody List<User> users){
        return addintroService.insertUser(users);
    }
    @RequestMapping("/admin/insertInfo/segment/class/submit")
    public int insertStudentToClass(@RequestBody List<ClassStudent> classStudents){
        return addintroService.insertStudentToClass(classStudents);
    }
}
