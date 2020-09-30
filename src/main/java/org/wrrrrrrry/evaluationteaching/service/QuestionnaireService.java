package org.wrrrrrrry.evaluationteaching.service;

import org.wrrrrrrry.evaluationteaching.entity.Course;
import org.wrrrrrrry.evaluationteaching.entity.Index;
import org.wrrrrrrry.evaluationteaching.entity.Institute;

import java.util.List;
import java.util.Map;

public interface QuestionnaireService {
    boolean createQuestionnaire(Map questionnaire);

    List<Index> allQuestionnaire();

    List<Index> queryQuestionnaireDetail(Index index);

    int deleteQuestionnaire(Index index);

    Object releaseQuestionnaireInstitute(int questionnaireId, List<Institute> institutes);

    Object releaseQuestionnaireCourse(int questionnaireId, List<Course> courses);

    Object getStudentQuestionnaireDetail(int questionnaireId);

    int createIndicator(List<Index> indexList);


    int deleteIndicator(Index index);


    List<Index> allIndicator();


    List<Index> queryDetail(Index index);
}
