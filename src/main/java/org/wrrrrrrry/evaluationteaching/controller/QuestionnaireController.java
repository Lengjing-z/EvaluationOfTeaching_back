package org.wrrrrrrry.evaluationteaching.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wrrrrrrry.evaluationteaching.entity.*;
import org.wrrrrrrry.evaluationteaching.entity.Index;
import org.wrrrrrrry.evaluationteaching.service.QuestionnaireService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("admin")
public class QuestionnaireController {

    @Autowired
    QuestionnaireService questionnaireService;

    @RequestMapping("questionnaire/create")
    public boolean createQuestionnaire(@RequestBody Questionnaire questionnaire) {
        return questionnaireService.createQuestionnaire(questionnaire);
    }

    @RequestMapping("questionnaire/all/{start}/{length}")
    public List<Questionnaire> queryAllQuestionnaire(@PathVariable String start, @PathVariable String length) {
        return questionnaireService.allQuestionnaire(start,length);
    }

    @RequestMapping("questionnaire/detail")
    public Map<String,Object> queryQuestionnaireDetail(Integer qnId) {
        return questionnaireService.queryQuestionnaireDetail(qnId);
    }

    @RequestMapping("questionnaire/delete")
    public int deleteQuestionnaire(Integer qnId) {
        return questionnaireService. deleteQuestionnaire(qnId);
    }

    @RequestMapping("questionnaire/release/institute")
    public boolean releaseQuestionnaireInstitute(@RequestBody List<TeacherToTeacher> ttts) {
        return questionnaireService.releaseQuestionnaireInstitute(ttts);
    }

    @RequestMapping("questionnaire/release/course")
    public boolean releaseQuestionnaireCourse(@RequestBody List<StudentToTeacher> stts) {
        return questionnaireService.releaseQuestionnaireCourse(stts);
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
        return questionnaireService.queryIndicatorDetail(index);
    }


}
