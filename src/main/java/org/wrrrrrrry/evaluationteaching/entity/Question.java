package org.wrrrrrrry.evaluationteaching.entity;

import lombok.Data;

@Data
public class Question {
    private int id;
    private String content;
    private int qnId;
    private int indexEndId;
}
