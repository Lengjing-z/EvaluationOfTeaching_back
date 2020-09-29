package org.wrrrrrrry.evaluationteaching.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wrrrrrrry.evaluationteaching.service.QuestionnaireService;

import java.util.List;
import java.util.Map;
import org.wrrrrrrry.evaluationteaching.entity.Index;

@RestController
@RequestMapping("admin")
public class Questionnaire {

    @Autowired
    QuestionnaireService questionnaireService;

    @RequestMapping("questionnaire/create")
    public boolean createQuestionnaire(@RequestBody Map questionnaire){
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

    @RequestMapping("indicator/create")
    public int createIndicator(@RequestBody List<Index> indexList){
        return questionnaireService.createIndicator(indexList);
    }

    @RequestMapping("indicator/delete")
    public int deleteIndicator(@RequestBody Index index){
        return questionnaireService.deleteIndicator(index);
    }

    @RequestMapping("indicator/all")
    public List<Index> queryAllIndicator(){
        return questionnaireService.allIndicator();
    }

    @RequestMapping("indicator/detail")
    public List<Index> queryDetail(@RequestBody Index index){
        return questionnaireService.queryDetail(index);
    }


}
