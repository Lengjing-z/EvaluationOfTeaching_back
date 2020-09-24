package org.wrrrrrrry.evaluationteaching.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TeacherToTeacher {
    private int id;
    private int qnId;
    private int inId;
    private Date beginTime;
    private Date endTime;
}
