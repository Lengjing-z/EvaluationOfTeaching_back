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
import org.wrrrrrrry.evaluationteaching.service.ToEService;

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
    ToEService toEService;
    @Test
    void contextLoads() throws SQLException {
    }

}
