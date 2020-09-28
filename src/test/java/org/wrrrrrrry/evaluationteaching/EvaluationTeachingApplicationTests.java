package org.wrrrrrrry.evaluationteaching;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.wrrrrrrry.evaluationteaching.entity.Clazz;
import org.wrrrrrrry.evaluationteaching.entity.Index;
import org.wrrrrrrry.evaluationteaching.entity.User;
import org.wrrrrrrry.evaluationteaching.mapper.*;
import org.wrrrrrrry.evaluationteaching.service.PublicMessageService;
import org.wrrrrrrry.evaluationteaching.service.QuestionnaireService;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@SpringBootTest
class EvaluationTeachingApplicationTests {


    @Autowired
    QuestionnaireService questionnaireService;
    @Autowired
    QuestionnaireMapper questionnaireMapper;
    @Test
    void contextLoads() throws SQLException {
        questionnaireService.allIndicator().forEach(item->questionnaireService.deleteIndicator(item));
    }

}
