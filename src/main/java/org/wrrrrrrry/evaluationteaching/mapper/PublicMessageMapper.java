package org.wrrrrrrry.evaluationteaching.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.wrrrrrrry.evaluationteaching.entity.*;

import java.util.List;

@Repository
public interface PublicMessageMapper {
    List<Clazz> selectStudentClassByCode(@Param("code") String code);

    List<Clazz> selectTeacherClassByCode(@Param("code") String code);

    List<Course> selectStudentCourseByCode(@Param("code") String code);

    List<Course> selectTeacherCourseByCode(@Param("code") String code);

    List<Power> selectPowerAll();

    List<Clazz> selectClassByName(@Param("name") String name);

    List<User> selectStudentByCode(@Param("code") String code);

    List<Course> selectCourseByName(@Param("name") String name);

    List<User> selectUserByCode(@Param("code") String code);

    List<Institute> queryInstitute(String name);
}
