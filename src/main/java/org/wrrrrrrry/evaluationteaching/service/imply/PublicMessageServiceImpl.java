package org.wrrrrrrry.evaluationteaching.service.imply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wrrrrrrry.evaluationteaching.entity.Clazz;
import org.wrrrrrrry.evaluationteaching.entity.Course;
import org.wrrrrrrry.evaluationteaching.entity.Power;
import org.wrrrrrrry.evaluationteaching.entity.User;
import org.wrrrrrrry.evaluationteaching.mapper.PublicMessageMapper;
import org.wrrrrrrry.evaluationteaching.service.PublicMessageService;

import java.util.List;

@Service
public class PublicMessageServiceImpl implements PublicMessageService {
    @Autowired
    PublicMessageMapper publicMessageMapper;
    @Override
    public List<Clazz> queryStudentClass(String username) {

        return publicMessageMapper.selectStudentClassByCode(username);
    }

    @Override
    public List<Clazz> queryTeacherClass(String username) {
        return publicMessageMapper.selectTeacherClassByCode(username);
    }

    @Override
    public List<Course> queryStudentCourse(String username) {
        return publicMessageMapper.selectStudentCourseByCode(username);
    }

    @Override
    public List<Course> queryTeacherCourse(String username) {
        return publicMessageMapper.selectTeacherCourseByCode(username);
    }

    @Override
    public List<Power> queryPowerAll() {
        return publicMessageMapper.selectPowerAll();
    }

    @Override
    public List<Clazz> queryClassByName(String name) {
        return publicMessageMapper.selectClassByName("%"+name+"%");
    }

    @Override
    public List<User> queryStudentByCode(String code) {
        return publicMessageMapper.selectStudentByCode("%"+code+"%");
    }

    @Override
    public List<Course> queryCourseByName(String name) {
        return publicMessageMapper.selectCourseByName("%"+name+"%");
    }

    @Override
    public List<User> queryUserByCode(String code) {

        return publicMessageMapper.selectUserByCode("%"+code+"%");
    }
}
