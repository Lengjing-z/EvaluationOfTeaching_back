package org.wrrrrrrry.evaluationteaching.entity;

import lombok.Data;

@Data
public class Course {
    private int id;
    private String name;
    private boolean isMajor;
    private boolean isPublic;
}
