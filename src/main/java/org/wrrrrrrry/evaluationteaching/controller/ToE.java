package org.wrrrrrrry.evaluationteaching.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wrrrrrrry.evaluationteaching.service.ToEService;

import java.util.List;
import java.util.Map;

@RestController
public class ToE {

    @Autowired
    ToEService toEService;

    @RequestMapping("/evaluation/finishedList")
    public List<Questionnaire> getFinishedQuestionnaire() {
        return toEService.queryFinishedQuestionnaire(getUserInfo().getUsername(), getUserInfo().getAuthorities().contains(new SimpleGrantedAuthority("ROLE_student")));
    }

    @RequestMapping("/evaluation/detail")
    public Map<String, String> getFinishedDetailById(int id) {
        return toEService.queryFinishedDetailById(id);
    }

    // Todo
    // add /admin prefix
    @RequestMapping("/evaluation/student/detail")
    public Object getStudentEvaluationDetail(int studentId) {
        return toEService.getStudentEvaluationDetail(studentId);
    }

    // Todo
    // add </admin> prefix to the following 4 request mapping
    // mapping one
    @RequestMapping("/beEvaluation/finished/course")
    public Object getFinishedCourse() {
        return toEService.getFinishedCourse();
    }

    // mapping two
    @RequestMapping("/beEvaluation/finished/course/detail")
    public Object getFinishedCourseDetail(int studentId, int teacherId) {
        return toEService.getFinishedCourseDetail(studentId, teacherId);
    }

    // mapping three
    @RequestMapping("/beEvaluation/finished/institute")
    public Object getFinishedInstitute() {
        return toEService.getFinishedInstitute();
    }

    // mapping four
    @RequestMapping("/beEvaluation/finished/institute/detail")
    public Object getFinishedInstituteDetail(int reviewerId, int beReviewedId) {
        return toEService.getFinishedInstituteDetail(reviewerId, beReviewedId);
    }

    public UserDetails getUserInfo() {
        return (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
