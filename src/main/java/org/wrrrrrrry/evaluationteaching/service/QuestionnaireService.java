package org.wrrrrrrry.evaluationteaching.service;

import org.wrrrrrrry.evaluationteaching.entity.*;

import java.util.List;
import java.util.Map;

public interface QuestionnaireService {
    boolean createQuestionnaire(Questionnaire questionnaire);

    List<Questionnaire> allQuestionnaire(String start, String length);

    Map<String, Object> queryQuestionnaireDetail(Integer qnId);

    int deleteQuestionnaire(Integer index);

    boolean releaseQuestionnaireInstitute(List<TeacherToTeacher> ttts);

    Object releaseQuestionnaireCourse(int questionnaireId, List<Course> courses);

    Object getStudentQuestionnaireDetail(int questionnaireId);

    int createIndicator(List<Index> indexList);


    int deleteIndicator(Index index);


    List<Index> allIndicator();


    List<Index> queryIndicatorDetail(Index index);
}
