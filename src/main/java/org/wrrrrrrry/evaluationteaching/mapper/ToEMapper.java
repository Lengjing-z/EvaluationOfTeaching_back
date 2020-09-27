package org.wrrrrrrry.evaluationteaching.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.wrrrrrrry.evaluationteaching.controller.Questionnaire;

import java.util.List;
import java.util.Map;

@Repository
public interface ToEMapper {
    List<Questionnaire> selectStudentFinishedQuestionnaire(@Param("code") String code);

    List<Questionnaire> selectTeacherFinishedQuestionnaire(@Param("code") String code);

    Map<String, String> selectFinishedDetailById(@Param("id") int id);
}
