package org.wrrrrrrry.evaluationteaching.entity;

import lombok.Builder;
import lombok.Data;


import java.util.Date;

@Data
@Builder
public class TeacherToTeacher {
    private int id;
    private int qnId;
    private int inId;
    private Date beginTime;
    private Date endTime;
}
