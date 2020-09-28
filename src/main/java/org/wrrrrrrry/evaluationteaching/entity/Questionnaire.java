package org.wrrrrrrry.evaluationteaching.entity;

import lombok.Data;

import java.util.List;

@Data
public class Questionnaire {
    private int id;
    private String title;
    private int indexRootId;
    private List<User> beEvaUsers;
    private List<User> evaUsers;
}
