package org.wrrrrrrry.evaluationteaching.service;

import org.wrrrrrrry.evaluationteaching.entity.Question;
import org.wrrrrrrry.evaluationteaching.entity.Questionnaire;
import org.wrrrrrrry.evaluationteaching.entity.StudentAnswer;
import org.wrrrrrrry.evaluationteaching.entity.TeacherAnswer;

import java.util.List;
import java.util.Map;

public interface ToEService {
    List<Questionnaire> queryFinishedQuestionnaire(String code,boolean isStudent);

    List<Map<String, String>> queryFinishedDetailById(int id,boolean isStudent,String code);

    List<Questionnaire> queryStudentProgressingQuestionnaire(String code);

    List<Questionnaire> queryTeacherProgressingQuestionnaire(String code);

    List<Question> queryStudentProgressingDetailById(int id);

    List<Question> queryTeacherProgressingDetailById(int id);

    int insertStudentAnswer(List<StudentAnswer> studentAnswers,String code);

    List<Map> getBeEvaluationInstituteList(String code);

    int insertTeacherAnswer(List<TeacherAnswer> teacherAnswers);

    Map bEInDe(int tttId);

    List<Map> bEInPro(int tttId, String code);

    List<Map> getBeEvaluationCourseList(String code);

    Map bECoDe(int cctId);

    List<Map> bECoPro(int cctId);

    List<Map> getStudentEvaluationList();

    List<Map> getTeacherEvaluationList();

    List<Map> aeTD(int tttId);

    List<Map> aeTP(int tttId);

    List<Map> aeSD(int sttId);

    List<Map> aeSP(int sttId);
}
