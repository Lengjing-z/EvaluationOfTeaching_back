package org.wrrrrrrry.evaluationteaching.service.imply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.wrrrrrrry.evaluationteaching.entity.*;
import org.wrrrrrrry.evaluationteaching.mapper.AddintroMapper;
import org.wrrrrrrry.evaluationteaching.service.AddintroService;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AddintroServiceImpl implements AddintroService {
    @Autowired
    AddintroMapper addintroMapper;

    @Override
    public int insertClass(List<Clazz> clazzes) {
        return addintroMapper.insertClass(clazzes);
    }

    @Override
    public int insertCourse(List<Course> courses) {
        return addintroMapper.insertCourse(courses);
    }

    @Override
    public int insertUser(List<User> users) {
        List list = new ArrayList();
        int res= addintroMapper.insertUser(users);
        users.forEach(item->{
            item.getId();
            item.getPowers().forEach(item1->{
                list.add(new UserPower(item.getId(),item1.getId()));
            });
        });
        System.out.println(list);
        addintroMapper.insertUserPower(list);
        return res;
    }

    @Override
    public int insertStudentToClass(List<ClassStudent> classStudents) {

        return addintroMapper.insertStudentToClass(classStudents);
    }

    @Override
    public int insertTeacherToCourse(List<CourseClassTeacher> courseClassTeachers) {

        return addintroMapper.insertTeacherToCourse(courseClassTeachers);
    }

    @Override
    public int insertInstitute(List<Institute> institutes) {
        return addintroMapper.insertInstitute(institutes);
    }
}
