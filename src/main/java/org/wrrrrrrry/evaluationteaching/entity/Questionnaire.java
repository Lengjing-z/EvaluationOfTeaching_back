package org.wrrrrrrry.evaluationteaching.entity;

import lombok.Data;

@Data
public class Questionnaire {
    private int id;
    private String title;
    private int indexRootId;
    private boolean isFinished;
}
