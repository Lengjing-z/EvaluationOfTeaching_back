package org.wrrrrrrry.evaluationteaching.service;

import org.wrrrrrrry.evaluationteaching.entity.Question;
import org.wrrrrrrry.evaluationteaching.entity.Questionnaire;

import java.util.List;
import java.util.Map;

public interface ToEService {
    List<Questionnaire> queryFinishedQuestionnaire(String code,boolean isStudent);


    List<Map<String, String>> queryFinishedDetailById(int id,boolean isStudent);

    List<Questionnaire> queryStudentProgressingQuestionnaire(String code);

    List<Questionnaire> queryTeacherProgressingQuestionnaire(String code);

    List<Question> queryStudentProgressingDetailById(int id);

    List<Question> queryTeacherProgressingDetailById(int id);
}
