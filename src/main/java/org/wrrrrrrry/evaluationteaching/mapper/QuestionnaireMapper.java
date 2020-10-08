package org.wrrrrrrry.evaluationteaching.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.wrrrrrrry.evaluationteaching.entity.*;

import java.util.List;

@Repository
public interface QuestionnaireMapper {

    int addIndicator(@Param("list") List<Index> indexList);

    int queryCurrentMaxId();

    int deleteIndicator(@Param("indicator") Index index);

    List<Index> queryAllIndicator();

    List<Index> queryIndicatorsByPaNode(@Param("parent") Index index);

    int addQuestionnaire(@Param("qn") Questionnaire questionnaire);

    int addQuestions(@Param("qn") Questionnaire questionnaire);

    List<Questionnaire> queryAllQuestionnaire(@Param("start") String start, @Param("length") String length);

    List<Question> queryQuestionsByQnId(@Param("qnId") Integer qnId);

    Index queryIndicatorRootById(@Param("index") Index index);

    Index queryIndicatorRootByQnId(@Param("qnId") Integer qnId);

    int deleteQuestionnaire(Integer qnId);

    int addTTT(List<TeacherToTeacher> ttts);

    List<User> queryTeachersByInids(List<TeacherToTeacher> ttts);

    int addMessages(List<Message> messages);

    int addSTT(List<StudentToTeacher> stts);

    List<User> queryStudentByCCT(List<StudentToTeacher> stts);
}
