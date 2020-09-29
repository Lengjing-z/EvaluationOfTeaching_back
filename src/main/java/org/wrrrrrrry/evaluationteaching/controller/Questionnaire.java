package org.wrrrrrrry.evaluationteaching.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wrrrrrrry.evaluationteaching.entity.Course;
import org.wrrrrrrry.evaluationteaching.entity.Index;
import org.wrrrrrrry.evaluationteaching.entity.Institute;
import org.wrrrrrrry.evaluationteaching.service.QuestionnaireService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("admin")
public class Questionnaire {

    @Autowired
    QuestionnaireService questionnaireService;

    @RequestMapping("questionnaire/create")
    public boolean createQuestionnaire(@RequestBody Map questionnaire) {
        return questionnaireService.createQuestionnaire(questionnaire);
    }

    @RequestMapping("questionnaire/all")
    public List<Index> queryAllQuestionnaire() {
        return questionnaireService.allQuestionnaire();
    }

    @RequestMapping("questionnaire/detail")
    public List<Index> queryQuestionnaireDetail(@RequestBody Index index) {
        return questionnaireService.queryQuestionnaireDetail(index);
    }

    @RequestMapping("questionnaire/delete")
    public int deleteQuestionnaire(@RequestBody Index index) {
        return questionnaireService.deleteQuestionnaire(index);
    }

    @RequestMapping("questionnaire/release/institute")
    public Object releaseQuestionnaireInstitute(int questionnaireId, @RequestBody List<Institute> institutes) {
        return questionnaireService.releaseQuestionnaireInstitute(questionnaireId, institutes);
    }

    @RequestMapping("questionnaire/release/course")
    public Object releaseQuestionnaireCourse(int questionnaireId, @RequestBody List<Course> courses) {
        return questionnaireService.releaseQuestionnaireCourse(questionnaireId, courses);
    }

    @RequestMapping("student/questionnaire/detail")
    public Object getStudentQuestionnaireDetail(int questionnaireId) {
        return questionnaireService.getStudentQuestionnaireDetail(questionnaireId);
    }

    @RequestMapping("indicator/create")
    public int createIndicator(@RequestBody List<Index> indexList) {
        return questionnaireService.createIndicator(indexList);
    }

    @RequestMapping("indicator/delete")
    public int deleteIndicator(@RequestBody Index index) {
        return questionnaireService.deleteIndicator(index);
    }

    @RequestMapping("indicator/all")
    public List<Index> queryAllIndicator() {
        return questionnaireService.allIndicator();
    }

    @RequestMapping("indicator/detail")
    public List<Index> queryDetail(@RequestBody Index index) {
        return questionnaireService.queryDetail(index);
    }


}
