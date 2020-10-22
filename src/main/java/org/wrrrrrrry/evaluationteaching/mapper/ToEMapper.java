package org.wrrrrrrry.evaluationteaching.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.wrrrrrrry.evaluationteaching.entity.Question;
import org.wrrrrrrry.evaluationteaching.entity.Questionnaire;
import org.wrrrrrrry.evaluationteaching.entity.StudentAnswer;
import org.wrrrrrrry.evaluationteaching.entity.TeacherAnswer;

import java.util.List;
import java.util.Map;

@Repository
public interface ToEMapper {
    List<Questionnaire> selectStudentFinishedQuestionnaire(@Param("code") String code);

    List<Questionnaire> selectTeacherFinishedQuestionnaire(@Param("code") String code);

    List<Map<String, String>> selectStudentFinishedDetailById(@Param("id") int id,@Param("code") String code);

    List<Map<String, String>> selectTeacherFinishedDetailById(@Param("id") int id,@Param("code") String code);

    List<Questionnaire> selectStudentProgressingQuestionnaire(@Param("code") String code);

    List<Questionnaire> selectTeacherProgressingQuestionnaire(@Param("code") String code);

    List<Question> selectStudentProgressingDetailById(@Param("id") int id);

    List<Question> selectTeacherProgressingDetailById(@Param("id") int id);

    int insertStudentAnswer(@Param("studentAnswers") List<StudentAnswer> studentAnswers);

    int insertTeacherAnswer(@Param("teacherAnswers") List<TeacherAnswer> teacherAnswers);

    List<Map> selectEvaluationInstituteList(String code);

    List<Map> selectEvaluationCourseList(String code);

    int updateStudentMessage(@Param("code") String code,@Param("sttId") int sttId);

    int updateTeacherMessage(@Param("uId") int uId,@Param("tttId") int tttId,@Param("targetId") int targetId);

    List<Map> selectbECoPro(int sttId);

    List<Map> selectbEInPro(@Param("tttId") int tttId,@Param("code") String code);

    List<Map> selectBECoDetail(int sttId);

    List<Map> selectBEInDetail(int tttId);

    List<Map> selectStudentEvaluationList();

    List<Map> selectTeacherEvaluationList();

    List<Map> selectAETD(int tttId);

    List<Map> selectAETP(int tttId);

    List<Map> selectAESD(int sttId);

    List<Map> selectAESP(int sttId);
}
