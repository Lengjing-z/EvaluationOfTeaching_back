package org.wrrrrrrry.evaluationteaching.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wrrrrrrry.evaluationteaching.entity.*;
import org.wrrrrrrry.evaluationteaching.service.ToEService;

import java.util.List;
import java.util.Map;

@RestController
public class ToE {

    @Autowired
    ToEService toEService;

    @RequestMapping("/evaluation/finishedList")
    public List<org.wrrrrrrry.evaluationteaching.entity.Questionnaire> getFinishedQuestionnaire(){
        return toEService.queryFinishedQuestionnaire(getUserInfo().getUsername(),getUserInfo().getAuthorities().contains(new SimpleGrantedAuthority("ROLE_student")));
    }
    @RequestMapping("/evaluation/detail")
    public List<Map<String,String>> getFinishedDetailById(int id){
            return toEService.queryFinishedDetailById(id,getUserInfo().getAuthorities().contains(new SimpleGrantedAuthority("ROLE_student")),getUserInfo().getUsername());
    }
    @RequestMapping("/evaluation/student/progressing")
    public List<Questionnaire> getStudentProgressingQuestionnaire(){
        return toEService.queryStudentProgressingQuestionnaire(getUserInfo().getUsername());
    }
    @RequestMapping("/evaluation/teacher/progressing")
    public List<org.wrrrrrrry.evaluationteaching.entity.Questionnaire> getTeacherProgressingQuestionnaire(){
        return toEService.queryTeacherProgressingQuestionnaire(getUserInfo().getUsername());
    }
    @RequestMapping("/evaluation/student/detail")
    public List<Question> getStudentProgressingDetail(int id){
        return toEService.queryStudentProgressingDetailById(id);
    }
    @RequestMapping("/evaluation/teacher/detail")
    public List<Question> getTeacherProgressingDetail(int id){
        return toEService.queryTeacherProgressingDetailById(id);
    }

    @RequestMapping("/evaluation/student/submit")
    public int submitStudentAnswer(@RequestBody List<StudentAnswer> studentAnswers){
        return toEService.insertStudentAnswer(studentAnswers,getUserInfo().getUsername());
    }
    @RequestMapping("/evaluation/teacher/submit")
    public int submitTeacherAnswer(@RequestBody List<TeacherAnswer> teacherAnswers){
        return toEService.insertTeacherAnswer(teacherAnswers);
    }

    @RequestMapping("/admin/student/evaluation/list")
    public List<Map> getStudentEvaluationList(){
        return toEService.getStudentEvaluationList();
    }

    @RequestMapping("/admin/teacher/evaluation/list")
    public List<Map> getTeacherEvaluationList(){
        return toEService.getTeacherEvaluationList();
    }

    @RequestMapping("/admin/teacher/evaluation/detail")
    public List<Map> getTeacherEvaluationDetail(int tttId){
        return toEService.aeTD(tttId);
    }

    @RequestMapping("/admin/teacher/evaluation/progress")
    public List<Map> getTeacherEvaluationProgress(int tttId){
        return toEService.aeTP(tttId);
    }

    @RequestMapping("/admin/student/evaluation/progress")
    public List<Map> getStudentEvaluationProgress(int sttId){
        return toEService.aeSP(sttId);
    }

    @RequestMapping("/admin/student/evaluation/detail")
    public List<Map> getStudentEvaluationDetail(int sttId){
        return toEService.aeSD(sttId);
    }

    @RequestMapping("beEvaluation/institute/all")
    public List<Map> beEvaluationInstitute(){
        return toEService.getBeEvaluationInstituteList(getUserInfo().getUsername());
    }

    @RequestMapping("beEvaluation/institute/detail")
    public Map beEvaluationInstituteDetail(int tttId){
        return toEService.bEInDe(tttId);
    }

    @RequestMapping("beEvaluation/institute/progress")
    public List<Map> beEvaluationInstituteProgress(int tttId){
        return toEService.bEInPro(tttId,getUserInfo().getUsername());
    }

    @RequestMapping("beEvaluation/course/all")
    public List<Map> beEvaluationCourse(){
        return toEService.getBeEvaluationCourseList(getUserInfo().getUsername());
    }

    @RequestMapping("beEvaluation/course/detail")
    public Map beEvaluationCourseDetail(int sttId){
        return toEService.bECoDe(sttId);
    }

    @RequestMapping("beEvaluation/course/progress")
    public List<Map> beEvaluationCourseProgress(int sttId){
        return toEService.bECoPro(sttId);
    }



    public UserDetails getUserInfo() {
        return (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
