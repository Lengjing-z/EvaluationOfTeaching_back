package org.wrrrrrrry.evaluationteaching.service;

import org.wrrrrrrry.evaluationteaching.entity.Index;

import java.util.List;
import java.util.Map;

public interface QuestionnaireService {
    boolean createQuestionnaire(Map questionnaire);

    int createIndicator(List<Index> indexList);


    int deleteIndicator(Index index);

    List<Index> allIndicator();


    List<Index> queryDetail(Index index);
}
