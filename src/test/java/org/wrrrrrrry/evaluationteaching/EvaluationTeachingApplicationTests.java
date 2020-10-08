package org.wrrrrrrry.evaluationteaching;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.wrrrrrrry.evaluationteaching.entity.Clazz;
import org.wrrrrrrry.evaluationteaching.entity.Index;
import org.wrrrrrrry.evaluationteaching.entity.TeacherToTeacher;
import org.wrrrrrrry.evaluationteaching.entity.User;
import org.wrrrrrrry.evaluationteaching.mapper.*;
import org.wrrrrrrry.evaluationteaching.service.PublicMessageService;
import org.wrrrrrrry.evaluationteaching.service.QuestionnaireService;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class EvaluationTeachingApplicationTests {

    @Autowired
    QuestionnaireService questionnaireService;
    @Test
    void contextLoads() throws SQLException {
        List<TeacherToTeacher> teacherToTeachers = new ArrayList<>();
        teacherToTeachers.add(TeacherToTeacher.builder().qnId(9).inId(1001).beginTime(new Date()).endTime(new Date()).build());
        teacherToTeachers.add(TeacherToTeacher.builder().qnId(9).inId(1002).beginTime(new Date()).endTime(new Date()).build());
        teacherToTeachers.add(TeacherToTeacher.builder().qnId(9).inId(1003).beginTime(new Date()).endTime(new Date()).build());
        questionnaireService.releaseQuestionnaireInstitute(teacherToTeachers);
    }

}
