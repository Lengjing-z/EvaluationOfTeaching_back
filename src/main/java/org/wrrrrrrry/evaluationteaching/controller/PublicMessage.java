package org.wrrrrrrry.evaluationteaching.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wrrrrrrry.evaluationteaching.entity.Clazz;
import org.wrrrrrrry.evaluationteaching.entity.Course;
import org.wrrrrrrry.evaluationteaching.entity.Power;
import org.wrrrrrrry.evaluationteaching.entity.User;
import org.wrrrrrrry.evaluationteaching.service.PublicMessageService;

import java.util.List;

@RestController
public class PublicMessage {

    @Autowired
    PublicMessageService publicMessageService;
    @RequestMapping("/class/enrolled")
    public List<Clazz> getStudentClassByCode(){
        return publicMessageService.queryStudentClass(getUserInfo().getUsername());
    }
    @RequestMapping("/class/taught")
    public List<Clazz> getTeacherClassByCode(){
        return publicMessageService.queryTeacherClass(getUserInfo().getUsername());
    }
    @RequestMapping("/course/enrolled")
    public List<Course> getStudentCourseByCode(){
        return publicMessageService.queryStudentCourse(getUserInfo().getUsername());
    }
    @RequestMapping("/course/taught")
    public List<Course> getTeacherCourseByCode(){
        return publicMessageService.queryTeacherCourse(getUserInfo().getUsername());
    }
    @RequestMapping("admin/power/all")
    public List<Power> getPowers(){
        return publicMessageService.queryPowerAll();
    }
    @RequestMapping("/admin/class/query")
    public List<Clazz> getClassByName(@RequestBody String name){
        return publicMessageService.queryClassByName(name);
    }
    @RequestMapping("/admin/student/query")
    public List<User> getStudentByCode(@RequestBody String code){
        return publicMessageService.queryStudentByCode(code);
    }
    @RequestMapping("/admin/course/query")
    public List<Course> getCourseByname(@RequestBody String name){
        return publicMessageService.queryCourseByName(name);
    }

    public UserDetails getUserInfo(){
        return (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }


}
