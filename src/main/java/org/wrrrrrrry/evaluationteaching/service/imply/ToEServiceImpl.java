package org.wrrrrrrry.evaluationteaching.service.imply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wrrrrrrry.evaluationteaching.controller.Questionnaire;
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
    public Map<String, String> queryFinishedDetailById(int id) {

        return toEMapper.selectFinishedDetailById(id);
    }

    @Override
    public Object getFinishedCourse() {
        // Todo
        return null;
    }

    @Override
    public Object getFinishedCourseDetail(int studentId, int teacherId) {
        // Todo
        return null;
    }

    @Override
    public Object getFinishedInstitute() {
        // Todo
        return null;
    }

    @Override
    public Object getFinishedInstituteDetail(int reviewerId, int beReviewdId) {
        // Todo
        return null;
    }
}
