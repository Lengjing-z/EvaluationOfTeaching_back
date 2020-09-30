package org.wrrrrrrry.evaluationteaching.service.imply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wrrrrrrry.evaluationteaching.entity.Question;
import org.wrrrrrrry.evaluationteaching.entity.Questionnaire;
import org.wrrrrrrry.evaluationteaching.mapper.ToEMapper;
import org.wrrrrrrry.evaluationteaching.service.ToEService;

import java.util.List;
import java.util.Map;

@Service
public class ToEServiceImpl implements ToEService {
    @Autowired
    ToEMapper toEMapper;
    @Override
    public List<Questionnaire> queryFinishedQuestionnaire(String code,boolean isStudent) {
        if (isStudent){
            return toEMapper.selectStudentFinishedQuestionnaire(code);
        }else {
            return toEMapper.selectTeacherFinishedQuestionnaire(code);
        }

    }

    @Override
    public List<Map<String, String>> queryFinishedDetailById(int id,boolean isStudent) {
        if (isStudent){
            return toEMapper.selectStudentFinishedDetailById(id);
        }else {
            return toEMapper.selectTeacherFinishedDetailById(id);
        }
    }

    @Override
    public List<Questionnaire> queryStudentProgressingQuestionnaire(String code) {
        return toEMapper.selectStudentProgressingQuestionnaire(code);
    }

    @Override
    public List<Questionnaire> queryTeacherProgressingQuestionnaire(String code) {
        return toEMapper.selectTeacherProgressingQuestionnaire(code);
    }

    @Override
    public List<Question> queryStudentProgressingDetailById(int id) {
        return toEMapper.selectStudentProgressingDetailById(id);
    }

    @Override
    public List<Question> queryTeacherProgressingDetailById(int id) {
        return toEMapper.selectTeacherProgressingDetailById(id);
    }
}
